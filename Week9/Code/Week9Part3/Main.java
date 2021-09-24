package Week9Part3;

public class Main {

    public static void main(String[] args) {

        // [x - y]
        int x = getX();
        int y = getY();

        for (int i = x; i <= y ; i++) {
            if(!isPrime(i) && isEven(i)) System.out.println(i);
        }

    }

    public static int getX() {
        System.out.println("GETTING X FROM THE DB...");
        return 10;
    }
    public static int getY() {
        System.out.println("GETTING Y FROM THE DB...");
        return 30;
    }

    public static boolean isEven(int number){
        return number%2==0;
    }

    public static boolean isPrime(int number){
        for(int i = 2 ; i<number ; i++){
            if(number%i == 0) return false;
        }
        return true;
    }

    public static int squared(int number){
        return (int) Math.pow(number,2);
    }

}
