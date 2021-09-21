package week8part5;

import javax.swing.*;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {

        int[][] schoolGrades = new int[5][10];
        // { {88,44,67,87}, {3,46,77,44} , {} , {} , {}  }
        System.out.println(schoolGrades.length);



        for (int classOfSchool = 0 ; classOfSchool < schoolGrades.length ; classOfSchool++ ){

            for (int studentOfClass = 0; studentOfClass < schoolGrades[classOfSchool].length ;studentOfClass++ )
            {
                schoolGrades[classOfSchool][studentOfClass] = Integer.parseInt(JOptionPane.showInputDialog( null, "PLEASE ENTER THE GRADE: "));
            }

        }



        for (int classOfSchool = 0 ; classOfSchool < schoolGrades.length ; classOfSchool++ ){

            for (int studentOfClass = 0; studentOfClass < schoolGrades[classOfSchool].length ;studentOfClass++ )
            {
                System.out.println(schoolGrades[classOfSchool][studentOfClass]);
            }

        }



    }
}
