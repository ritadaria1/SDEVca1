package models.projects;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// Project entity managed by Ebean
@Entity
public class Category extends Model {

    // Fields - note that these are defined as public and not private
    // During compile time, The Play Framework
    // automatically generates getters and setters


    @Id
    private Long id;

    @Constraints.Required
    private String name;

    // Category contains many projects
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> projects; // = new ArrayList<Project>();

    // Default constructor
    public  Category() {
    }

    public  Category(Long id, String name, List<Project> projects) {
			this.id = id;
			this.name = name;
			this.projects = projects;
    }

	//Generic query helper for entity Computer with id Long
    public static Finder<Long,Category> find = new Finder<Long,Category>(Category.class);
    
    //Find all Projects in the database
    public static List<Category> findAll() {
        return Category.find.query().where().orderBy("name asc").findList();
    }

	// Generate options for an HTML select control
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Category c: Category.find.query().orderBy("name").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }
    

    // Check if a project is in a category
    public static boolean inCategory(Long category, Long project) {
        return find.query().where()
            .eq("projects.id", project)
            .eq("id", category)
            .findCount() > 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}

