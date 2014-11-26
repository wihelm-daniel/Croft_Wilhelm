/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import byui.cit260.superAdventure.model.Map;
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
            + "\nT - Treasure chest locations"
            + "\nP - Puzzle locations"
            + "\nE - Exit the clue area"
            + "";

    void displayMenu() {

        // Clue Game, guess a number between 1 and 100
        Scanner keyboard = new Scanner(System.in);

        int a = 1 + (int) (Math.random() * 99);
        int guess;

        System.out.println("Guess my number to display the clues.");
        guess = keyboard.nextInt();

        while (guess != a) {
            if (guess > a) {
                System.out.println("Guess lower.");

            } else if (guess < a) {
                System.out.println("Guess higher.");

            } else {
                System.out.println("Congratulations, you guessed right, now the Clues will be displayed.");
            }
        }

        // End clue game
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
                System.out.println("\nA villain's weakness is through their stomach.\nOffer them something to eat and they will\nignore you.");
                break;
            case 'T': // Choice 2
                System.out.println("\nPower crystals can be found in each map's\nlocation.");
                break;
            case 'P': // Choice 3
                System.out.println("\nPuzzles are found only in even numbered rooms.");
              System.out.println(Map.
                break;
            case 'E':
                return;
            default:
                System.out.println("\nInvalid selection, please try again");
        }
    }
}
