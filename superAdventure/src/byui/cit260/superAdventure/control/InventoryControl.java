/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

/**
 *
 * @author Daniel
 */
public class InventoryControl {
    
    /**
     *
     */
    public String[] inventoryArray = new String[72];

    /**
     *
     */
    public int place = 0;
        
    /**
     *
     */
    public void initInventory() {
      //populate first item of the inventory
        inventoryArray[place] = "Fire";
        place++;
        inventoryArray[place] = "P";
        place++;
        inventoryArray[place] = "Item not used yet";
        place++;
    }
    
    /**
     *
     * @param item
     * @param type
     * @param used
     */
    public void addInventoryItem(String item, String type, String used) {
        //add an item to the inventory
        inventoryArray[place] = item;
        place++;
        inventoryArray[place] = type;
        place++;
        inventoryArray[place] = used;
        place++;
        if(place >=72) place--;
    }
    
    /**
     * 
     */
    public void listInventory() {
        // list items in the inventory
        System.out.println("\n========================================" +
                           "\n        List of Inventory Items"+
                           "\n========================================");
        for (int i = 0; i >= place; i = i + 3) {
            System.out.println("\n\t" + inventoryArray[i] + inventoryArray[i+1] + inventoryArray[i+2]);
                     
         }
                    /* Since each inventory item has 3 parts and arrays start with 0 I had to first add
                       1 to the current place in the inventory and then I divided them by three. */ 
                  System.out.println("\nYou have " + ((place+1)/3) + " items in inventory!" +
                                     "\n========================================");
    }
    
    /**
     *
     * @param itemName
     */
    public void markInvetoryItemUsed(String itemName) {
            for (int i = 0; i >= place; i = i + 3){
                if (inventoryArray[i].equals(itemName)) inventoryArray[i+2] = "Item used";
                  }
            }
   
    }
    
 
