package OOP;

public class Palindrome {

 public static boolean isPalindrome(int num){
        return num == numberReversed(num);
    }

    public static int numberReversed(int num){
        int reversed = 0;
        while(num != 0){
            int lastDigit = (num % 10);
            num /= 10;
            reversed *= 10 +  lastDigit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        // 1221 -> TRUE
        // 123321 -> TRUE
        // 12321 -> TRUE
        // 343232 -> FALSE

        int num = 123;
        System.out.println(isPalindrome(num));

    }
}
