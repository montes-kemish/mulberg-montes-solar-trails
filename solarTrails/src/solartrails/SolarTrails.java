/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;

import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.Location;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.SpaceCraft;
import byui.cit260.solarTrails.model.UnidentifiedObject;
import byui.cit260.solarTrails.view.StartProgramView;

/**
 *
 * @author amulberg
 */
public class SolarTrails {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null; 
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestDiscoveries(9);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        
        
        
        
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
        
        //create the start program view and start the program
        
        StartProgramView startProgramView = new StartProgramView(); 
        startProgramView.startProgram();
      
         
    }   

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SolarTrails.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SolarTrails.player = player;
    }
}
