package oop;

/**
  * super class
  */
public class Members{
  // instance variables
  private String firstName;
  private String lastName;
  private String gender;
  private String participatedEvents;

  
  /**
  * Constructor 
  * @param FirstName - the student's first name
  * @param LastName - the student's last name
  * @param Gender - the gender of the student
  * @param Participated Events - the event the student participated in
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