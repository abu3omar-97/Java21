package Week5;

public class Main {
    public static void main(String[] args) {

        int num1 = 312329; // 31232(3)
        int num2 = 34521; // 3452(9)

        // PROBLEM #1 -> GET THE LAST DIGIT OF NUM1 AND NUM2
           int lastDigitOfNum1 = num1 % 10;
           int lastDigitOfNum2 = num2 % 10;


 if (num1 >= 0 && num2 >= 0 ){
     if(lastDigitOfNum1 > lastDigitOfNum2) {
         System.out.println( num1/10 + "(" + lastDigitOfNum1 + ") IS BETTER THAN " + num2/10 +  "(" + lastDigitOfNum2 + ")");
     }
     else {
         System.out.println( num2 + " IS BETTER THAN " + num1);
     }
 }
 else {
     System.out.println("NO NEGATiveE NUMBERS");
 }

    }
}
