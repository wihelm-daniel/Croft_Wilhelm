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
public class PuzzleView {
    private final String TEXT = "\n" +
            "\n================================================================" +
            "\n= You look up and see a shiny object high up in a crevice of   =" +
            "\n= a wall. You look around and see material you can use to      =" +
            "\n= setup a teeter-totter which could shoot you high up into the =" +
            "\n= air so you can reach out and snatch that shiny treasure up   =" +
            "\n= into your hands. You notice a waterfall could be used fill   =" +
            "\n= up a container of some kind. You see a rope and a pulley     =" +
            "\n= system, next to material you can use to make a bucket you    =" +
            "\n= can fill with water and then drop on the teeter-totter using =" + 
            "\n= the pulley system to shoot you up in the air                 =" +
            "\n=                                                              =" +
            "\n= Your mission is to build a bucket the correct size...        =" +
            "\n================================================================";
            
  void displayText() {

         System.out.println(TEXT);
   again:System.out.println("Are you ready to give it a try?" +
                 "\n press Y for yes, N for no or X to Exit");
         char choice = ' ';
         String input = this.getInput();
            choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            this.startPuzzleGame();
        } else if (choice == 'N' || choice == 'n'){
            this.displayText();
        } else {
            // will return to function that called it
        }
        
    }

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter your choice.");
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

    private void startPuzzleGame() {
        System.out.println("startPuzzleGame called");
    }

}
       
       
    

   


