package oop;

import oop.*;

public class Teacher extends Members{
  // instance variable
  private String course;

  /**
  * Constructor 
  * @param FirstName - the student's first name
  * @param LastName - the student's last name
  * @param Gender - the gender of the student
  * @param Participated Events - the event the student participated in
  */
  public Teacher(String FirstName, String LastName, String Gender, String ParticipatedEvents, String Course){
    super(FirstName, LastName, Gender, ParticipatedEvents);
    this.course = Course;
  }

  public String getCourse(){
    return this.course;
  }
}