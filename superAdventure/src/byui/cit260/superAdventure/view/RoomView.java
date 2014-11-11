/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brad Croft
 */
public class RoomView extends View {

    // This will produce a random true or false for the different items in the menu.
    Random random = new Random();

    /* private final String MENU = "\n"
     + "\n$$$$$$$$$$$$$$$$"
     + "\nRoom View"
     + "\n$$$$$$$$$$$$$$$"
     + "\nChoose an item to see if it is in the room."
     + "\nK - Key"
     + "\nP - Power crystal"
     + "\nV - Villain"
     + "\nT - Treasure Chest"
     + "\nE - Exit"; */
    public RoomView(String promptMessage) {
        super("\n"
                + "\n$$$$$$$$$$$$$$$$"
                + "\nRoom View"
                + "\n$$$$$$$$$$$$$$$"
                + "\nChoose an item to see if it is in the room."
                + "\nK - Key"
                + "\nP - Power crystal"
                + "\nV - Villain"
                + "\nT - Treasure Chest"
                + "\nE - Exit"
        );

    }

 /*   void displayMenu() {
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
            System.out.println("Enter your choice.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invaild Choice - The choice must not be blank");
                continue;
            }
            break;
        }

        return input;
    }
*/
    private void doAction(char choice) {

        switch (choice) {
            /* Instructor: 
             * What action should there be associated with each selection. I
             * believe you will be need to do more than print a message. Some
             * where their needs to be a way for the end user to interact
             * with the item. Is that in a different view?
             */
            case 'K':
                System.out.println("A key is in this room? " + random.nextBoolean());
                break;
            case 'P':
                System.out.println("A Power Crystal is in this room? " + random.nextBoolean());
                break;
            case 'V':
                System.out.println("A Villain is in this room? " + random.nextBoolean());
                break;
            case 'T':
                System.out.println("A Treasure chest is in this room? " + random.nextBoolean());
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}