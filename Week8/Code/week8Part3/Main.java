package week8Part3;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // DECLARING AN ARRAY OF INTEGERS
        final int SIZE = 12;
        int[] temps = new int[SIZE];

        // TO GENERATE A RANDOM NUMBER
        Random rand = new Random();
        int randomNumber = 0;

        // DATA COLLECTION
        for (int i = 0 ; i< temps.length ; i++) {
            randomNumber = rand.nextInt(10);
            temps[i] = randomNumber;
        }

        System.out.println(Arrays.toString(temps));


        // 1 - 3 (quarter1)
        // 4 - 6 (quarter2)
        // 7 - 9 (quarter3)
        // 10 - 12 (quarter4)

//        double quarter1 = 0; // 9, 7, 2
//        double quarter2 = 0; // 2, 3, 4
//        double quarter3 = 0; // 9, 7, 9
//        double quarter4 = 0; // 1, 6, 4

        double[] quarters = {0,0,0,0};

        // QUARTERS
        for (int month = 0 ; month< temps.length ; month++)
        {
            if(month < 3){
                // quarter1 = temps[0] + temps[1] + temps[2];
                quarters[0] += temps[month];
            }
            else if (month >= 3 && month < 6){
                quarters[1] += temps[month];
            }
            else if(month >= 6 && month < 9){
                quarters[2] += temps[month];
            }
            else {
                quarters[3] += temps[month];
            }

        }

        System.out.println(Arrays.toString(quarters));

        double  totalTempsInAYear = 0;

        // FIND MIN QUARTER
        double minQuarter = quarters[0];
        int minQuarterIndex = 0;
        for (int quarterIndex = 1 ; quarterIndex< quarters.length ; quarterIndex++ ){
            if(quarters[quarterIndex] < minQuarter) {
                minQuarter = quarters[quarterIndex];
                minQuarterIndex = quarterIndex + 1;
            }
             totalTempsInAYear = quarters[quarterIndex];
        }

        System.out.println(minQuarter);
        String notification = "THE COLDEST QUARTER IN AMMAN IS: " + (int) minQuarterIndex;
        JOptionPane.showMessageDialog(null, notification);
        System.out.println("AVG: " + totalTempsInAYear/SIZE);

    }
}
