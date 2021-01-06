package oop;

public class Positions{

  String role;
  String responsibilities;

  public Positions(String Role, String Responsibilies){

    this.role = Role;
    this.responsibiliites = Responsibilities;
    
  }

  public String toString(){
    return this.role + " " + this.responsibiliites;
  }
}