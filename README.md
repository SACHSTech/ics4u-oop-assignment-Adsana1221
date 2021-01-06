[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3854615&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

[*see instructions for details*](Instructions.md)

*Insert Class Diagram here*  
![OOP Assignment.png](OOP Assignment.png)


## Summary
*Include a brief summary that describes your system that your are modelling*

The system that is being modelled is a school club, speicifically OSAID Club. This club is about bring awareness to the risks of impaired driving and how it can be avoided. THis club is very crucual becasue teenagers are very eager to drive, and prone to make poor impulsive decisions when it comes to alcohol/drugs. So OsaidClub would be the main class and would have instance variables teachers, students, initiatives and Positions. Teachers, students and initiaives would have a  "has a" relationship with the OsaidClub class. Positions would be it's own class that would have a "has a" relationship with students, which tracks the role and responsibilies of those students as they could be an executive or a general member. The teacher class would track what type of course they teach, as any teacher can be apart of this club and the students class would track what grade the student is in. The initiaves class would track the different events/activities planned, which month that specific event will be held in, and how many memebrs are in that subcommittee responsible for that event. Finally, both the teachers and students class would extend to a Members class which would be a "is a" relationship as both of them are mebers of the club. The Memebrs class would track the first and last anme, the gender and the events they participated in. 