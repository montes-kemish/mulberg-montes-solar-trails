/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.ProgramControl;
import byui.cit260.solarTrails.model.Player;
import java.util.Scanner;

/**
 *
 * @author User
 */
    public class StartProgramView {
    
    public StartProgramView(){
        
    }
    
    public void startProgram(){
        //diplay the banner screen
        this.displayBanner();
        //prompt user to enter their name
        String playersName = this.getPlayersName();
        //create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        //Display the personalized welcome message
        this.displayWelcomeMessage(player);
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
}

    private void displayBanner() {
        
        System.out.println("\n\n*************************************");
       
        System.out.println("*                                         *"
                + "\n* This is the game of Solar Trails in this"
                + "\n* game you will travel thorugh the galaxy to"
                + "\n* Uranius in order to find an unidentified "
                + "\n* object which has the cure for many sickness");
        
        System.out.println("*                                   *"
                + "\n* You will need to plan out the trip to have "
                 + "\n* enough goods, fuel and water for you and your crew, "
                 + "\n* in order to reach a certain "
                 + "\n* distance of the trip in which the player and"
                 + "\n* the crew will need to gather and replanish "
                 + "\n* fuel, water and food,each crew memeber will"
                 + "\n* achieve certain discoveries depending on speciality. ");
         
          System.out.println("*                                     *"
                  + "\n* Good luck and have an awsome trip."
                  + "\n*                                            *");
          
          System.out.println("****************************************");
    }

    private String getPlayersName() {
       boolean valid = false;
       String playersName = null;
       Scanner keyboard = new Scanner(System.in);
       
       while(!valid){
           
           System.out.println("Enter the Player's name below:");
           playersName = keyboard.nextLine();
           playersName = playersName.trim();
           
           if (playersName.length() < 2){
               System.out.println("Invalid name - the name must be greater than 2 charachters or blank");
               continue;
           }
           break;
       }
       return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n====================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have fun!");
        System.out.println("========================================");
        
    }
    
    }