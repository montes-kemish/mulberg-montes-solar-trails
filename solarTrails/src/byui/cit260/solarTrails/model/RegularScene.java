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
       
    public static RegularScene[] createScenes(){
        Game game = SolarTrails.getCurrentGame();
        RegularScene[] scenes= new RegularScene[SceneType.values().lenght];
        RegularScene starting Scene = new RegularScene();
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
        finishScene.setDescription(
        "\nYou have arrived at Uranus, the mission is now to "
                + "identify the object, inspect it with the aid of the specialists, gather "
                + "food, Oxygen, and Fuel to come back to EArth"
                + "Good Luck");
        arrivingScene.setMapSymbol("AU");
        arrivingScene.setBolcked(false);
        arrivingScene.setTravelTime(360);
        RegularScenes[SceneType.arriving.ordinal()] = arrivingScene;
        
        
        
    }
    
}
