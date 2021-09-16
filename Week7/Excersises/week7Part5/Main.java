package week7Part5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String choice = "";
            String name = JOptionPane.showInputDialog("WHATS YOUR NAME?");
        while (!choice.contains("thanks")) {
            JOptionPane.showMessageDialog(null, "HELLO, " + name + " I AM A CHATBOT 💻... ");

            choice = JOptionPane.showInputDialog("HOW CAN I HELP YOU?");

            boolean ismMenu = choice.contains("menu") || choice.contains("food");
            boolean isDelivery = choice.contains("delivery") || choice.contains("car") || choice.contains("amman");
            boolean isJobs = choice.contains("job") || choice.contains("career") || choice.contains("salary");

            if (ismMenu) {
                JOptionPane.showMessageDialog(null, "OUR MENU: CHICKEN 90JDS , BURGER 100 JDS");
            }
            if (isDelivery) {
                JOptionPane.showMessageDialog(null, "WE OFFER DELIVERY TO AMMAN, JARASH, ...");
            }
            if (isJobs) {
                JOptionPane.showMessageDialog(null, "WE ARE LOOKING FOR A CHEF");
                choice = JOptionPane.showConfirmDialog(null, "ARE YOU INTERESTED?") + "";
                if (choice.equals("0")) {
                    JOptionPane.showMessageDialog(null, "asdasdasds");

                }
            }

        }


    }
    }
