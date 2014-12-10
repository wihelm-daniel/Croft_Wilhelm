package byui.cit260.superAdventure.control;

import byui.cit260.superAdventure.exceptions.RoomObjectControlException;
import byui.cit260.superAdventure.model.RoomObject;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

// Enitre class by Dan Wilhelm accept where noted. 

public class RoomObjectControl {

    public static void saveList(RoomObject roomObject, String filePath) 
             throws RoomObjectControlException {
       
        try(PrintStream ps = new PrintStream(filePath)){
           ObjectOutputStream output = new ObjectOutputStream(ps); 
           
           output.writeObject(roomObject);
        }
        catch(IOException e){
            throw new RoomObjectControlException(e.getMessage());
        }
    }

    
    //Check Puzzle Answer funtion by Dan
    
public int checkPuzzleAnswer(int radius, int height, int volumeLow, int volumeHigh) throws
        new RoomObjectControlException {

        if (radius < 1 || radius > 8 || height < 1 || height > 1) {
            throw new RoomObjectControlException("\n Please enter integers between" +
                                                  " 1 and 8."); 
            
        }
      
        
        int volume = (int) Math.PI *((int)Math.pow(radius, 2)* height);        
        
        /* Instructor: 
         * Control Layer functions should never print to the console. This is the
         * job of the control layer.
         */
        if (volume >= volumeLow && volume <= volumeHigh) {
            System.out.println("Correct! You're so awesome!");
            return 0;

        } else if (volume < volumeLow) {
            System.out.println("Volume too low. Try again.");

            return 1;
        } else {
            System.out.println(" Volume too high. Try again.");
            return 1;

        }
    }

    
    // Uncover the Lock Function by Dan
    public int checkLockCover(int radius, int height, int volumeLow, int volumeHigh) {

        if (radius < 1) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
        if (radius > 8) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
        
        if (height < 1) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
        if (height > 8) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
                
        float power = (float) Math.pow(radius, 2);
        float divisor =  (float) height/3;
        int volume = (int)( Math.PI * power * divisor);
        if (volume >= volumeLow && volume <= volumeHigh) {
            return volume;

        } else if (volume < volumeLow) {
            System.out.println("Volume too low. Sand dumped out.");

            return -1;
        } else {
            System.out.println(" Volume too high. Sand dumped out");
            return -1;

        }
    }
    
    // This is Brad's work, Unravel Clue check
    
     public int unravelClueCheck(int areaBase, int areaHeight, int areaLow, int areaHigh) {

        if (areaBase < 1) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
        if (areaBase > 8) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
        
        if (areaHeight < 1) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
        if (areaHeight > 8) {
            System.out.println("Enter a number between 1 and 8");
            return -1;
        }
                
        
        
        int areaTotal = areaBase * areaHeight;
        
        if (areaTotal >= areaLow && areaTotal <= areaHigh){
            return  areaTotal;
        } else if (areaTotal < areaLow){
            System.out.println("Area too low. Try again");
            return -1;
                    
        } else {
            System.out.println("Area too high. Try again");
            return -1;
        }
        
        
       
    } // End of Brad's work
    
    
 
 }


