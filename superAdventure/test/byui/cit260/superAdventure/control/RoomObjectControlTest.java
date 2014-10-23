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
 * @author Brad Croft
 */
public class RoomObjectControlTest {
    
    public RoomObjectControlTest() {
    }

    /**
     * Test of checkLockCover method, of class RoomObjectControl.
     */
    @Test
    public void testCheckLockCover() {
        System.out.println("checkLockCover");
        double radius = 8.0;
        double height = 8.0;
        RoomObjectControl instance = new RoomObjectControl();
        double expResult = 536.1651462126933;
        double result = instance.checkLockCover(radius, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
