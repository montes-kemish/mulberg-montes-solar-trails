/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import byui.cit260.solarTrails.model.InventoryItem;

/**
 *
 * @author User
 */
public class ShipControl {
    
    //function created to pack or load the ship on the starting position
    //values of daily consumption and others will be added manually
    public double calAmountRequired(double days, double noOfPeople, double dailyConsumption){
        if (days < 36 ){
        return -1;
        }
        if (noOfPeople < 2 ) {
            return -1;
        }
        
        double amountRequired = days * noOfPeople * dailyConsumption;
        return amountRequired;
        
    }
    
    
}
