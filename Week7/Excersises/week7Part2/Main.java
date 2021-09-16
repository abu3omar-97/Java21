package week7Part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 77 , 88 , 23
        // AVG = (77+88+23)/3
        System.out.println("ENTER THE NUMBER OF STUDENTS:");
        int numberOfStudents = input.nextInt();

        double grade = 0;
        double sum = 0;
        double avg = 0;

        for (int i = 0 ; i < numberOfStudents ; i++){
            System.out.println("ENTER THE STUDENT'S GRADE");
            grade = input.nextDouble();
            sum = sum + grade ;
        }

        avg = sum / numberOfStudents;
        System.out.println(avg);

        if(avg < 2.5) {
            System.out.println("CURVE");
        }

    }

    }
