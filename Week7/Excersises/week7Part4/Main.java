package week7Part4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int secondMax = 0;
        int currentNumber = 0;

        for (int i = 1; i<= 5 ; i++){
            System.out.println("ENTER NUMBER :" + i);
            currentNumber = input.nextInt();
            if(currentNumber > max) {
                secondMax = max;
                max = currentNumber;
            }
            else if(currentNumber > secondMax) secondMax = currentNumber;
        }

        System.out.println("MAX = " + max);
        System.out.println("SECOND MAX = " + secondMax);

    }

    }
