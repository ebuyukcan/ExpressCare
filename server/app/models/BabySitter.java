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
public class BabySitter extends Model {

    @Id
    public Long id;
    
	@OneToMany(mappedBy="babySitter", cascade=CascadeType.ALL)
	public List<BabySitterAvailable> availability;
	
    @Constraints.Required
    public String firstName;

	@Constraints.Required
	public String lastName;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date birthday;
    
    public String video;
    
    public String basicInfo;
    
    public String description;
    
    public List<String> parentRecommendations;
    
    public List<String> sitterRecommendations;
    
    public List<String> friends;
    
    public String location;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,BabySitter> find = new Finder<Long,BabySitter>(Long.class, BabySitter.class); 
    
    /**
     * Return a page of computer
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<BabySitter> page(int pageSize, String filter) {
        return 
	        find.where().ilike("firstName", "%" + filter + "%").findPagingList(100).getPage(0);
//            find.where()
//                .ilike("firstName", "%" + filter + "%")
//                .orderBy(sortBy + " " + order)
//                .fetch("company")
//                .findPagingList(pageSize)
//                .getPage(page);
    }


	public static List<BabySitter> all() {
	  return find.all();
	}

	public static void create(BabySitter bs) {
	  bs.save();
	}

	public static void delete(Long id) {
	  find.ref(id).delete();
	}    

}

