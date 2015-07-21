/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solartrails;

import byui.cit260.solarTrails.model.Actor;
import byui.cit260.solarTrails.model.Game;
import byui.cit260.solarTrails.model.Player;
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
        playerOne.setName("Ksh");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
       
       String actorInfo = Actor.Adventurie.getDescription();
       System.out.println(actorInfo);
       
        
        StartProgramView startProgramView = new StartProgramView(); 
      try{
          
          startProgramView.display();
          
      }catch (Throwable te){
          System.out.println(te.getMessage());
          startProgramView.display();
          
      }
      
         
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
