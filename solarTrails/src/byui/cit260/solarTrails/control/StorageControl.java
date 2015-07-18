/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

/**
 *
 * @author User
 */
public class StorageControl {
       
    public long calcFoodRequired(long inventoryItem, long noPeople, long dailyAmountRequired) {
        long distance = 360;
        long shipCapacity = 20000;
        noPeople = 3;
        
      if (noPeople < 0) {
              return -1;
    }
            
      long foodNeeded = distance*dailyAmountRequired*noPeople;
       
      
      return foodNeeded;
              
    }
    
    public double calcFuelNeeded(double shipFuelCapacity,double tripDuration){
        double dailyRequired  = 70;
        
        if (shipFuelCapacity <0){
        return -1;
                }
        if(tripDuration<0){
        return -1;
                }
        
        double fuelNeeded = (dailyRequired * tripDuration);
        return fuelNeeded;

        }
}
    

