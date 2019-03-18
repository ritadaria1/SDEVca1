package models.users;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.*;


@Entity
@DiscriminatorValue("customer")
public class Customer extends User {



 
    
	
    public Customer(String email, String password, String fName, String lName) {

        super(email, password, fName, lName);
    }
   

  
}