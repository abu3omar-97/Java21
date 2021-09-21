package week8part5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] grades = new int[10];

        Random rand = new Random();
        int total = 0;

        for(int i=0; i<grades.length ; i++){
            grades[i] = rand.nextInt(100);
            total += grades[i];
        }

        System.out.println("TOTAL: " + total/grades.length);

        System.out.println(Arrays.toString(grades));

        for (int index = 0; index<grades.length ; index++){
            if(grades[index] < 60)
            grades[index] = grades[index] + 2;
        }

        System.out.println(Arrays.toString(grades));


    }
}
