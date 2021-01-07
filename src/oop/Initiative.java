package oop;

public class Initiative{

  // Instance Variables
  private String event;
  private String month;
  private int numofMembers;


  /**
  * Constructor 
  * @param Event - the name of the initiative
  * @param Month - when that event should be held
  * @param NumofMembers - the number of students responsible for an event
  */
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