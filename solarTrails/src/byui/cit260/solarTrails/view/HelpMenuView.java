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
public class HelpMenuView extends View {
    
    public HelpMenuView() {
        super ("\n"
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
            + "\n--------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj; // casting to change data type
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
            return false;
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
    

