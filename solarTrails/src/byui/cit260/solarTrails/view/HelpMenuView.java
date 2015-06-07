/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;

/**
 *
 * @author Angela Mulberg
 */
public class HelpMenuView {
    
private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n| Help Menu                       |"
            + "\n------------------------------------"
            + "\nO - Overview"
            + "\nP - Planning your trip"
            + "\nS - Scientist Specializations"
            + "\nT - Travel"
            + "\nL - Locations"
            + "\nF - Harvesting Fuel"
            + "\nH - Hunting for Food and Water"
            + "\nQ - Quit"
            + "\n--------------------------------------";
    public void displayMenu(){
        char choice = ' ';
        do {
            System.out.println(MENU);
            String input = this.getInput();
            choice = input.charAt(0);
            
            this.doAction(choice);
        
        } while(choice != 'Q');
        
    }
    
    public String getInput() {
     
        boolean valid = false;
        String getInput = null;
        Scanner keyboard = new Scanner(System.in);
       
        while(!valid){
           
           System.out.println("Select an option");
           getInput = keyboard.nextLine();
           getInput = getInput.trim();
           
           if (getInput.length() != 1){
               System.out.println("Options are single capitalized letters");
               continue;
           }
           break;
       }
       return getInput;
    }
    
    private void doAction(char choice) {
       
        switch (choice) {
            case 'O':
                this.overview();
                break;
            case 'P':
                this.planningYourTrip();
                break;
            case 'S':
                this.scientistSpecializations();
                break;
            case 'T':
                this.travel();
                break;
            case 'L':
                this.locations();
                break;
            case 'F':
                this.harvestingFuel();
                break;
            case 'H':
                this.huntForFoodAndWater();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
    }

    private void overview() {
        System.out.println("You are the world's leading aeropace scientists.");
    }
    private void planningYourTrip() {
        System.out.println("To plan your trip click on the map and pick a location.");
    }
    private void scientistSpecializations() {
        System.out.println("You are the world's leading aeropace scientists...");
    }
    private void travel() {
        System.out.println("To travel go to the map and pick the location of choice.");
    }    
    private void locations() {
        System.out.println("Locations can be found on the map.");
    }
    private void harvestingFuel() {
        System.out.println("You harvest fuel by exploring planets.");
    }
    private void huntForFoodAndWater() {
        System.out.println("You hunt for Food and Water by traveling and exploring different planets.");
    }
}
    

