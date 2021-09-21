package week8part5;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        // 10 DEPARTMENTS
        // N EMPLOYEES
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_DEPARTMENTS = 3;
        double[][] salariesArray = new double[NUMBER_OF_DEPARTMENTS][];
        int numberOfAllEmp = 0;

        for (int dep = 0 ; dep<salariesArray.length; dep++) {
            System.out.println("PLEASE ENTER THE NUMBER OF EMPLOYEES IN DEP #" + (dep+1));
            int numberOfEmpolyees = input.nextInt();
            numberOfAllEmp += numberOfEmpolyees;
            salariesArray[dep] = new double[numberOfEmpolyees];
        }

        for (int dep = 0 ; dep<salariesArray.length; dep++) {
            for (int emp = 0; emp<salariesArray[dep].length; emp++){
                System.out.println("PLEASE ENTER THE SALARY FOR EMP#" + (emp+1) + " IN DEP#"+ (dep+1));
                double currentEmpSalary = input.nextDouble();
                salariesArray[dep][emp] = currentEmpSalary;
            }
        }



        double sumOfDeps[] = new double[NUMBER_OF_DEPARTMENTS];

        // SUM  FOR COMPANY AND DEPARTMENT
        for (int dep = 0 ; dep<salariesArray.length; dep++) {
            for (int emp = 0; emp < salariesArray[dep].length; emp++) {
                // INSIDE EACH DEPARTMENT
                sumOfDeps[dep] += salariesArray[dep][emp];
            }
        }

        double sumForCompnay = 0;
        for(double emp : sumOfDeps){
            sumForCompnay += emp;
        }

        // AVG
        double avgOfDeps[] = new double[NUMBER_OF_DEPARTMENTS];
        for (int i = 0; i < sumOfDeps.length; i++) {
            avgOfDeps[i] = sumOfDeps[i]/salariesArray[i].length;
        }

        System.out.println(Arrays.toString(avgOfDeps));
        System.out.println(sumForCompnay/numberOfAllEmp);

    }
}
