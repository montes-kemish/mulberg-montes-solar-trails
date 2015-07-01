/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.Discovery;
import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.SpaceCraft;
import byui.cit260.solarTrails.model.StorageTanks;
import solartrails.SolarTrails;

/**
 *
 * @author User
 */









public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); //create new Game
        SolarTrails.setCurrentGame(game); //allocate it in solar Trails
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save the game
        StorageTanks[] inventory = GameControl.createInventory();//new class in control layer called inventory item?
        game.setInventory(inventory);
        
       SpaceCraft spaceCraft;
               
        Discovery discovery = new Discovery();
        game.setDiscovery(discovery); // Save discovery 
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); //save map in game
        MapControl.moveActorsToStartingLocation(map);
    }
               
  public static StorageTanks[] createInventory(){
      System.out.println("***called createNewInventory in Gme Control***");
          return null;
          
          
  }
            
}  

