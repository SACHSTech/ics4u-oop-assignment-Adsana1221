package oop;

public class Positions{


// instance variables
  private String role;
  private String responsibilities;

 /**
  * Constructor 
  * @param Role - whether the student is an exec or general member
  * @param Responsibilities - the student's duty in that position
  */
  public Positions(String Role, String Responsibilities){

    this.role = Role;
    this.responsibilities = Responsibilities;
    
  }

  public String toString(){
    return this.role + " " + this.responsibilities;
  }
}