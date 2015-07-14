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
import byui.cit260.solarTrails.model.InventoryItem;
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
        InventoryItem[] inventory = GameControl.createInventory();//new class in control layer called inventory item?
        game.setInventory(inventory);
        
        //should I create the Ship if it's an enumeration list   
          
        
        Discovery discovery = new Discovery();
        game.setDiscovery(discovery); // Save discovery 
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); //save map in game
        MapControl.moveActorsToStartingLocation(map);
    }
               
  public static InventoryItem[] createInventory(){
      //create array list of inventory items called storage tanks on the game
      
      InventoryItem[] inventory = new InventoryItem[5];
      
      InventoryItem H2O = new InventoryItem();
      H2O.setDescription("water");
      H2O.setQuantityInStock(0);
      H2O.setRequiredAmount(0);
      inventory[0] = H2O;
      
      InventoryItem food = new InventoryItem();
      food.setDescription("buffalo");
      food.setQuantityInStock(0);
      food.setRequiredAmount(0);
      inventory[1] = food;
      
      InventoryItem O2 = new InventoryItem();
      O2.setDescription("Oxygen");
      O2.setQuantityInStock(0);
      O2.setRequiredAmount(0);
      inventory[2] = O2;
      
      InventoryItem H2 = new InventoryItem();
      H2.setDescription("Hydrogen");
      H2.setQuantityInStock(0);
      H2.setRequiredAmount(0);
      inventory[3] = H2;
      
      InventoryItem vaccume = new InventoryItem();
      vaccume.setDescription("Spacial Vaccume");
      vaccume.setQuantityInStock(0);
      vaccume.setRequiredAmount(1);
      inventory[4] = vaccume;
      
      
     InventoryItem lens = new InventoryItem();
      lens.setDescription("super lens");
      lens.setQuantityInStock(0);
      lens.setRequiredAmount(1);
      inventory[5] = lens;
          
      return inventory;
          
          
  }

    public static InventoryItem[] getSortedInventoryList() {
        System.out.println("\n getSortedInventoryList stubFunction called***");
        return null;
    }
     
  
}  

