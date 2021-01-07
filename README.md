[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3854615&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

[*see instructions for details*](Instructions.md)

*Insert Class Diagram here*  
![OOP Assignment (2)](https://user-images.githubusercontent.com/74546502/103834092-7bd38e80-5050-11eb-9080-8245b505fb33.png)


## Summary
*Include a brief summary that describes your system that your are modelling*

The system that is being modelled is a school club, speicifically OSAID Club. This club is about bringing awareness to the risks of impaired driving and how it can be avoided. This club is very crucial because teenagers are very eager to drive, and are prone to making poor decisions when it comes to alcohol/drugs. So OsaidClub would be the main class and would have the attributes; teacher, students, and clubDay, which means what day of the week the club is held. This class would track how many students are in this club. Teacher and students would have a "has a" relationship with the OsaidClub class. Positions would be it's own class that would have a "has a" relationship with students, which tracks the role and responsibilies of those students as they could be an executive or a general member. The teacher class would track what type of course they teach, as any teacher can be apart of this club and the students class would track what grade the student is in. The initiaves class is a separate class that would track the different events/activities planned, which month that specific event will be held in, and how many members are in that subcommittee responsible for that event. Finally, both the teacher and students class would extend to a Members class which would be a "is a" relationship as both of them are members of the club. The Members class would track the first and last name, the gender and the events they participated in. 