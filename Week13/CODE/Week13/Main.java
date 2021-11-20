package Week13;

import MicroSoft.Excel;
import Shapes.Square;
import TV.Remote;

import javax.swing.*;
import java.util.Arrays;

public class Main {

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

        Excel excelFile = new Excel();
        System.out.println(excelFile.dateCreated);
        System.out.println(excelFile.dateModified);
        String fileName = JOptionPane.showInputDialog("FILE NAME");
        excelFile.fileName = fileName;
        excelFile.saveFile();
//        System.out.println(excelFile.dateModified);
//        fileName = JOptionPane.showInputDialog("FILE NAME");
//        excelFile.fileName = fileName;
//        excelFile.saveFile();
//        System.out.println(excelFile.dateModified);
        int data[] = {2,4,7,5};
        excelFile.fillCells(data);
        System.out.println("DATA: " + Arrays.toString(excelFile.cells));
        int data2[] = {2,4,7,5};
        excelFile.fillCells(data2);
        System.out.println("DATA: " + Arrays.toString(excelFile.cells));

        // DATA: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ....]
        // fillCells({2,4,7,5}, 0,4) ->
        // DATA: [2,4,7,5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ....]
        // fillCells({11,12}, 4, 6) ->
        // DATA: [2,4,7,5, 11, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, ....]

        Excel excelFile2 = new Excel(2,3);




    }
}
