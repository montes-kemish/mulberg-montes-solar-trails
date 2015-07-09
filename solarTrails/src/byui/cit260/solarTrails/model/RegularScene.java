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
        RegularScene[] scenes= new RegularScene[1];
       
        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
        "\nEarth as it has been known, "
                + "a new discovery has been found in Uranus"
                + "and you will lead a Crew of scientists to "
                + "an Unidentified Object, through the solar system");
        startingScene.setMapSymbol("ST");
        startingScene.setBlock(false);
        startingScene.setTravelTime(0);
        scenes[0] = startingScene;
        
        RegularScene arrivingScene = new RegularScene();
        arrivingScene.setDescription(
        "\nYou have arrived at Uranus, the mission is now to "
                + "identify the object, inspect it with the aid of the specialists, gather "
                + "food, Oxygen, and Fuel to come back to EArth"
                + "Good Luck");
        arrivingScene.setMapSymbol("AU");
        arrivingScene.setBolcked(false);
        arrivingScene.setTravelTime(360);
        scenes[1] = arrivingScene;
        
        
        
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
