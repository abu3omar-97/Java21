package Uni;

import java.util.Calendar;

public class Course {
    // WHAT IT HAS?
    Student std;
    // STD INFO
    int stdID;
    String firstName;
    String lastName;
    String birthYear;
    double gpa;

    // Course Info
    int id;
    String name;
    double firstGrade , secondGrade=5, finalGrade;


    // WHAT IT DOES? (VERBS)
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    // TODO: REPLACE WITH GET METHOD
    public void printStudentInfo(){
        System.out.println("ID" + this.stdID + "\nFULL NAME: " + this.getFullName() + "\nGPA: " + gpa);
    }

    public int getAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        // Year.now().getValue()
        return currentYear - Integer.parseInt(this.birthYear);
    }

    public int getMarksToPass(){
        return 50 - (int) (this.firstGrade+this.secondGrade);
    }

    public char convertMarkToChar(){
        // TODO:  USE SWITCH (90+ A, 80+ B, 70+ C, 50+ D, 50- F)
        return 'A';
    }

    public boolean passedCourse(){
        return this.totalGrade() >= 50;
    }

    public boolean isGreaterThanGPA(){
        return true;
    }

    public double totalGrade(){
        return this.firstGrade + this.secondGrade + this.finalGrade;
    }


}
