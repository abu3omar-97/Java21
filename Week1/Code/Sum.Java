import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // CREATE A SCANNER INSTANCE

        int num1, num2; // DECLARE 2 ints

        System.out.println("ENTER 2 NUMBERS:"); // PROMPT MASSAGE
        num1 = input.nextInt(); // INPUT FOR NUMBER 1 (STORED IN num1)
        num2 = input.nextInt(); // INPUT FOR NUMBER 2 (STORED IN num2)

        int sum = num1 + num2; // DECLARE AND INITIALIZE SUM
        System.out.println("SUM = " + sum);

    }


}

