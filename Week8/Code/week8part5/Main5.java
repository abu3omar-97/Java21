package week8part5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER X, Y , Z WHERE (X<Y<Z)");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // TODO: CHECK IF X < Y < Z

        while (!(z > y && z > x && y > x)) {
            System.out.println("ERROR!!! PLEASE ENTER X, Y , Z AGAIN WHERE (X<Y<Z)");
            x = input.nextInt();
            y = input.nextInt();
            z = input.nextInt();
        }

            if (z - y > y - x) {
                for (int i = x; i <= y; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = y; i <= z; i++) {
                    System.out.println(i);
                }
            }



    }

}
