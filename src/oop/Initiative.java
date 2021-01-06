package oop;

public class Initiative{

  // Instance Variables
  private String event;
  private String month;
  private int numofMembers;

// Constructor
public Initiative(String Event, String Month, int NumofMembers){
  this.event = Event;
  this.month = Month;
  this.numofMembers = NumofMembers;
}

public String getEvent(){
  return event;
}

public String getMonth(){
  return month;
}

public int getNumofMembers(){
  return numofMembers;
}
}