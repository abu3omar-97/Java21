package machine;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ITEMS
        // Laban -> 0.5 JDS (10 ITEMS)
        // Kitkat -> 0.5 JDS (5 ITEMS)
        // Pepsi -> 0.25 JDS (0 ITEMS)
        // Cola -> 0.15 JDS (0 ITEMS)
        // Lays -> 0.10 JDS (5 ITEMS)

        // ITEMS DECLARATION
        final int LABAN = 10;
        final int KITKAT = 20;
        final int LAYS = 30;

        // PRICE OF EACH ITEM
        final double LABAN_PRICE = 0.5;
        final double KITKAT_PRICE = 0.5;
        final double LAYS_PRICE = 0.1;

        // WELCOME MSG
        System.out.println("WELCOME TO OUR MACHINE");


        // INPUT
        Scanner input = new Scanner(System.in);

        System.out.println("PLEASE ENTER SOME COINS"); // PROMPT MSG
        double amount = input.nextDouble();

        System.out.println("[10] Laban -> 0.5 JDS (10 ITEMS)\n" +
                "[20] Kitkat -> 0.5 JDS (5 ITEMS)\n" +
                "Pepsi -> 0.25 JDS (0 ITEMS)\n" +
                "Cola -> 0.15 JDS (0 ITEMS)\n" +
                "[30] Lays -> 0.10 JDS (5 ITEMS)");
        int itemNumber = input.nextInt();

//        System.out.println("AMOUNT: " + amount + " ITEM: " + itemNumber);

        String choice = "";
        boolean hasEnoughMoney = true;
        double priceOfChosenItem = 0;

        // PROCESS
        if (itemNumber == LABAN){
            choice = "LABAN";
            hasEnoughMoney =  amount >= LABAN_PRICE;
            priceOfChosenItem = LABAN_PRICE;
        }
        else if (itemNumber == KITKAT){
            choice = "KITKAT";
            hasEnoughMoney =  amount >= KITKAT_PRICE;
            priceOfChosenItem = KITKAT_PRICE;

        }
        else if (itemNumber == LAYS){
            choice = "LAYS";
            hasEnoughMoney =  amount >= LAYS_PRICE;
            priceOfChosenItem =  LAYS_PRICE;

        }
        else {
            choice = "ERROR";
        }

        double change = amount - priceOfChosenItem;

        if ( !choice.equals("ERROR") && hasEnoughMoney ){
            System.out.println("SUCCESS");
            System.out.println("YOUR CHOICE:  " + choice);
        }
        else {
            System.out.println("ERROR!!!");
        }
        System.out.println("CHANGE = " + change);



    }

}
