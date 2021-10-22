package OOP;

public class Methods {


    public static boolean isEven(int num){
        if(num % 2 == 0 ) return true;
        else return false;
    }
    public static boolean isEvenEnhanced(int num){
        return num%2==0;
    }

    public static String isEvenTernary(int num){
        String result = num%2==0 ? "YES IT'S EVEN" : "NO IT'S NOT";
        return result;
    }

    public static String getGreetingByUserGender(int gender){
        final int MALE = 1;
        final int FEMALE = 2;
        if(gender == MALE) return "HELLO SIR";
        return "HELLO MADAM";
        // return MALE == gender ? "HELLO SIR"  : "Hello MADAM";
    }

    public static void main(String[] args) {
        System.out.println(getGreetingByUserGender(1));
    }
}
