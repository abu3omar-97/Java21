package week7Part6;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
String x= JOptionPane.showInputDialog("who many employees do you have?...");
int EmployeNumber=Integer.parseInt(x);
        int counter=0;
        int max=0;
        int totalsalary=0;

        int sum = 0;
        for(int i = 0; i<=EmployeNumber; i++) {


    String salary = JOptionPane.showInputDialog("what is the salary?");
    int costsalary = Integer.parseInt(salary);
    sum = sum + costsalary;
    if(costsalary>max) {
        max = costsalary;
    }

    }

        totalsalary=sum/EmployeNumber;
        System.out.println(max);

}




}



