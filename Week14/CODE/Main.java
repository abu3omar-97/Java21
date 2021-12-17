package Week14;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//        OverLoading obj = new OverLoading();
//        System.out.println(obj.sum(1,1,1,1));

//        SimpleCalculator yamansCalc = new SimpleCalculator(2,34);

            StaticExamples ex1 = new StaticExamples();
            StaticExamples ex2 = new StaticExamples();
            StaticExamples ex3 = new StaticExamples();

            Book java1 = new Book("JAVA 1 BASICS" , "11110101010101" , 23);
            Book english1 = new Book("English 1 BASICS" , "1123101010101" , 23);
            Book english2 = new Book("English 1 BASICS" , "1123101010101" , 23);
            Book english3 = new Book("English 1 BASICS" , "1123101010101" , 23);
        System.out.println(java1.numberOfBooks);
        System.out.println(english1.numberOfBooks);
    }
}
