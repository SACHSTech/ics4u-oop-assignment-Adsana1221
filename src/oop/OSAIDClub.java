package oop;

import oop.*;
import java.util.ArrayList;

public class OSAIDClub{

// attributes
private String clubDay;
private Teacher teacher;
private ArrayList<Student> students;

public OSAIDClub(String ClubDay, Teacher clubTeacher){

  clubDay = ClubDay;
  teacher = clubTeacher;

  // initialize the list of students in club
  students = new ArrayList<Student>();
}

public void addStudent(Student NewStudent){
  students.add(NewStudent);
}

public int getSize(){
  return students.size();
}






}