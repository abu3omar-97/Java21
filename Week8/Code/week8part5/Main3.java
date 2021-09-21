package week8part5;

import java.util.Arrays;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {

        int[] numbersToSort = {4,17,1,9,12,55};

        System.out.println(numbersToSort);

        System.out.println(Arrays.toString(numbersToSort));

        // SORT
        Arrays.sort(numbersToSort);

        System.out.println(Arrays.toString(numbersToSort));

        // DEC
        for (int i = 0 ; i<numbersToSort.length ; i++){
            numbersToSort[i] *= -1;
        }

        System.out.println("*-1 :" + Arrays.toString(numbersToSort));

        Arrays.sort(numbersToSort);

        for (int i = 0 ; i<numbersToSort.length ; i++){
            numbersToSort[i] *= -1;
        }

        System.out.println("*-1 (2) :" + Arrays.toString(numbersToSort));


        boolean is7Found = false;

        for (int i = 0 ; i<numbersToSort.length ; i++){
            if(numbersToSort[i] == 7) {
                is7Found = true;
                break;
            }
        }

        System.out.println("IS 7 FOUND? " + is7Found);

        int counterOfOdds = 0;
        for(int num : numbersToSort){
            if(num % 2 !=0){
                counterOfOdds++;
            }
        }

        System.out.println(counterOfOdds);

//        for (int i = 0; i<numbersToSort.length ; i++){
//            if(numbersToSort[i] % 2 !=0){
//                counterOfOdds++;
//            }
//        }


    }
}
