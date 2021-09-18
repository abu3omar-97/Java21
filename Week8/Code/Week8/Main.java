package Week8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // b * b * b .... e times

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE BASE");
        int base = input.nextInt();
        System.out.println("PLEASE ENTER THE EXP");
        int exp = input.nextInt();

        int pow = 1;

        // PROCESS
        for(int i = 1; i<=exp ; i++){
            pow *= base;
        }

        System.out.println(base + "^" + exp + " = " + pow);


    }

}
