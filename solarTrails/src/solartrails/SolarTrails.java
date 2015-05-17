/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;

import byui.cit260.solarTrails.model.Location;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.SpaceCraft;
import byui.cit260.solarTrails.model.UnidentifiedObject;

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
        
        
        UnidentifiedObject unidentifiedObjectOne = new UnidentifiedObject();
        
        unidentifiedObjectOne.setDescription("rock");
        unidentifiedObjectOne.setCoordinates("21,02");
        unidentifiedObjectOne.setDiscoveries("Cure Cancer");
        
        String unidentifiedObjectInfo = unidentifiedObjectOne.toString();
        System.out.println(unidentifiedObjectInfo); 
        
        Map mapOne = new Map();
        
        mapOne.setColumnCount(10);
        mapOne.setRowCount(10);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        
        Location locationOne = new Location();
        
        
        locationOne.setColumn(2);
        locationOne.setRow(5);
        locationOne.setVisited(true);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        
        
        
        
        
        
        
    }   
}
