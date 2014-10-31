/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import byui.cit260.superAdventure.control.GameControl;
import byui.cit260.superAdventure.model.GameMenuView;
import java.util.Scanner;


/**
 *
 * @author Brad Croft
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n-----------------"
            + "\n | Main Menu             |"
            + "\n-----------------"
            + "\nN - Start a new game"
            + "\nG - Start  a saved game"
            + "\nH - Get Help on how to play the game"
            + "\nS - Save your game"
            + "\nE - Exit"
            + "\n------------------";

    public void displayMenu() {

        char selection = ' ';
        do {

            System.out.println(MENU); // this will display the main menu

            String input = this.getInput(); //this will get the user's selection
            selection = input.charAt(0);  // get the first charact of string

            this.doAction(selection); //do action based on selection
        } while (selection != 'E');


    }

    public String getInput() {
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

    public void doAction(char choice) {
        switch (choice) {
            case 'N': // creates a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existin game
                this.startExistingGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the game
                return;
            default:
                System.out.println("\n** Invalid Selection, Please try again");
                break;

        }
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(superadventure.SuperAdventure.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function***");
    }

    private void saveGame() {
        System.out.println("*** start the save game Funtion ***");
    }

    private void displayHelpMenu() {
        //System.out.println("*** start displayHelpMenu Funtion ***");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }
}
