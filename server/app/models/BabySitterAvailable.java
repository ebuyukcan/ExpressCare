package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.format.Formats;
import play.db.ebean.Model;

/**
 * Computer entity managed by Ebean
 */
@SuppressWarnings("serial")
@Entity 
public class BabySitterAvailable extends Model {

	@Id
	public Long id;

	@ManyToOne
	public BabySitter babySitter;

    @Formats.DateTime(pattern="yyyy-MM-dd HH-mm-ss")
	public Date startTime;
    
    @Formats.DateTime(pattern="yyyy-MM-dd HH-mm-ss")
    public Date endTime;
    
    public boolean requested;
    
    public boolean agreed;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,BabySitterAvailable> find = new Finder<Long,BabySitterAvailable>(Long.class, BabySitterAvailable.class); 
    
}

