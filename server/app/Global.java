
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.Play;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elif Buyukcan
 */

import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.api.Configuration;
import play.api.mvc.Result;
import play.mvc.Action;
import play.mvc.Http.Request;

public class Global extends GlobalSettings {

    @Override
	public void beforeStart(Application arg0) {
		// TODO Auto-generated method stub
		super.beforeStart(arg0);
	}

	@Override
	public play.mvc.Result onBadRequest(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return super.onBadRequest(arg0, arg1);
	}

	@Override
	public play.mvc.Result onHandlerNotFound(String arg0) {
		// TODO Auto-generated method stub
		return super.onHandlerNotFound(arg0);
	}

	@Override
	public Action onRequest(Request arg0, Method arg1) {
		// TODO Auto-generated method stub
		return super.onRequest(arg0, arg1);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
    public void onStart(Application app) {
        Logger.info("Application has started");
        
        Properties prop = new Properties();
        play.Configuration configuration = Play.application().configuration();
    }

    @Override
    public void onStop(Application app) {
        Logger.info("Application shutdown...");

        //EventLoggerFactory.getFactory().close();
    }
    
    //Handle different error / exception types and send mesage accordingly
    /*
    @Override
    public Result onError(Throwable t) {
    	return internalServerError( "An error occured");
    }
    */
}
