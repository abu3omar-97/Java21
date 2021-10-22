package OOP;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Palindrome problem1 = new Palindrome();
        problem1.number = 123321;
        boolean isPalindrome = problem1.isPalindrome();


        //
//        int[] surveyIDs = new int[10];
//        fillArray(surveyIDs);
//        System.out.println(Arrays.toString(surveyIDs));
//
//        System.out.println("SUM = " + sum(surveyIDs));
//        addValue(surveyIDs, 10);
//        System.out.println(Arrays.toString(surveyIDs));
//
//    }

//    static void fillArray(int a[]){
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i*2;
//        }
    }

    public static int sum(int values[]){
        int sum = 0;
        for(int value : values){
            sum+= value;
        }
        return sum;
    }

    public static void addValue(int arr[] , int valueToAdd){

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] += valueToAdd;
        }

    }

}
