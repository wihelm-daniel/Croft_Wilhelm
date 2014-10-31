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
public class HelpMenuView {
    
    public void displayMenu() {
        String HELP_MENU = "\n"
                + "\n-----------------"
                + "\n | Help Menu          |"
                + "\n-----------------"
                + "\nG - What is the goal of the game"
                + "\nM - How to move"
                + "\nR - Estimating the amount of resources"
                + "\nE - Exit"
                + "\n------------------";

        char selection = ' ';
        do {

            System.out.println(HELP_MENU); // this will display the main menu

            String input = this.getInput(); //this will get the user's selection
            selection = input.charAt(0);  // get the first charact of string

            this.doAction(selection); //do action based on selection
        } while (selection != 'E');

    }

    public void doAction(char choice) {
        switch (choice) {
            case 'G': // creates a new game
                System.out.println("The goal of the game is to defeat the villains, and gain lots of treasure");
                break;
            case 'M': // get and start an existin game
                System.out.println("Enter a selcetion when prompted to move to different rooms");
                break;
            case 'R': //display the help menu
                System.out.println("The amount of your resources vary on the amount of time spent in the game.");
                break;
            case 'E': // Exit the game
                return;
            default:
                System.out.println("\n** Invalid Selection, Please try again");
                break;

        }
    }

    private String getInput() {

        boolean valid = false;
        String userInput = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter a menu item");

            userInput = keyboard.nextLine();
            userInput = userInput.trim();

            if (userInput.length() < 1) {
                System.out.println("Invalid selection, please enter a valid selection");
                continue;
            }
            break;

        }
        return userInput;

    }
    
    
    
    
    
}
