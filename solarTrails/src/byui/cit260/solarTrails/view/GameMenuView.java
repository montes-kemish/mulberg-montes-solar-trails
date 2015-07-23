/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.GameControl;
import byui.cit260.solarTrails.control.ShipControl;
import byui.cit260.solarTrails.model.Actor;
import byui.cit260.solarTrails.model.InventoryItem;
import static javax.management.Query.value;
import solartrails.SolarTrails;

/**
 *
 * @author User
 */
public class GameMenuView extends  View{
    
    public GameMenuView(){
        super ("\n"
            + "\n------------------------------------"
            + "\n|Game Menu                      |"
            + "\n------------------------------------"
            + "\nM - View Map  "  
            + "\nC - View Contents on Location  " 
            + "\nE - Estimate Resource Needed  "
            + "\nW - Crew Status"
            + "\nI - Inventory Situation"
            + "\nS - Ship Situation"
            + "\nT - Travel"
            + "\nF - Harvest Resource"
            + "\nL - Launch Ship"   
            + "\nP - Pack Ship    "
            + "\nI - Inspect Element   "
            + "\nQ - Quit"
            + "\n--------------------------------------");
    }

@Override
public boolean doAction (Object obj){

String value = (String) obj;
value = value.toUpperCase();
char choice = value.charAt(0);

 switch (choice) {
     
            case 'M':   
                this.viewMap();
            case 'C':
                this.viewContentsOnLocation();
            case 'N':    
                this.estimateResourceNeeded();
                break;
            case 'W':
                this.crewStatus();
                
            case 'I':
                this.inventorySituation();
                break;
            case 'S':
                this.shipSituation();
                break;
            case 'T':
                this.travel();
                break;
            case 'F':
                this.harvestResource();
                break;
            case 'L':
                this.launchShip();
                break;
            case 'P':
                this.packShip();
                break;
            case 'E':
                this.inspectElement();
                break;
            case 'H':
                this.help();
                break;
            case 'Q':
                return true; // boolean function 
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
         return false;
    }

    @SuppressWarnings("empty-statement")
    private void crewStatus() {
       Actor[] actors = GameControl.getSortedActorList();
       System.out.println("\nList of Actors in alphabetical orcer");
       
        for(Actor actor: actors)
            System.out.println(actor.getCoordinates() + "\t"
            + actor.getDescription());
        {}
    }

    private void inventorySituation() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
         "Required" + "\t"
        + "in Stock");
        
        for(InventoryItem inventoryItem: inventory){
            
            System.out.println(inventoryItem.getDescription() + "\t   " + 
                    inventoryItem.getRequiredQuantity() + "\t" +
                    inventoryItem.getQuantityInStock());
        }
        
        
    }

    private void shipSituation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void travel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestResource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void launchShip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void packShip() {
       //create preparation menu
           PackShipView packV = new PackShipView();
           packV.display();
    
    }

    private void inspectElement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewContentsOnLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void estimateResourceNeeded() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void help() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    

}