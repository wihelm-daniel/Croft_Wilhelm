/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

import byui.cit260.superAdventure.model.Player;

/**
 *
 * @author Brad Croft
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        // System.out.println("\n*** createPlayer function called ***");
        
        Player player = new Player();
        player.setName(name);
        
        superadventure.SuperAdventure.setPlayer(player); //save the player

        return player;
    }
    
    
    
    
}
