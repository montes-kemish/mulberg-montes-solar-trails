/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import solartrails.SolarTrails;

/**
 *
 * @author montes-kemish
 */
public class RegularScene implements Serializable{
       
    public static void createScenes(){
        Game game = SolarTrails.getCurrentGame();
        RegularScene[] scenes= new RegularScene[SceneType.values().length];
       
        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
        "\nEarth as it has been known, "
                + "a new discovery has been found in Uranus"
                + "and you will lead a Crew of scientists to "
                + "an Unidentified Object, through the solar system");  
        startingScene.setMapSymbol("ST");
        startingScene.setBlock(false);
        startingScene.setTravelTime(0);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        RegularScene arrivingScene = new RegularScene();
        arrivingScene.setDescription(
        "\nYou have arrived at Uranus, the mission is now to "
                + "identify the object, inspect it with the aid of the specialists, gather "
                + "food, Oxygen, and Fuel to come back to EArth"
                + "Good Luck");
        arrivingScene.setMapSymbol("AU");
        arrivingScene.setBolcked(false);
        arrivingScene.setTravelTime(360);
        scenes[SceneType.uranus.ordinal()] = arrivingScene;
        
        RegularScene fuelScene = new RegularScene();
        fuelScene.setDescription("A place to load fuel to your Space Craft");
        fuelScene.setMapSymbol("H2");
        fuelScene.setBlock(false);
        fuelScene.setTravelTime(0);
        scenes[SceneType.fuel.ordinal()] = fuelScene;
        
        RegularScene waterScene = new RegularScene();
       waterScene.setDescription("A place to load water to your Space Craft");
        waterScene.setMapSymbol("H2O");
        waterScene.setBlock(false);
        waterScene.setTravelTime(0);
        scenes[SceneType.water.ordinal()] = waterScene;
        
        RegularScene foodScene = new RegularScene();
        foodScene.setDescription("A place to load food to your Space Craft");
       foodScene.setMapSymbol("FD");
        foodScene.setBlock(false);
        foodScene.setTravelTime(0);
        scenes[SceneType.food.ordinal()] = foodScene;
        
        RegularScene objectScene = new RegularScene();
        objectScene.setDescription("The unidentified object that must be interpreted, use the lens"
                + "to solve the problems and find new discoveries");
        objectScene.setMapSymbol("UO");
        objectScene.setBlock(false);
        objectScene.setTravelTime(0);
        scenes[SceneType.object.ordinal()] = objectScene;
        
        RegularScene spaceScene = new RegularScene();
        spaceScene.setDescription("simple Space");
        spaceScene.setMapSymbol("S");
        spaceScene.setBlock(false);
        spaceScene.setTravelTime(0);
        scenes[SceneType.space.ordinal()] = spaceScene;
        
        RegularScene outerdarknessScene = new RegularScene();
        outerdarknessScene.setDescription("Blocked area");
        outerdarknessScene.setMapSymbol("OD");
        outerdarknessScene.setBlock(true);
        outerdarknessScene.setTravelTime(0);
        scenes[SceneType.outerdarkness.ordinal()] = outerdarknessScene;
        
        
    }

    private void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBlock(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTravelTime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBolcked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
