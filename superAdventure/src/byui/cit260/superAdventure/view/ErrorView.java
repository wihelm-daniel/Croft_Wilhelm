/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import java.io.PrintWriter;
import superadventure.SuperAdventure;

/**
 *
 * @author Daniel entire file
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = SuperAdventure.getOutFile();
    private static final PrintWriter logFile = SuperAdventure.getLogFile();
    
    public static void display(String className, String errorMessage) {
    
        errorFile.println(
                    "\n+++++++++++++++++++++++++++++++++++++++++++++++++"
                  + "\n+ ERROR - " + errorMessage
                  + "\n+++++++++++++++++++++++++++++++++++++++++++++++++");
    
        logFile.println(className + " - " + errorMessage);
    }

    
}

