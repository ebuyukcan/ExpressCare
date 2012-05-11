package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import models.BabySitter;
import models.BabySitterAvailable;
import models.Parent;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
public class Application extends Controller
{


	public static Result listAvailableBabySitters(String latitude, String longitude, String start, String end, String mobile) {
//		Ebean.getServer(null).getAdminLogging().setDebugGeneratedSql(true);
		boolean renderMobile = Boolean.parseBoolean(mobile);
		if (start.equals("")) start = "2012/05/09";
		if (end.equals("")) end = "2012/05/10";
		Date startDate = null;
		Date endDate = null;
		Parent p = Parent.find.all().get(0);
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
// FIXME FIXME
		boolean loadStart = false;
		boolean loadEnd = false;
		try {
			startDate = formatter.parse(start);
			Logger.debug("Parsed the start date! " + start);
		} catch (Exception e) {
			Logger.error("Failed to parse start date");
			 startDate = new Date();
//			loadStart = true;
		}
		if (loadStart) {
			try {
				startDate = formatter.parse(p.lastStart);
				Logger.error("set start to: " + startDate);			
			} catch (Exception e) {
				Logger.error("failed to set start");
			} 
		}

		try {
			endDate = formatter.parse(end);
			Logger.debug("Parsed the end date! " + end);
		} catch (Exception e) {
			Logger.error("Failed to parse end date");
//			endDate = formatter.parse(p.lastEnd);
			Logger.error("set end to: " + endDate);
			endDate = new Date();
//			loadEnd = true;
		}

		if (loadEnd) {
			try {
				endDate = formatter.parse(p.lastEnd);
				Logger.error("set end to: " + endDate);			
			} catch (Exception e) {
				Logger.error("failed to set end");
			}
		}
/*
		Parent.find.all().get(0).delete();
		p = new Parent();
		p.id = 1L;
		p.lastStart = formatter.format(startDate);
		p.lastEnd = formatter.format(endDate);
		p.save();*/
//		p.setLastDates(formatter.format(startDate), formatter.format(endDate));
		
		if (!latitude.equals("0") && !longitude.equals("0")) {
			// Update the user's model to include the latest lat & lon
//			Parent.find.all().get(0).updateLatLon(latitude, longitude);
			// I could not get the update working and the google did not help me :(. Maybe some problems with
			// the cache or something? We should have started with the Play 1.2.x version instead of this 
			// "brand new, not so polished" 2.x...
			Parent.find.all().get(0).delete();
			p = new Parent();
			p.id = 1L;
			p.lastLatitude = latitude;
			p.lastLongitude = longitude;
			p.save();
		}

		Logger.debug("Got the parameter: " + latitude +":" + longitude + ", start: " + startDate + ", end: " + endDate);		
		if (!renderMobile) {
			return ok(listBabySitters.render(BabySitter.find(Double.parseDouble(latitude), Double.parseDouble(longitude), startDate, endDate)));
		} else {
			return ok(listBabySittersMobile.render(BabySitter.find(Double.parseDouble(latitude), Double.parseDouble(longitude), startDate, endDate)));
		}
	}
	
	public static Result addBabysitter()
	{
		return ok();
	}

	public static Result index()
	{
		// Get the first result, which is our test user's account.
		// My eclipse gives an error about this, because it thinks that the scala template wants a String
		// instead of a Parent... Strange.
		return ok(search.render(Parent.find.all().get(0)));
	}
	
	public static Result indexMobile()
	{
		//return ok();
		return ok(searchMobile.render("This is the default controller"));
	}
	
	public static Result addNewBabysitter()
	{
		return ok(addBabysitter.render("This is the default controller"));
	}
	
	public static Result emergencyList() 

	{

	    String start = "2012/05/09";
		String end = "2012/05/10";

		Date startDate = null;
		Date endDate = null;
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");

		try {
			startDate = formatter.parse(start);
			Logger.debug("Parsed the start date! " + start);
		} catch (Exception e) {
			Logger.error("Failed to parse start date");
			startDate = new Date();
		}

		try {
			endDate = formatter.parse(end);
			Logger.debug("Parsed the end date! " + end);
		} catch (Exception e) {
			Logger.error("Failed to parse end date");
			endDate = new Date();
		}

	  return ok(emergencyList.render(BabySitter.find(0, 0,startDate,endDate))) ;
	}
    
    public static Result getBabysitter(String id)
    {
		//return ok();
    	return ok(viewBabysitter.render(BabySitter.getSitter(id)));
    }
    
    //TODO Ids for availability are also needed here
    public static Result contactBabysitter(String id)
    {
    	return ok(contactBabysitter.render(BabySitterAvailable.findById(Long.parseLong(id))));
    }
    
    public static Result contactBabysitterMobile(String id)
    {
    	return ok(contactBabysitterMobile.render(BabySitterAvailable.findById(Long.parseLong(id))));
    }

    //TODO Ids for availability should be used here, not sitter ids!
    public static Result requestSitter(String id, String mobile)
    {
    	if (id.equals(""))
    		return redirect("/");
    	boolean mobileMode = Boolean.parseBoolean(mobile);
      	//System.out.println("uri= " + request().uri() + " " + request().path() + " " + request().queryString().get("latitude"));
    	BabySitterAvailable bs = BabySitterAvailable.findById(Long.parseLong(id));
        bs.setRequested();

        Parent p = null;
        try {
        	p = Parent.find.all().get(0);
        } catch (Exception e) {
        	// NOOP
        }
        if (p != null)
        	p.setHasRequested();
    	
    	flash("success", bs.babySitter.firstName + " " + bs.babySitter.lastName + " has been requested. You will be contacted shortly.");

    	return redirect("/listBabySitters" + (mobileMode ? "?mobile=true" : ""));
    	//return ok(listBabySitters.render(BabySitter.find(Double.parseDouble(latitude), Double.parseDouble(longitude), startDate, endDate)));
    }
    
    //TODO Ids for availability should be used here, not sitter ids!
    public static Result agreeSitter()
    {
    	String id = (String) request().body().asFormUrlEncoded().get("id")[0];
    	BabySitterAvailable bs = BabySitterAvailable.findById(Long.parseLong(id));
    	Logger.debug("Babysitter isAgreed: " + bs.agreed);
    	if (!bs.agreed) { 
    			bs.setAgreed();
    			//    	BabySitterAvailable.setAgreed(id);
    			flash("success", bs.babySitter.firstName + " " + bs.babySitter.lastName + " has been agreed. " + bs.babySitter.firstName + " will call you soon and then you can set the details.");
    	}
    	//return ok(listBabySitters.render(BabySitter.find(Double.parseDouble(latitude), Double.parseDouble(longitude), startDate, endDate)));
    	return redirect("/");
    }
    
    

}
