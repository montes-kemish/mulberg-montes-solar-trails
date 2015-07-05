/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.MapControlException;
import byui.cit260.solarTrails.model.Actor;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.RegularScene;
import java.awt.Point;
import solartrails.SolarTrails;

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
   
   static void moveActorsToStartingLocation(Map map)
           throws MapControlException {
        Actor[] actors = Actor.values();
        
        for (Actor actor: actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
           
        }
    }

    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static RegularScene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void moveActorToLocation(Actor actor, Point coordinates) 
            throws MapControlException{
        Map map = SolarTrails.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if(newRow<0 || newRow >= map.getNoOfRows()||newColumn <0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlException("Can't move ator to location "
                    + coordinates.x + "," + coordinates.y
                    + "because location is outside the bounds" );
                    
        }
        
        
        
    }

    
 }
    
    

