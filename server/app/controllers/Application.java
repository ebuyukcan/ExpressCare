package controllers;

import play.libs.Akka;
import play.mvc.*;

import views.html.*;

import java.io.IOException;
import java.util.*;

public class Application extends Controller
{

	public static Result index()
	{
		return ok(index.render("This is the default controller"));
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
