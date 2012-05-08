package controllers;

import java.util.Date;

import models.BabySitter;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.listBabySitters;
import views.html.search;

import com.avaje.ebean.Ebean;

public class Application extends Controller
{

	public static Result listAvailableBabySitters(String filter) {
//		Ebean.getServer(null).getAdminLogging().setDebugGeneratedSql(true);
		return ok(listBabySitters.render(BabySitter.find("here", new Date(), new Date())));
	}

	public static Result index()
	{
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
