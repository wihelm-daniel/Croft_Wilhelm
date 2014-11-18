/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.control;

import byui.cit260.superAdventure.model.Map;
import java.util.Arrays;

/**
 *
 * @author Daniel
 */
public class MapControl {

    private static Map createMap() {

        Map map = new Map(5, 5);

        Scene[] scenes = createScenes();

        GameControl.assignSceneToLocations(map, scenes);

        // Added by Brad
        Arrays.sort(scenes);

        return map;

    }

    static void movePlayerToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
