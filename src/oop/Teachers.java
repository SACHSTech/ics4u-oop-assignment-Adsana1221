package oop;

import oop;

public class Teacher extends Members{
  
  private String course;

  // Constructor
  public Teacher(String FirstName, String LastName, String Gender, String ParticipatedEvents, String Course){
    super(firstName, lastName, gender, participatedEvents);
    this.course = Course;
  }
}