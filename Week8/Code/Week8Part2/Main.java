package Week8Part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Read the grades for one hundred students,
        // then compute their average,
        // and find out how many grades are above the average,
        // then if the average is less than 60% add 2 marks to each grade.
        final int NUMBER_OF_STUDENTS = 5; // TODO: CHANGE TO 100
        int grade;
        Scanner input = new Scanner(System.in);

        // FIND THE AVG = SUM / NUMBER_OF_STUDENTS
        int sum = 0;


        for (int studentID = 1; studentID <= NUMBER_OF_STUDENTS ; studentID++) {
            System.out.println("PLEASE ENTER THE GRADE FOR STUDENT #"+ studentID);
            grade = input.nextInt();
            sum += grade; // sum = sum + grade;
        }

        double avg = sum / NUMBER_OF_STUDENTS;

        System.out.println("AVG: " + avg);


    }

}
