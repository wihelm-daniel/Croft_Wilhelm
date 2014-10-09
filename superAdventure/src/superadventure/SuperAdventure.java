
package superadventure;

import byui.cit260.superAdventure.model.Keys;
import byui.cit260.superAdventure.model.Player;
import java.util.HashSet;
import java.util.Set;


public class SuperAdventure {

    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Keys keysOne = new Keys();
        
        keysOne.setKeyShape("Circle");
        String keyInfo = keysOne.toString();
        
        System.out.println(keyInfo);
        
    }
    
}
