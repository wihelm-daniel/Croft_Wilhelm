/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Daniel
 */
public enum RoomObject implements Serializable {

    None(" ",' ', 0, 0, " "), //empty starting room object
    Icee("Icee", 'V', 1, 0, "heat"), // villain objects: objectSymbol to be displayed in map, answer to clue puzzle, the power crystal to use on the villain.
    FlameBoy("Flame Boy", 'V', 2, 0, "cold"),
    PlanetGuy("Planet Guy", 'V', 2, 0, "water"),
    LakeBoy("Lake Boy", 'V', 2, 0, "earth"),
    Stoneface("Stoneface",'V', 2, 0, "acid"),
    Acidface("Acidface",'V', 2, 0, "soda"),
    Neutron("Neutron", 'V', 2, 0, "fusion"),
    Hottron("Hottron", 'V', 2, 0, "coldFusion"),
    Puzzle1("Puzzle One", 'P', 1, 64, "round"),  //objectSymbold,puzzle answer low and high range and the key awarded when you win the puzzle game.
    Puzzle2("Puzzle Two", 'P', 1, 64, "oval"),
    Puzzle3("Puzzle Three", 'P', 1, 64, "square"),
    Puzzle4("Puzzle Four", 'P', 1, 64, "rectangle"),
    Puzzle5("Puzzle Five", 'P', 1, 64, "triangle"),
    Puzzle6("Puzzle Six", 'P', 1, 64, "crisscross"),
    Puzzle7("Puzzle Seven", 'P', 1, 64, "diamond"),
    Puzzle8("Puzzle Eight", 'P', 1, 64, "hexagon"),
    Chest1("Treasure Chest One", 'C', 1, 64, "heat"), // objectSymbod, puzzle answer low and high range and the power crystal awarded when you win the Treasure Chest game.
    Chest2("Treasure Chest Two", 'C', 1, 64, "cold"),
    Chest3("Treasure Chest Three", 'C', 1, 64, "water"),
    Chest4("Treasure Chest Four", 'C', 1, 64, "earth"),
    Chest5("Treasure Chest Five", 'C', 1, 64, "acid"),
    Chest6("Treasure Chest Six", 'C', 1, 64, "soda"),
    Chest7("Treasure Chest Seven", 'C', 1, 64, "fusion"),
    Chest8("Treasure Chest Eight", 'C', 1, 64, "coldFusion");
    
    
    
    private final String objectName;
    private final char objectSymbol;
    private final int lowRange;
    private final int highRange;
    private final String reward;
    
    
    RoomObject(String objectName, char objectSymbol, int lowRange, int highRange, String reward) {
        this.objectName = objectName;
        this.objectSymbol = objectSymbol;
        this.lowRange = lowRange;
        this.highRange = highRange;
        this.reward = reward;
                
    
    }
    public void listRoomObjects() {
        for(int i: RoomObject){
        System.out.println(i);
        System.out.println(", ");
        }
    }

    
    
    
   
}
