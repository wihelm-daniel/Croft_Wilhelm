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
 * @author Daniel
 */
public class StartProgramView {
     public void startProgram() {
    
        this.displayBanner();
        
        String playersName = this.getPlayersName();
        
        Player player = ProgramControl.createPlayer(playersName);
        
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
       
        
    }

    private void displayBanner() {
       System.out.println("\n" +
        "\n************************************************************************"
      + "\n* The City is in trouble! A group of evil villains have invaded and it *"
      + "\n* is up to you to save the day. Work you way from area to area of the  *"
      + "\n* city encountering villians, locked treasure chests and challegning   *"
      + "\n* puzzles earining keys, clues and power crystals to help you defeat   *"
      + "\n* the villans and win the game!                                        *"
      + "\n************************************************************************"
      + "\n*                    Welcome to the Super Adveture                     *"       
      + "\n************************************************************************"
       ); 
    }

   

   private String getPlayersName() {
        boolean valid = false;
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter the Players Name below");
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            if(playersName.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
                }
            break;
        }
        
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n *****************************************************************\n");
        System.out.println("**********\t Welcome to the game " + player.getName());      
        System.out.println("**********\t Have fun storming the castle!");
        System.out.println("\n *****************************************************************");
       
    }

}
