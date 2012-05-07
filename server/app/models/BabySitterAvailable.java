package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class BabySitterAvailable extends Model {

	@Id
	public Long id;

	// @OneToMany(mappedBy="BabySitterAvailable", cascade=CascadeType.ALL)
	@ManyToOne
	public BabySitter babySitter;

    @Formats.DateTime(pattern="yyyy-MM-dd HH-mm-ss")
	public Date startTime;
    
    @Formats.DateTime(pattern="yyyy-MM-dd HH-mm-ss")
    public Date endTime;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,BabySitterAvailable> find = new Finder<Long,BabySitterAvailable>(Long.class, BabySitterAvailable.class); 
    
}

