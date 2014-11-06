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

        switch (choice) {
            case 'W':
                System.out.println("\nA villain's weakness is through their stomach.\nOffer them something to eat and they will\nignore you.");
                break;
            case 'P':
                System.out.println("\nPower crystals can be found in each map's\nlocation.");
                break;
            case 'K':
                System.out.println("\nKeys are found only in even numbered rooms.");
            case 'E':
                return;
            default:
                System.out.println("\nInvalid selection, please try again");
        }

    }

}
