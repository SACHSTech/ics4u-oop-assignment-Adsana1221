package oop;

/**
  * super class
  */
public class Members{
  
  private String firstName;
  private String lastName;
  private String gender;
  private String participatedEvents;

  /**
  * Constructor
  */

public Members(String FirstName, String LastName, String Gender, String ParticipatedEvents){
  firstName = FirstName;
  lastName = LastName;
  gender = Gender;
  participatedEvents = ParticipatedEvents;
}
public String getFirstName(){
        return firstName;
    }
    
public String getLastName(){
        return lastName;
    }
public String getGender(){
        return gender;
    }
    
 public String getParticipatedEvents(){
        return participatedEvents;
    }
}