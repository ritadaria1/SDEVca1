package models.projects;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;



// Project entity managed by Ebean
@Entity
public class Project extends Model {

    // Fields - note that these are defined as public and not private
    // During compile time, The Play Framework
    // automatically generates getters and setters
    @Id
    private Long id;

    // many to many mapping
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "projects")
    private List<Category> categories = new ArrayList<Category>();

    //@OneToOne(mappedBy="product")
    //public OrderItem item = new OrderItem();
    
    // List of category ids - this will be bound to checkboxes in the view form
    private List<Long> catSelect = new ArrayList<Long>();

    @Constraints.Required
    private String name;

   @Constraints.Required
    private String description;

    @Constraints.Required
    private String department;

  
    // Default constructor
    public  Project() {
    }

    // Constructor to initialise object
    public  Project(Long id, String name, String description, String department){
        this.id = id;
        this.name = name;
        this.description = description;
        this.department = department;
    }
	
	//Generic query helper for entity Computer with id Long
    public static Finder<Long,Project> find = new Finder<Long,Project>(Project.class);

    // Find all Projects in the database
    // Filter Employee name 
    public static List<Project> findAll(String filter) {
        return Project.find.query().where()
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }
    
    // Find all Projects for a category
    // Filter project name 
    public static List<Project> findFilter(Long catID, String filter) {
        return Project.find.query().where()
                        // Only include products from the matching cat ID
                        // In this case search the ManyToMany relation
                        .eq("categories.id", catID)
                        // name like filter value (surrounded by wildcards)
                        .ilike("name", "%" + filter + "%")
                        .orderBy("name asc")
                        .findList();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Long> getCatSelect() {
        return catSelect;
    }

    public void setCatSelect(List<Long> catSelect) {
        this.catSelect = catSelect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    

    
}

