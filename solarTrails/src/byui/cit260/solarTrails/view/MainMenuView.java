/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import byui.cit260.solarTrails.control.GameControl;
import byui.cit260.solarTrails.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import solartrails.SolarTrails;

/**
 *
 * @author User
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            + "\n------------------------------------"
            + "\n| Main Menu                       |"
            + "\n------------------------------------"
            + "\nN - Start New Game"
            + "\nH - Help"
            + "\nS - Save the Game"
            + "\nE - Start Existing Game"
            + "\nQ - Quit"
            + "\n--------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj; // casting we must use it when we want to change the data type
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
         switch (choice) {
            case 'N':
                this.startNewGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                this.startExistingGame();
                break;
            case 'Q':
                return true; // boolean function 
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
         return false;
    }

    public MainMenuView(String promptMessage) {
        super(promptMessage);
    }

    

    private void startNewGame() {
       
        
        try {
            GameControl.createNewGame(SolarTrails.getPlayer());
            
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            return;
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();// this function will initiate the game menu after it has been created
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
         HelpMenuView helpMenu = new HelpMenuView();
         helpMenu.display();
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
    

