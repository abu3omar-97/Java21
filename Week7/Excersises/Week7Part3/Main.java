package Week7Part3;

public class Main {

    public static void main(String[] args) {

        // PRINT ALL PRIME NUMBERS FROM X TO Y
        // PRINT PRIME
        // PRINT FROM X TO Y (50 - 90)
        int x = 1;
        int y  = 15;
        for(int i = x ; i<= y ; i++)
        {
            int num = i;
            boolean isPrime = true;

            for(int j = 2 ; j<num ; j++){
                if(num%j == 0)   {
                    isPrime = false;
                }
            }

            if (isPrime) System.out.println(num);
        }



    }
    }
