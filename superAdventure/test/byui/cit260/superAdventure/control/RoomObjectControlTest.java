/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brad Croft/Edited by Dan Wilhelm
 */
public class RoomObjectControlTest {
    
    public RoomObjectControlTest() {
    }
    
   @Test
   
   public void testCheckLockCover() {
     System.out.println("checkLockCover");
   /*
    *  Test Case #1
    */
        System.out.println("\t Test #1");
        
        int radius = 1;
        int height = 1;
        int expResult = 1;
        RoomObjectControl instance = new RoomObjectControl();
        int result = instance.checkLockCover(radius, height);
        System.out.println(result);
        assertEquals(expResult, result, 1);
               
        
   /*
    *  Test Case #2
    */
        System.out.println("\t Test #2");
        
        radius = 8;
        height = 8;
        expResult = 536;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
        
        
   /*
    *  Test Case #3
    */
        System.out.println("\t Test #3");
        
        radius = 0;
        height = 0;
        expResult = -1;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
        
        
          
   /*
    *  Test Case #4
    */
        System.out.println("\t Test #4");
       
        radius = 9;
        height = 9;
        expResult = -1;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
       
        
   /*
    *  Test Case #5
    */
        System.out.println("\t Test #5");
        
        radius = 1;
        height = 1;
        expResult = 1;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
     
         /*
    *  Test Case #6
    */
        System.out.println("\t Test #6");
        
        radius = 1;
        height = 8;
        expResult = 8;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
        
        
   /*
    *  Test Case #7
    */
        System.out.println("\t Test #7");
        
        radius = 8;
        height = 67;
        expResult = 536;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
        
        
   /*
    *  Test Case #8
    */
        System.out.println("\t Test #8");
        
        radius = 8;
        height = 8;
        expResult = 536;
        result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 1);
      
        
    
    }

    
    
}
