package Week9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int age = getInputFromUserWithPromptMsg("ENTER UR AGE: ");
        int temp = getInputFromUserWithPromptMsg("ENTER THE TEMP: ");
        int bd = getInputFromUserWithPromptMsg("ENTER THE BIRTH DAY: ");

        int by = 2021 - age;
        System.out.println(by);

        boolean containsM = contains("AHMAD", "M");

    }



    public static boolean contains(String stringToCheck, String charToFind){
        for (char charValue : stringToCheck.toCharArray()){
            if(charValue+"" == charToFind) return true;
        }
        return false;
    }

    public static int getInputFromUserWithPromptMsg(String msg){
        System.out.println(msg);
        Scanner input = new Scanner(System.in);
        int userInput = (int) (input.nextDouble());
        return userInput;
    }

    public static int sumOf3Numbers(double yaman, double num2, double num3){
        System.out.println("YAMAN");
        return (int) (yaman + num2 + num3);
    }

}
