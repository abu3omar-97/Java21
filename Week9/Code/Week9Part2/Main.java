package Week9Part2;

public class Main {
    public static void main(String[] args) {

        int ages[] = {22,33,44,55};

        // ENHANCED FOR LOOP
        for(int age : ages){
            System.out.println(age + 2);
        }

        // CLASSIC FOR LOOP
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            System.out.println(age+2);
        }


        char[] listOfchars = {'a' , 'b' , 'r'};

        for(char value : listOfchars){
            System.out.println((char) (value+1));
        }


    }
}
