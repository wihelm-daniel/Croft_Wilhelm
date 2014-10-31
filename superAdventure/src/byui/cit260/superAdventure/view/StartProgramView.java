/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import byui.cit260.superAdventure.control.ProgramControl;
import byui.cit260.superAdventure.model.Player;
import java.util.Scanner;

/**
 *
 * @author Brad Croft
 */
public class StartProgramView {

    public void startProgram() {

        // Display a banner screen
        this.displayBanner();

        // prompt the player to enter his/her name.
        String playersName = this.getPlayersName();

        // create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        
        // display the Main Menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n**********************************************************");
        System.out.println("This is our Super Adventure game. You will play the\n"
                + "role of the hero as you battle mind challenges and other\n"
                + "obstacles in trying to defeat the villains and obtain the\n"
                + "treasure.");
        System.out.println("**********************************************************");

    }

    public String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //Get the players name and store it as "keyboard"

        while (!valid) {
            // prompt for the player's name
            System.out.println("Enter the player's name below:");

            // get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            // if the name is invalid, meaning less than one character in length
            if (playersName.length() < 1) {
                System.out.println("Invalid name, please enter a name and not blanks");
                continue;
            }
            break;
        }

        return playersName;
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n--------------------------------------");
        System.out.println("\tWelcome to the game " + player.getName() + ".");
        System.out.println("\tHave fun");
        System.out.println("\n--------------------------------------");
    }
}
