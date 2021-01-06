package oop;

import oop.*;

public class Teacher extends Members{
  
  private String course;

  // Constructor
  public Teacher(String FirstName, String LastName, String Gender, String ParticipatedEvents, String Course){
    super(FirstName, LastName, Gender, ParticipatedEvents);
    this.course = Course;
  }

  public String getCourse(){
    return this.course;
  }
}