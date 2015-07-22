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
public class PackShipView extends View {

    public PackShipView() {
        super("***************************************"
                + "\n* You will need to plan out the trip to have "
                 + "\n* enough goods, fuel and water for you and your crew,"
                 + "\n* composed of 7 people,in order to reach Uranus"
                 + "\n* You'll Travel 360 days,"
                 + "\n* the crew will need to gather and replanish in Uranus "
                 + "\n* fuel, water and food enough to come back to Earth each crew memeber will"
                 + "\n* achieve certain discoveries depending on speciality. ");
         
          System.out.println("*                                     *"
                  + "\n* Good luck and have an awsome trip."
                  + "\n*                                            *");
          
          System.out.println("****************************************");
    }

   public void packShipView(){
   }
         
     
        
        public double confirmDistance(){
            boolean valid = false;
            int daysToTravel = 0;
            Scanner keyboard = new Scanner(System.in);
            
            while(!valid){
            System.out.println("Enter days to travel");
            
            String sDaysToTravel = keyboard.nextLine() ;
            daysToTravel = Integer.parseInt(sDaysToTravel.trim());
            
                     
            if (daysToTravel!= 360){
                System.out.println("Invalid amount of food required"
                        + "The exact amount of days you'll travel "
                        + "was displayed in the previous message");
                continue;//continue with the while loop
            }
          break;
        }
      
        return daysToTravel;
        
    }
       
         
         
         
        public double getFoodRequired(){
        boolean valid = false; 
        int foodRequired = 0;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter Food Required For Trip");
            
            String sFoodRequired =keyboard.nextLine();
            foodRequired = Integer.parseInt(sFoodRequired.trim());
            double doubleFoodRequired = (double)foodRequired;
            
                            
            if (foodRequired >6000 || foodRequired<5670){
                System.out.println("Invalid amount of food required");
                continue;//continue with the while loop
            }
          break;
        }
      
        
        
        return foodRequired;
        
    }
       
       
    public double getFuelRequired(){
        boolean valid = false; 
        int fuelRequired = 0;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter Fuel Required For Trip");
            
            String sFuelRequired =keyboard.nextLine();
            fuelRequired = Integer.parseInt(sFuelRequired.trim());
            double doubleFuelRequired = (double)fuelRequired;
                            
            if (fuelRequired != 3600 ){
                System.out.println("Invalid amount of food required");
                continue;//continue with the while loop
            }
          break;
        }
         
      
        
        
        return fuelRequired;
    }
    
    public double getWaterRequired(){
        boolean valid = false; 
        int waterRequired = 0;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter Fuel Required For Trip");
            
            String sWaterRequired =keyboard.nextLine();
            waterRequired = Integer.parseInt(sWaterRequired.trim());
            double doubleWaterRequired = (double)waterRequired;
                            
            if (waterRequired != 5040 ){
                System.out.println("Amount must be exact");
                continue;//continue with the while loop
            }
          break;
        }
         
      
        
        
        return waterRequired;
    }

    
    
    
    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


   // Display Menu
//End user chooses an option
//Computer does the action
//Promt the user to enter the amount of crew members
//Promt the user to enter days traveling
//Create and save trip information
//Display message of ready to deploy 
//Display Travel Menu
