package Gym;

import java.util.Scanner;

public class Main {

    // “YOU HAVE THE FOLLOWING TWO OPTIONS 3-MONTHS OR 12-MONTHS “
    //--- 3 Months: 60JDs // ---12 Months: 160JDs
    //"WOULD YOU LIKE A PT (1-YES) - (2-NO)”
    //IF YES "HOW MANY SESSIONS PER WEEK? “
    //--- Each Session: 5JDs

    public static void main(String[] args) {

        // INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("YOU HAVE THE FOLLOWING OPTIONS 3-MONTHS [60JDS] OR 12-MONTHS [160JDS]");
        int numberOfMonths = input.nextInt();
        int totalPrice = 0;
        boolean hasPT = false;
        int numberOfSessionsPerWeek = 0;
        final double PRICE_PER_SESSION = 5;

            if(numberOfMonths != 3 && numberOfMonths != 12){
            System.out.println("ERROR!!! YOU CAN ONLY CHOOSE 3-M OR 12-M");
        }
        else{
            if(numberOfMonths == 3) {
                 totalPrice = 60;
            }
            else {
                totalPrice = 160;
            }

            System.out.println("WOULD YOU LIKE A PT (1-YES) - (2-NO)");
            hasPT = input.nextInt() == 1;

            if(hasPT) {
                System.out.println("HOW MANY SESSIONS PER WEEK?");
                numberOfSessionsPerWeek = input.nextInt();
                totalPrice += numberOfSessionsPerWeek * 4 * numberOfMonths * PRICE_PER_SESSION;
            }

            System.out.println("TOTAL PRICE = " + totalPrice + " \n HAVE A GOOD DAY!!!");

        }


    }

}
