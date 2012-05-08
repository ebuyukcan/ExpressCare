package controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import models.BabySitter;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.listBabySitters;
import views.html.search;

public class Application extends Controller
{

	public static Result listAvailableBabySitters(String where, String start, String end) {
//		Ebean.getServer(null).getAdminLogging().setDebugGeneratedSql(true);
		if (start.equals("")) start = "2012/05/04";
		if (end.equals("")) end = "2012/05/10";
		Date startDate = null;
		Date endDate = null;
		DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		try {
			startDate = formatter.parse(start);
			Logger.debug("Parsed the start date!");
		} catch (Exception e) {
			Logger.debug("Failed to parse start date");
			startDate = new Date();
		}

		try {
			endDate = formatter.parse(end);
			Logger.debug("Parsed the end date!");
		} catch (Exception e) {
			Logger.debug("Failed to parse end date");
			endDate = new Date();
		}

		Logger.debug("Got the parameter: " + where + ", start: " + startDate + ", end: " + endDate);
		return ok(listBabySitters.render(BabySitter.find("here", startDate, endDate)));
	}

	public static Result index()
	{
		Logger.debug("at index");
		return ok(search.render("This is the default controller"));
	}
    
    public static Result getSitter()
    {
		return ok();
    }

    public static Result requestSitter()
    {
    	return ok();
    }

}
