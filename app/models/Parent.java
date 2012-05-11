package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Computer entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
public class Parent extends Model {
// For the demo we will have only one parent, whose id is therefore one.
    @Id
    public Long id;
    
    @Constraints.Required
    public String firstName;

	@Constraints.Required
	public String lastName;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date birthday;
    
    public boolean hasRequested;
    
    public String lastLatitude;
    public String lastLongitude;
    
    public String lastStart;
    public String lastEnd;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,Parent> find = new Finder<Long,Parent>(Long.class, Parent.class); 

	public void updateLatLon(String lat, String lon) {
		this.lastLatitude = lat;
		this.lastLongitude = lon;
		this.save();		
	}
	
	public void setHasRequested() {
		// Some crappy error handling 
		try {
			this.hasRequested = true;
			this.save();
		} catch (Exception e) {
			
		}
	}

	public void setLastDates(String start, String end) {
		this.lastStart = start;
		this.lastEnd = end;
		this.save();
	}

}

