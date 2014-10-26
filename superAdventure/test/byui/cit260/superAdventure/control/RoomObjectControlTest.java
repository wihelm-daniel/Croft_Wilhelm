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

        int volumeLow = 1;
        int volumeHigh = 537;
        int radius = 1;
        int height = 1;
        int expResult = 1;
        RoomObjectControl instance = new RoomObjectControl();
        int result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        System.out.println(result);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #2
         */
        System.out.println("\t Test #2");

        radius = 8;
        height = 8;
        expResult = 536;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #3
         */
        System.out.println("\t Test #3");

        radius = 0;
        height = 0;
        expResult = -1;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #4
         */
        System.out.println("\t Test #4");

        radius = 9;
        height = 9;
        expResult = -1;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #5
         */
        System.out.println("\t Test #5");

        radius = 1;
        height = 1;
        expResult = 1;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #6
         */
        System.out.println("\t Test #6");

        radius = 1;
        height = 8;
        expResult = 8;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #7
         */
        System.out.println("\t Test #7");

        radius = 8;
        height = 1;
        expResult = 67;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

        /*
         *  Test Case #8
         */
        System.out.println("\t Test #8");

        radius = 8;
        height = 8;
        expResult = 536;
        result = instance.checkLockCover(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result, 1);

    }

    /**
     * Test of checkPuzzleAnswer method, of class RoomObjectControl.
     */
    @Test
    public void testCheckPuzzleAnswer() {
        System.out.println("checkPuzzleAnswer");
        /*
         *  Test Case #1
         */
        System.out.println("\t Test Case #1");
        int radius = 1;
        int height = 1;
        int volumeLow = 1;
        int volumeHigh = 1609;
        RoomObjectControl instance = new RoomObjectControl();
        int expResult = 3;
        int result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #2
         */
        System.out.println("\t Test Case #2");
        radius = 8;
        height = 8;
        expResult = 1536;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #3
         */
        System.out.println("\t Test Case #3");
        radius = 0;
        height = 0;
        expResult = -1;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #4
         */
        System.out.println("\t Test Case #4");
        radius = 9;
        height = 9;
        expResult = -1;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #5
         */
        System.out.println("\t Test Case #5");
        radius = 1;
        height = 1;
        expResult = 3;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #6
         */
        System.out.println("\t Test Case #6");
        radius = 1;
        height = 8;
        expResult = 24;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #7
         */
        System.out.println("\t Test Case #7");
        radius = 8;
        height = 1;
        expResult = 192;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);
        /*
         *  Test Case #8
         */
        System.out.println("\t Test Case #8");
        radius = 8;
        height = 8;
        expResult = 1536;
        result = instance.checkPuzzleAnswer(radius, height, volumeLow, volumeHigh);
        assertEquals(expResult, result);

    }

    /**
     * Test of unravelClueCheck method, of class RoomObjectControl.
     */
    @Test
    public void testUnravelClueCheck() {
        System.out.println("unravelClueCheck");

        //Test case #1
        int areaBase = 1;
        int areaHeight = 1;
        int areaLow = 1;
        int areaHigh = 65;
        RoomObjectControl instance = new RoomObjectControl();
        int expResult = 1;
        int result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);

        //Test case #2
        areaBase = 8;
        areaHeight = 8;
        expResult = 64;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
        //Test case #3
        areaBase = 0;
        areaHeight = 0;
        expResult = -1;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
        
        //Test case #4
        areaBase = 9;
        areaHeight = 9;
        expResult = -1;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
       //Test case #5
        areaBase = 1;
        areaHeight = 1;
        expResult = 1;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
        //Test case #6
        areaBase = 1;
        areaHeight = 8;
        expResult = 8;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
        //Test case #7
        areaBase = 8;
        areaHeight = 1;
        expResult = 8;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
        //Test case #8
        areaBase = 8;
        areaHeight = 8;
        expResult = 64;
        result = instance.unravelClueCheck(areaBase, areaHeight, areaLow, areaHigh);
        assertEquals(expResult, result);
        
        
        
    }

}
