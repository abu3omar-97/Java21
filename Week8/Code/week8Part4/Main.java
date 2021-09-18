package week8Part4;

import java.util.Calendar;
import java.util.Random;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        int number = 6592;
        int counter = 0; // numberOfTimesWeDividedBy10
        int sum = 0;

        int tempNumber = number;

        int max = 0;

        while(tempNumber>0){
            int lastDigitFromTheRight = tempNumber%10;
            sum += lastDigitFromTheRight;
            if(lastDigitFromTheRight>max) max = lastDigitFromTheRight;
            tempNumber = tempNumber/10;
            counter++;
        }

        System.out.println(number);
        System.out.println(counter);
        System.out.println(sum);
        System.out.println(max);













    }
}
