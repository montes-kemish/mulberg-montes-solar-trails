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
public class MainMenuView {

    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n| Main Menu                       |"
            + "\n------------------------------------"
            + "\nN - Start a new game"
            + "\nG - Start Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save the Game"
            + "\nE - Exit"
            + "n--------------------------------------";
    public void displayMenu(){
        char choice = ' ';
        do {
            System.out.println(MENU);
            String input = this.getInput();
            choice = input.charAt(0);
            
            this.doAction(choice);
        }
        while(choice != 'E');
        
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
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
    

