/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.RegularScene;

/**
 *
 * @author User
 */
public class MapControl {
    
   public static  Map createMap() {
       //create the map
       Map map = new Map(20, 20);
      //create a list of different scenes of the game
       RegularScene[] scenes = createScenes();
       //assign location to different scenes on the map
       GameControl.assignScenesToLocations(map, scenes);
       
       return map;
   }
   static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static RegularScene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 }
    
    

