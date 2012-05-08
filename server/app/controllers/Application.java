package controllers

import java.util.Date;
import com.avaje.ebean.Ebean;

import play.mvc.*;
import play.*;

import views.html.*;

import java.io.IOException;
import java.util.*;

import models.*;

public class Application extends Controller
{

	public static Result listAvailableBabySitters(String filter) {
//		Ebean.getServer(null).getAdminLogging().setDebugGeneratedSql(true);
		return ok(listBabySitters.render(BabySitter.find("here", new Date(), new Date())));
	}
	
	public static Result addBabysitter()
	{
		return ok();
	}

	public static Result index()
	{
		return ok(search.render("This is the default controller"));
	}
	
	public static Result addNewBabysitter()
	{
		return ok(addBabysitter.render("This is the default controller"));
	}
    
    public static Result getBabysitter(String id)
    {
		//return ok();
    	return ok(viewBabysitter.render(BabySitter.getSitter(id)));
    }

    public static Result requestSitter()
    {
    	return ok();
    }



}
