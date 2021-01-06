package oop;

public class OSAIDClub{

// attributes
private String clubDay;
private Teacher teacher;
private ArrayList<Student> students;

public OSAIDClub(String ClubDay, Teacher teacher){

  clubDay = ClubDay;
  teacher = Teacher;

  // initialize the list of students in club
  students = new ArrayList<Students>();
}

public void addStudent(Student NewStudent){
  students.add(NewStudent);
}

public int getSize(){
  return students.size();
}






}