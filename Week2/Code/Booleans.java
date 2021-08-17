import java.util.Scanner;

public class Booleans {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;
        System.out.println("PLEASE ENTER A AND B");
        a = input.nextInt(); // INPUT FOR a
        b = input.nextInt(); // INPUT FOR b
        boolean isAGreaterThanB = a > b; // IS a greater than b ?
        System.out.println("THE RESULT: " + isAGreaterThanB);

        // EXAMPLE 2
        int age = input.nextInt();
        boolean isIn20s = age>=20 && age<30; // FROM 20 to 29
        System.out.println("THE RESULT: " + isIn20s);



    }
}
