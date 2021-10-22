package Uni;

public class Loops {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        int sum2 = 0;
        for (int grade: arr) {
            sum2+= grade;
        }


    }
}
