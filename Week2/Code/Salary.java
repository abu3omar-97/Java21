import java.util.Scanner;


public class Salary {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // CREATE AN INSTANCE FROM SCANNER
        // Input: hourly rate, weekly hours (A month has 4 weeks), month overtime (overtime hours are paid one and a half)
        // What is your standard hourly pay rate?
        // How many hours do you work in a week (without overtime)?
        // How many hours do you work as over time per month?

        // VAR's FOR INPUT
        double hourRate = 0;
        int hoursPerWeek = 0;
        int overTimeHours = 0;

        // GETTING INPUT FROM THE USER
        System.out.println("What is your standard hourly pay rate?");
        hourRate = input.nextDouble();
        System.out.println("How many hours do you work in a week (without overtime)?");
        hoursPerWeek = input.nextInt();
        System.out.println("How many hours do you work as over time per month?");
        overTimeHours = input.nextInt();

        // CONDITIONS (BOOLEANS)
        // Print True if the user has worked for overtime, and false otherwise
        // Print True if the user earns more than $400 per month

        boolean isOverTime = overTimeHours > 0;
//        final int MAX_WORK_HOURS = 40;
//        int totalTime = 60; // FROM THE USER
//        boolean isOverTime = totalTime > MAX_WORK_HOURS;
//        int overTimeHours = totalTime - MAX_WORK_HOURS;

        // CALCULATING TOTAL SALARY
        final int weeksInASingleMonth = 4; // A month has 4 weeks
        int hoursPerMonth = hoursPerWeek * weeksInASingleMonth;
        double overTimeEarnings = (hourRate * 1.5) * overTimeHours;
        double totalSalary = (hoursPerMonth * hourRate) + overTimeEarnings;

        boolean earnsMoreThan400 = totalSalary > 400;

        // YOU HAVE WORKED FOR {120} HOURS THIS MONTH, WITH {10} HOURS OVERTIME, YOUR OVERTIME EARNINGS WAS {123} JDS, AND THE TOTAL SALARY IS {1000}JDS. GOODBYE!
        System.out.println("YOU HAVE WORKED FOR " + (hoursPerMonth + overTimeHours) + " HOURS THIS MONTH,\n WITH " + overTimeHours + " HOURS OVERTIME \n , YOUR OVERTIME EARNINGS WAS " + overTimeEarnings + "JDS,\n AND THE TOTAL SALARY IS " + totalSalary);
        System.out.println("GOODBYE!!!");


    }
}



