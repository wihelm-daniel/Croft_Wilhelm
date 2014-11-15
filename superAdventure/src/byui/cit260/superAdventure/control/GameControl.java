/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

import byui.cit260.superAdventure.model.Game;
import byui.cit260.superAdventure.model.Map;
import byui.cit260.superAdventure.model.Player;
import byui.cit260.superAdventure.model.RoomObject;
import superadventure.SuperAdventure;

/**
 *
 * @author Daniel
 */
public class GameControl {
        
   public static void createNewGame(Player player){
       Game game = new Game();
       SuperAdventure.setCurrentGame(game);
       
       game.setPlayer(player);
       
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
                
       Map map = MapControl.createMap();
       game.setMap(map);
       
       RoomObject[] roomObject = RoomObject.fillMap();
             
 
       MapControl.movePlayerToStartingLocation(map);
       
}
        public static InventoryItem[] createInventoryList(){
           
            InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
            
            InventoryItem heat = new InventoryItem();
            heat.setObjectName("Heat");
            heat.setDescription("Power Crystal");
            heat.setStatus("discovered");
            inventory[Item.heat.ordinal()] = heat;
            
            InventoryItem cold = new InventoryItem();
            cold.setObjectName("Cold");
            cold.setDescription("Power Crystal");
            cold.setStatus("undiscovered");
            inventory[Item.cold.ordinal()] = cold;
            return inventory;
            
            InventoryItem water = new InventoryItem();
            water.setObjectName("Water");
            water.setDescription("Power Crystal");
            water.setStatus("undiscovered");
            inventory[Item.water.ordinal()] = water;
            return inventory;
            
            InventoryItem earth = new InventoryItem();
            earth.setObjectName("Earth");
            earth.setDescription("Power Crystal");
            earth.setStatus("undiscovered");
            inventory[Item.earth.ordinal()] = earth;
            return inventory;
            
            InventoryItem acid = new InventoryItem();
            acid.setObjectName("Acid");
            acid.setDescription("Power Crystal");
            acid.setStatus("undiscovered");
            inventory[Item.acid.ordinal()] = acid;
            return inventory;
            
            InventoryItem soda = new InventoryItem();
            soda.setObjectName("Baking Soda");
            soda.setDescription("Box of Baking Soda");
            soda.setStatus("undiscovered");
            inventory[Item.soda.ordinal()] = soda;
            
            InventoryItem fusion = new InventoryItem();
            fusion.setObjectName("Fusion");
            fusion.setDescription("Power Crystal");
            fusion.setStatus("undiscovered");
            inventory[Item.fusion.ordinal()] = fusion;
            return inventory;
            
            InventoryItem coldFusion = new InventoryItem();
            coldFusion.setObjectName("Cold Fusion");
            coldFusion.setDescription("Power Crystal");
            coldFusion.setStatus("undiscovered");
            inventory[Item.coldFusion.ordinal()] = coldFusion;
            return inventory;
            
            InventoryItem round = new InventoryItem();
            round.setObjectName("Round Key");
            round.setDescription("Unlocks Chest");
            round.setStatus("undiscovered");
            inventory[Item.round.ordinal()] = round;
            return inventory;
            
            InventoryItem oval = new InventoryItem();
            oval.setObjectName("Oval Key");
            oval.setDescription("Unlocks Chest");
            oval.setStatus("undiscovered");
            inventory[Item.oval.ordinal()] = oval;
            return inventory;
            
            InventoryItem square = new InventoryItem();
            square.setObjectName("Square Key");
            square.setDescription("Unlocks Chest");
            square.setStatus("undiscovered");
            inventory[Item.square.ordinal()] = square;
            return inventory;
            
            InventoryItem rectangle = new InventoryItem();
            rectangle.setObjectName("Rectangle Key");
            rectangle.setDescription("Unlocks Chest");
            rectangle.setStatus("undiscovered");
            inventory[Item.rectangle.ordinal()] = rectangle;
            return inventory;
            
            InventoryItem triangle = new InventoryItem();
            triangle.setObjectName("Triangle Key");
            triangle.setDescription("Unlocks Chest");
            triangle.setStatus("undiscovered");
            inventory[Item.triangle.ordinal()] = triangle;
            return inventory;
            
            InventoryItem crisscross = new InventoryItem();
            crisscross.setObjectName("Crisscross Key");
            crisscross.setDescription("Unlocks Chest");
            crisscross.setStatus("undiscovered");
            inventory[Item.crisscross.ordinal()] = crisscross;
            return inventory;
            
            InventoryItem diamond = new InventoryItem();
            diamond.setObjectName("Diamond Key");
            diamond.setDescription("Unlocks Chest");
            diamond.setStatus("undiscovered");
            inventory[Item.diamond.ordinal()] = diamond;
            return inventory;
            
            InventoryItem hexagon = new InventoryItem();
            hexagon.setObjectName("Hexagon Key");
            hexagon.setDescription("Unlocks Chest");
            hexagon.setStatus("undiscovered");
            inventory[Item.hexagon.ordinal()] = hexagon;
            return inventory;
            
            InventoryItem clue1 = new InventoryItem();
            clue1.setObjectName("First Clue");
            clue1.setDescription("A clue to help you find your way.");
            clue1.setStatus("undiscovered");
            inventory[Item.clue1.ordinal()] = clue1;
            return inventory;
            
            InventoryItem clue2 = new InventoryItem();
            clue2.setObjectName("Second Clue");
            clue2.setDescription("A clue to help you find your way.");
            clue2.setStatus("undiscovered");
            inventory[Item.clue2.ordinal()] = clue2;
            return inventory;
            
            InventoryItem clue3 = new InventoryItem();
            clue3.setObjectName("Third Clue");
            clue3.setDescription("A clue to help you find your way.");
            clue3.setStatus("undiscovered");
            inventory[Item.clue3.ordinal()] = clue3;
            return inventory;
            
            InventoryItem clue4 = new InventoryItem();
            clue4.setObjectName("Fourth Clue");
            clue4.setDescription("A clue to help you find your way.");
            clue4.setStatus("undiscovered");
            inventory[Item.clue4.ordinal()] = clue4;
            return inventory;
            
            InventoryItem clue5 = new InventoryItem();
            clue5.setObjectName("Fifth Clue");
            clue5.setDescription("A clue to help you find your way.");
            clue5.setStatus("undiscovered");
            inventory[Item.clue5.ordinal()] = clue5;
            return inventory;
            
            InventoryItem clue6 = new InventoryItem();
            clue6.setObjectName("Sixth Clue");
            clue6.setDescription("A clue to help you find your way.");
            clue6.setStatus("undiscovered");
            inventory[Item.clue6.ordinal()] = clue6;
            return inventory;
            
            InventoryItem clue7 = new InventoryItem();
            clue7.setObjectName("Seventh Clue");
            clue7.setDescription("A clue to help you find your way.");
            clue7.setStatus("undiscovered");
            inventory[Item.clue7.ordinal()] = clue7;
            return inventory;
            
            InventoryItem clue8 = new InventoryItem();
            clue8.setObjectName("Eight Clue");
            clue8.setDescription("A clue to help you find your way.");
            clue8.setStatus("undiscovered");
            inventory[Item.clue8.ordinal()] = clue8;
            return inventory;
        }
        
        public enum Item {
            heat, cold, water, earth, acid, soda, fusion, coldfusion,
            round, oval, square, rectangle, triangle, crisscross, diamond, hexagon,
            clue1, clue2, clue3, clue4, clue5, clue6, clue7, clue8;
        }
    
    }
   
}
