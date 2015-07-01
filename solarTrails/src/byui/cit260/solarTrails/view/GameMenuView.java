/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

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
            + "\nC - Crew Status"
            + "\nI - Inventory Situation"
            + "\nS - Ship Situation"
            + "\nT - Travel"
            + "\nF - Harvesting Fuel"
            + "\nH - Hunting for Food and Water"
            + "\nQ - Quit"
            + "\n--------------------------------------");
    }

@Override
public boolean doAction (Object obj){

String value = (String) obj;
value = value.toUpperCase();
char choice = value.charAt(0);

 switch (choice) {
            case 'C':
                this.crewStatus();
                break;
            case 'I':
                this.inventory();
                break;
            case 'S':
                this.shipSituation();
                break;
            case 'T':
                this.travel();
                break;
            case 'F':
                this.harvestFuel();
                break;
            case 'H':
                this.huntingFW();
                break;
            case 'Q':
                return true; // boolean function 
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
         return false;
    }

    private void crewStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void shipSituation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void travel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void harvestFuel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void huntingFW() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}