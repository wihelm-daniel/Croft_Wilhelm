/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class GamePlayHelpView {
      
        private final String MENU = "\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+       Game Play Help Categories      +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ O - Object of the game               +" +
            "\n+ H - Hints on how to win              +" + 
            "\n+ S - Saving the game                  +" +
            "\n+ L - Loading a saved game             +" +
            "\n+ T - Treasure (clues/keys/powers)     +" +
            "\n+ Q - Quit to Help Menu                +" +
            "\n++++++++++++++++++++++++++++++++++++++++";
   
    void displayMenu() {
         char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'Q');
    }

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter your menu choice.");
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
                }
            break;
        }
        
        return input;
    }

    private void doAction(char choice) {
        
        switch (choice){
            case 'O':
                this.gameObject();
                break;
            case 'H':
                this.howToWin();
            case 'S':
                this.howToSave();
                break;
            case 'L':
                this.loadSave();
                break;
            case 'T':
                this.treasureUse();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
    }

    private void gameObject() {
        System.out.println("\n gameObject called");
    }

    private void howToWin() {
        System.out.println("\n howToWin called");
    }

    private void howToSave() {
        System.out.println("\n howToSave called");
    }

    private void loadSave() {
        System.out.println("\n loadSave called");
    }

    private void treasureUse() {
        System.out.println("\n treaasureUse called");
    }
   
}
