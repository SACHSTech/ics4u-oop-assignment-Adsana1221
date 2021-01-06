package oop;

import oop.*;

public class Student extends Members{
  // Instance Variable
  private int grade;

  // Class Variable
  private static int totalStudents = 0;

  /**
  * Constructor 
  * @param FirstName - the student's first name
  * @param LastName - the student's last name
  * @param Gender - the gender of the student
  * @param Participated Events - the event the student participated in
  */

  public Student(String FirstName, String LastName, String Gender, String ParticipatedEvents, Integer Grade){
    super(FirstName,LastName, Gender, ParticpatedEvents);
    this.grade = Grade;
    
    // Add a student
    totalStudents++;  

  }

  /**
  * create getter method for totalStudents
  @return total number of students added
  */
  public static int getTotalStudents(){
    return totalStudents;
  }

   /**
  * create getter method for the student's grade
  @return the value of the student's grade
  */
  public int getGrade(){
    return grade;
  }





}