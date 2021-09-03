package javaBasics;

public class Main {

    public static void main(String[] args) {
        // A -> 80 - 100
        // B -> 65 - 79
        // C -> 55 - 64
        // D -> 50 - 54
        // F -> 0 - 49
        int grade = 70;

        if(grade>=80 && grade<=100) {System.out.println("A");}
        if(grade>=65 && grade<=79) {System.out.println("B");}
        if(grade>=55 && grade<=64) {System.out.println("C");}
        if(grade>=50 && grade<=54) {System.out.println("D");}
        if(grade>=0 && grade<=49) System.out.println("F");

    }
}
