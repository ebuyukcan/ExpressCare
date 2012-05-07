package controllers;

import play.libs.Akka;
import play.mvc.*;
import play.*;

import views.html.*;

import java.io.IOException;
import java.util.*;

import models.*;

public class Application extends Controller
{

	public static Result listAvailableBabySitters(String filter) {
		return ok(listBabySitters.render(BabySitter.all()));
		/*
            list.render(
                BabySitter.page(10, filter),
                filter
            ));*/
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
