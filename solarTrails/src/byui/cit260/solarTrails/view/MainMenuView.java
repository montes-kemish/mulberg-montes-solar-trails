/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.view;

import java.util.Scanner;

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
            + "\nG - Start Game"
            + "\nH - Help"
            + "\nS - Save the Game"
            + "\nL - Load Game"
            + "\nE - Quit"
            + "\n--------------------------------------");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String value = Object obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
    }

    public MainMenuView(String promptMessage) {
        super(promptMessage);
    }

    private void doAction(char choice) {
       
        switch (choice) {
            case 'G':
                this.startNewGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'L':
                this.startExistingGame();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    

