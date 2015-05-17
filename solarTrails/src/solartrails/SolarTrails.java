/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;

import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.SpaceCraft;

/**
 *
 * @author amulberg
 */
public class SolarTrails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestDiscoveries(9);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        SpaceCraft spaceCraftOne = new SpaceCraft();
        
        spaceCraftOne.setName("Falcon Shuttle");
        spaceCraftOne.setCrewCapacity(3);
        spaceCraftOne.setFuelCapacity(1000);
        spaceCraftOne.setLength(50);
        spaceCraftOne.setWidth(10);
        
        String spaceCraftInfo = spaceCraftOne.toString();
        System.out.println(spaceCraftInfo);
        
        
        
        
    }   
}
