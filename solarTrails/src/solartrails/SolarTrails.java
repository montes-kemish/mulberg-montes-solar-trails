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
    public static final double waterDailyConsumption = 2.0;
    public static final double foodDailyConsumption = 1.5;
    public static final double fuelDailyConsumption = 10.0;
    public static final double numberOfCrewMemebers = 7.0;
    
    public static void main(String[] args) {
     
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram(); 
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

    public static double getWaterDailyConsumption() {
        return waterDailyConsumption;
    }

    public static double getFoodDailyConsumption() {
        return foodDailyConsumption;
    }

    public static double getFuelDailyConsumption() {
        return fuelDailyConsumption;
    }

    public static double getNumberOfCrewMemebers() {
        return numberOfCrewMemebers;
    }
    
}
