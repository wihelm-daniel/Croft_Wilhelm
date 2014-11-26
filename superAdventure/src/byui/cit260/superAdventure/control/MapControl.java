/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

import byui.cit260.superAdventure.model.Map;
import byui.cit260.superAdventure.model.Player;
import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class MapControl {

    private static Map createMap() throws MapControlException{

        Map map = new Map(5, 5);

        Scene[] scenes = createScenes();

        GameControl.assignSceneToLocations(map, scenes);

        // Added by Brad
        Arrays.sort(scenes);

        return map;

    }

    
    
    public static void movePlayerToLocation(Player player, Point coordinates)
            throws MapContolExcpetion {
                        
        Map map = SuperAdventure.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() || newColumn < 0 || 
                newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location"
                                        + coordinates.x + "' " + coordinates.y
                                        + " because that location is outside"
                                        + " the bounds of the map.");
        }
        
    }

}
