/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import java.util.Scanner;

/**
 *
 * @author Brad Croft
 */
public class ClueView {

    private final String MENU = "\n"
            + "\n##########################"
            + "\n\tClue"
            + "\n##########################"
            + "\nChoose an item below for a clue for the game."
            + "\nW - Weaknesses of the villain's."
            + "\nP - Power Crystal locations"
            + "\nK - Key locations"
            + "\nE - Exit the clue area"
            + "";

    void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);

            String input = this.getInput();
            selection = input.charAt(0);

            this.doAction(selection);

        } while (selection != 'E');

    }

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter your clue choice.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invalid Name - The name must not be blank");
                continue;
            }
            break;
        }

        return input;
    }

    private void doAction(char choice) {
        /* Instructor: 
         * The action for each choice here is OK because you are really just 
         * displaying help here. There should be no control action needed.
         */
        switch (choice) {
            case 'W': // Choice 1
                System.out.println("Answer the following question for a clue to be revealed.");
                System.out.println("What is the area of of a square with a base of 5 and a height of 4?");

                // Get the input from the user, trim any leading or trailing spaces
                String inputWeakness = null;
                Scanner keyboardWeakness = new Scanner(System.in);
                inputWeakness = keyboardWeakness.nextLine();
                inputWeakness = inputWeakness.trim();

                if (inputWeakness == "20") {
                    System.out.println("\nA villain's weakness is through their stomach.\nOffer them something to eat and they will\nignore you.");
                } else {
                    System.out.println("Try again");
                }
                break;
            case 'P': // Choice 2
                System.out.println("Answer the following question for a clue to be revealed.");
                System.out.println("What is the area of of a triangle with a base of 6 and a height of 4?");

                // Get the input from the user, trim any leading or trailing spaces
                String inputPowerCrystal = null;
                Scanner keyboardPowerCrystal = new Scanner(System.in);
                inputPowerCrystal = keyboardPowerCrystal.nextLine();
                inputPowerCrystal = inputPowerCrystal.trim();

                if (inputPowerCrystal == "12") {
                    System.out.println("\nPower crystals can be found in each map's\nlocation.");
                } else {
                    System.out.println("Try again");
                }
                break;
            case 'K': // Choice 3
                System.out.println("Answer the following question for a clue to be revealed.");
                System.out.println("What is the approximate circumference of a circle, with a diameter of 100?");

                // Get the input from the user, trim any leading or trailing spaces
                String inputKey = null;
                Scanner keyboardKey = new Scanner(System.in);
                inputKey = keyboardKey.nextLine();
                inputKey = inputKey.trim();

                if (inputKey == "314") {
                    System.out.println("\nKeys are found only in even numbered rooms.");
                } else {
                    System.out.println("Try again");
                }

            case 'E':
                return;
            default:
                System.out.println("\nInvalid selection, please try again");
        }
    }
}