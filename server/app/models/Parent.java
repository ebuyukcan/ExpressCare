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

    @Id
    public Long id;
    
    @Constraints.Required
    public String firstName;

	@Constraints.Required
	public String lastName;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date birthday;
    
    public double lastLatitude;
    public double lastLongitude;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,Parent> find = new Finder<Long,Parent>(Long.class, Parent.class); 
    
}

