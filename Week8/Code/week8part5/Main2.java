package week8part5;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        // RED - BLUE - RED - BLUE ....

        final int SIZE = 8;
        String[] color = new String[SIZE];

        for(int i = 0 ; i<SIZE ; i++){
            if(i % 2 == 0 ){
                color[i] = "RED";
            }
            else {
                color[i] = "Blue";
            }
        }

        System.out.println(Arrays.toString(color));



    }
}
