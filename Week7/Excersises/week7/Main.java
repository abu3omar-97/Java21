package week7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random rand = new Random();
	// int randomNum = rand.nextInt((max - min) + 1) + min;
    // 100 - 999 (DIV BY 5)

//    int randomNumber = rand.nextInt(999 - 100 + 1) + 100;
//    boolean isDivBy5 = randomNumber % 5 == 0;
//    int counter = 0;

    String day = "Friday";
    int randCharIndex = rand.nextInt(day.length());
    char randomChar = day.charAt(randCharIndex);

        System.out.println("ORIGINAL STRING: " + day + " RANDOM INDEX:" + randCharIndex + " RANDOM CHAACTER: " + randomChar);



    }
}
