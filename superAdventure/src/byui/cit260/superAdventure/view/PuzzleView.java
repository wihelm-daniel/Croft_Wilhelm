/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;
import byui.cit260.superAdventure.control.PuzzleControl;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PuzzleView {
    private final String TEXT = "\n" +
            "\n============================================================" +
            "\n= You look up and see a shiny object high up in a crevice    =" +
            "\n= of a wall. You look around and see material you can use    =" +
            "\n= to setup a pully teeter-totter which could shoot you high  =" +
            "\n= up into the air so you can reach out and snatch that shiny =" +
            "\n= treasure up into your hands. You notice a waterfall that   =" +
            "\n= could be used to fill up a container of some kind. You see =" +
            "\n= a rope and a pully system, next to material you can use to =" +
            "\n= to make a bucket that you can use the rope and pully to    =" + 
            "\n= fill with water and then drop on the teetertotter to shoot =" +
            "\n= you up in the air.                                         =" +
            "\n=                                                            =" +
            "\n= Your mission is to build a bucket the correct size...      =";
            
  void displayText() {
         
         System.out.println(TEXT);
         System.out.println("Please enter the radius of the bucket (1-8");
         int radius = this.getInput();
         int height = this.getInput();
         
        
              
           
       
       }
       
       
    

    private int getInput() {
        boolean valid = false;
        String input = "0";
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
        int output = Integer.valueOf(input);
        return output;
    }  

   
}
