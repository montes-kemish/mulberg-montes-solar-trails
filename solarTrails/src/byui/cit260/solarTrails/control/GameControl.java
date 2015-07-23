/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.exceptions.MapControlException;
import byui.cit260.solarTrails.model.Actor;

import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.Map;
import byui.cit260.solarTrails.model.Player;
import byui.cit260.solarTrails.model.RegularScene;
import byui.cit260.solarTrails.model.InventoryItem;
import byui.cit260.solarTrails.model.InventoryList;
import java.util.Collections;
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
          
        
        //Discovery discovery = new Discovery();
        //game.setDiscovery(discovery); // Save discovery 
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); //save map in game
        MapControl.moveActorsToStartingLocation(map);
    }
               
  public static InventoryItem[] createInventory(){
      //create array list of inventory items called storage tanks on the game
      
      InventoryItem[] inventory = new InventoryItem[5];
      
      InventoryItem water = new InventoryItem();
      water.setDescription("water");
      water.setQuantityInStock(0);
      water.setRequiredQuantity(0);
      inventory[InventoryList.water.ordinal()] = water;
      
      InventoryItem food = new InventoryItem();
      food.setDescription("buffalo");
      food.setQuantityInStock(0);
      food.setRequiredQuantity(0);
      inventory[InventoryList.food.ordinal()] = food;
      
           
      InventoryItem fuel = new InventoryItem();
      fuel.setDescription("Hydrogen");
      fuel.setQuantityInStock(0);
      fuel.setRequiredQuantity(0);
      inventory[InventoryList.fuel.ordinal()] = fuel;
      
      InventoryItem vaccume = new InventoryItem();
      vaccume.setDescription("Spacial Vaccume");
      vaccume.setQuantityInStock(0);
      vaccume.setRequiredQuantity(1);
      inventory[InventoryList.vaccume.ordinal()] = vaccume;
      
      
     InventoryItem lens = new InventoryItem();
      lens.setDescription("super lens");
      lens.setQuantityInStock(0);
      lens.setRequiredQuantity(1);
      inventory[InventoryList.lens.ordinal()] = lens;
          
      return inventory;
          
          
  }

    public static Actor[] getSortedActorList() {
        String[] actor = SolarTrails.getCurrentGame().getActors();
        Collections.sort(null);
        
        
        return null;
        //InventoryItem[] inventoryList = SolarTrails.getCurrentGame().getInventory();
        
        
       
       
    }

    public static InventoryItem[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}