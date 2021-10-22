package Uni;

import java.time.Year;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Course mathAhmad = new Course();
        // STD INFO
        mathAhmad.stdID = 111;
        mathAhmad.firstName = "Ahmad";
        mathAhmad.lastName = "Mohammad";
        mathAhmad.birthYear = 2001+"";
        mathAhmad.gpa = 70;

        Course oopKhalid = new Course();
        oopKhalid.stdID = 112;
        oopKhalid.firstName = "Khalid";
        oopKhalid.lastName = "Mohammad";
        oopKhalid.birthYear = "1999";
        oopKhalid.gpa = 90;

        mathAhmad.firstGrade = 15;
        mathAhmad.secondGrade = 10;
        oopKhalid.firstGrade = 19;

        System.out.println(mathAhmad.secondGrade);
        System.out.println(oopKhalid.secondGrade);



//        System.out.println(mathAhmad.getMarksToPass());
//        System.out.println(oopKhalid.getMarksToPass());


//
//        if(mathAhmad.getAge() > oopKhalid.getAge()){
//            System.out.println("AHMAD IS OLDER");
//        }
//        else {
//            System.out.println("AHMAD IS YOUNGER");
//        }


        Student ahmad = new Student();
        ahmad.firstName = "Omar";

        Course math = new Course();
        math.std = ahmad;

        System.out.println(math.std.firstName);



    }
}
