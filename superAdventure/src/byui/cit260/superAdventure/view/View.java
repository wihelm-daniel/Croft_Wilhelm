/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import superadventure.SuperAdventure;

/**
 *
 * @author Brad Croft | fixed and update by Dan Wilhelm
 */
public abstract class View implements ViewInterface {

    private String message;
    
    protected final BufferedReader keyboard = SuperAdventure.getInFile();
    protected final PrintWriter console = SuperAdventure.getOutFile();

    public View(String promptMessage) {
        this.message = promptMessage;
    }

    @Override
    public void display() {
        String value;

        do {

            this.console.println(this.message); // display the prompt
            value = this.getInput(); // get the user's selection
            this.doAction(value); // do action based on selection

        } while (!value.equals("Q"));
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String selection = null;

// while a valid name has not been retrieved
        while (!valid) {

            //prompt for the palyer's name
            System.out.println("\t\nEnter your selection below.");

            try {
                //get the value entered from the keyboard
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            selection = selection.trim();

            if (selection.length() < 1) {  // blank value entered
                ErrorView.display(this.getClass().getName(),
                        "YOu mus enter a value");
                continue;
            }
            break;
        } catch (Excpetion e) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading inoput" + e.getMessage());
                  
        return null;
    }
}
