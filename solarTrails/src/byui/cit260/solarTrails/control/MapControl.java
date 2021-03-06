/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.MapControlException;
import byui.cit260.solarTrails.model.Actor;
import byui.cit260.solarTrails.model.Location;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.RegularScene;
import byui.cit260.solarTrails.model.SceneType;
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
       Location[][] locations = map.getLocations();
       
       //beginning
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[0][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[0][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[0][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[0][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[0][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[0][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[0][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[1][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[1][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[1][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[1][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[1][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[1][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[1][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        
        locations[2][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[2][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[2][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[2][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[2][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[2][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[2][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[2][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        
        
        locations[3][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[3][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[3][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[3][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[3][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[3][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[3][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[3][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        
        
        locations[4][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[4][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[4][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[4][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[4][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[4][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[4][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[4][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[5][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[5][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[5][14].setScene(scenes[SceneType.food.ordinal()]);
        locations[5][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[5][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[5][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[5][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[5][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[6][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.food.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[6][7].setScene(scenes[SceneType.water.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[6][9].setScene(scenes[SceneType.fuel.ordinal()]); 
        locations[6][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[6][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[6][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[6][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[6][14].setScene(scenes[SceneType.mars.ordinal()]);
        locations[6][15].setScene(scenes[SceneType.water.ordinal()]); 
        locations[6][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[6][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[6][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[6][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[6][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[7][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[7][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[7][14].setScene(scenes[SceneType.fuel.ordinal()]);
        locations[7][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[7][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[7][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[7][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[7][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[8][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[8][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[8][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[8][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[8][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[8][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[8][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[8][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
       
        locations[9][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[9][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[9][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[9][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[9][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[9][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[9][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[9][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[10][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[10][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[10][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[10][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[10][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[10][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[10][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[10][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[11][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[11][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[11][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[11][9].setScene(scenes[SceneType.jupiter.ordinal()]); 
        locations[11][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[11][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[11][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[11][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[11][14].setScene(scenes[SceneType.saturn.ordinal()]);
        locations[11][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[11][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[11][17].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[11][18].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[11][19].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[11][20].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        
        locations[12][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[12][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[12][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[12][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[12][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[12][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[12][13].setScene(scenes[SceneType.water.ordinal()]);  
        locations[12][14].setScene(scenes[SceneType.food.ordinal()]);
        locations[12][15].setScene(scenes[SceneType.fuel.ordinal()]); 
        locations[12][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[12][17].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][18].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][19].setScene(scenes[SceneType.space.ordinal()]);
        locations[12][20].setScene(scenes[SceneType.space.ordinal()]);
        
         locations[13][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[13][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[13][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[13][17].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][18].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][19].setScene(scenes[SceneType.space.ordinal()]);
        locations[13][20].setScene(scenes[SceneType.space.ordinal()]);
        
        locations[14][0].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][1].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][2].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][3].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][4].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[14][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[14][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[14][17].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][18].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][19].setScene(scenes[SceneType.space.ordinal()]);
        locations[14][20].setScene(scenes[SceneType.space.ordinal()]);
        
        
        locations[15][0].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[15][1].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[15][2].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[15][3].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[15][4].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[15][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[15][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[15][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[15][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[15][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[15][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[15][17].setScene(scenes[SceneType.space.ordinal()]);
        locations[15][18].setScene(scenes[SceneType.space.ordinal()]);
        locations[15][19].setScene(scenes[SceneType.space.ordinal()]);
        locations[15][20].setScene(scenes[SceneType.space.ordinal()]);
       
        locations[16][0].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[16][1].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[16][2].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[16][3].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[16][4].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[16][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[16][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[16][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[16][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[16][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[16][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[16][17].setScene(scenes[SceneType.space.ordinal()]);
        locations[16][18].setScene(scenes[SceneType.space.ordinal()]);
        locations[16][19].setScene(scenes[SceneType.space.ordinal()]);
        locations[16][20].setScene(scenes[SceneType.space.ordinal()]);
        
        locations[17][0].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[17][1].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[17][2].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[17][3].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[17][4].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[17][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[17][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[17][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[17][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[17][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[17][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[17][17].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[17][18].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[17][19].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[17][20].setScene(scenes[SceneType.uranus.ordinal()]);
        
        locations[18][0].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[18][1].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[18][2].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[18][3].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[18][4].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[18][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[18][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[18][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[18][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[18][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[18][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[18][17].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[18][18].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[18][19].setScene(scenes[SceneType.object.ordinal()]);
        locations[18][20].setScene(scenes[SceneType.uranus.ordinal()]);
        
        locations[19][0].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[19][1].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[19][2].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[19][3].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[19][4].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[19][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[19][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[19][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[19][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[19][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[19][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[19][17].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[19][18].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[19][19].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[19][20].setScene(scenes[SceneType.uranus.ordinal()]);
        
        locations[20][0].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[20][1].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[20][2].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[20][3].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[20][4].setScene(scenes[SceneType.outerdarkness.ordinal()]);
        locations[20][5].setScene(scenes[SceneType.space.ordinal()]);
        locations[20][6].setScene(scenes[SceneType.space.ordinal()]);    
        locations[20][7].setScene(scenes[SceneType.space.ordinal()]);
        locations[20][8].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][9].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][10].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][11].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][12].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][13].setScene(scenes[SceneType.space.ordinal()]);  
        locations[20][14].setScene(scenes[SceneType.space.ordinal()]);
        locations[20][15].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][16].setScene(scenes[SceneType.space.ordinal()]); 
        locations[20][17].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[20][18].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[20][19].setScene(scenes[SceneType.uranus.ordinal()]);
        locations[20][20].setScene(scenes[SceneType.uranus.ordinal()]);
        
    }

    private static RegularScene[] createScenes() {
       return null;
       
        
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
    
    

