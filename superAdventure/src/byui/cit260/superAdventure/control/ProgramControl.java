/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

import byui.cit260.superAdventure.model.Player;

/**
 *
 * @author Daniel
 */
public class ProgramControl {
   
    public static Player createPlayer(String playersName){
        System.out.println("\n createPlayer called.");
        Player player = new Player();
        player.setName(playersName);
        
        SuperAdventure.setPlayer(player);
        return player;
     } 
}
