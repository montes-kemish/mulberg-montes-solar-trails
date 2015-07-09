/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.MapControlException;
import byui.cit260.solarTrails.model.Constants.Item;
import byui.cit260.solarTrails.model.Discovery;
import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.RegularScene;
import byui.cit260.solarTrails.model.SpaceCraft;
import byui.cit260.solarTrails.model.StorageTanks;
import solartrails.SolarTrails;

/**
 *
 * @author User
 */









public class GameControl {
   
    static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    public static void createNewGame(Player player)
            
            throws MapControlException {
        Game game = new Game(); //create new Game
        SolarTrails.setCurrentGame(game); //allocate it in solar Trails
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save the game
        StorageTanks[] inventory = GameControl.createInventory();//new class in control layer called inventory item?
        game.setInventory(inventory);
        
        //should I create the Ship if it's an enumeration list   
          
        
        Discovery discovery = new Discovery();
        game.setDiscovery(discovery); // Save discovery 
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); //save map in game
        MapControl.moveActorsToStartingLocation(map);
    }
               
  public static StorageTanks[] createInventory(){
      //create array list of inventory items called storage tanks on the game
      
      StorageTanks[] inventory = new StorageTanks[5];
      
      StorageTanks H2O = new StorageTanks();
      H2O.setDescription("water");
      H2O.setQuantityInStock(0);
      H2O.setRequiredAmount(0);
      inventory[0] = H2O;
      
      StorageTanks food = new StorageTanks();
      food.setDescription("buffalo");
      food.setQuantityInStock(0);
      food.setRequiredAmount(0);
      inventory[1] = food;
      
      StorageTanks O2 = new StorageTanks();
      O2.setDescription("Oxygen");
      O2.setQuantityInStock(0);
      O2.setRequiredAmount(0);
      inventory[2] = O2;
      
      StorageTanks H2 = new StorageTanks();
      H2.setDescription("Hydrogen");
      H2.setQuantityInStock(0);
      H2.setRequiredAmount(0);
      inventory[3] = H2;
      
      StorageTanks vaccume = new StorageTanks();
      vaccume.setDescription("Spacial Vaccume");
      vaccume.setQuantityInStock(0);
      vaccume.setRequiredAmount(1);
      inventory[4] = vaccume;
      
      
     StorageTanks lens = new StorageTanks();
      lens.setDescription("super lens");
      lens.setQuantityInStock(0);
      lens.setRequiredAmount(1);
      inventory[5] = lens;
          
      return inventory;
          
          
  }
     
  
}  

