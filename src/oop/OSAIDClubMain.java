package oop;

import oop.*;

public class OSAIDClubMain{

  public static void main(String[] args){
    Student Sarah = new Student("Sarah", "Rogers", "Girl", "online pledge", 10, new Positions("General","make template") );

    Teacher Smith = new Teacher("Tony", "Smith", "Boy", "Holiday Bingo", "Chemistry" );

    Initiative OnlinePledge = new Initiative("Online Pledge", "September", 4);


    System.out.println(Sarah.getFirstName());
    System.out.println(Smith.getLastName());
    System.out.println(OnlinePledge.getEvent());

    OSAIDClub Tuesday = new OSAIDClub("Tuesday", Smith);
    Tuesday.addStudent(Sarah);
 
  Student Mark = new Student("Mark", "Brown", "Boy", "Virtual Game", 10, new Positions("General","make rules") );
    Tuesday.addStudent(Mark);

    System.out.println(Tuesday.getSize());


    
  }
}