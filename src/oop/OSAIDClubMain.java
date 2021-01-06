package oop;

import oop.*;

public class OSAIDClubMain{

  public static void main(String[] args){
    Student Sarah = new Student("Sarah", "Rogers", "Girl", "online pledge", 10,new Position("General","make proposal") );

    Teacher Smith = new Teacher("Tony", "Smith", "Boy", "Holiday Bingo", "Chemistry" );

    Initiative VirtualGame = new Initiative("Virtual Game", "September", 4);

    System.out.println(Sarah.getFirstName());
    System.out.println(Smith.getLastName());
    System.println(VirtualGame.getEvent());

    OSAIDClub Tuesday = new OSAIDClub(Tuesday, Smith);
    Tuesday.addStudent(Sarah);

    System.out.println(Tuesday.getSize());
  }
}