package oop;

public class Positions{

  String role;
  String responsibilities;

  public Positions(String Role, String Responsibilities){

    this.role = Role;
    this.responsibilities = Responsibilities;
    
  }

  public String toString(){
    return this.role + " " + this.responsibilities;
  }
}