/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class StorageControlTest {
    
    public StorageControlTest() {
    }

    /**
     * Test of calcFoodRequired method, of class StorageControl.
     */
    @Test
    public void testCalcFoodRequired() {
        System.out.println("calcFoodRequired");
        
        //Text case #1
        
        System.out.println("\tTest case #1");
        long inventoryItem = 1L;
        long noPeople = 3L;
        long dailyAmountRequired = 5L;
        StorageControl instance = new StorageControl();
        long expResult = 210L;
        long result = instance.calcFoodRequired(inventoryItem, noPeople, dailyAmountRequired);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcFuelNeeded method, of class StorageControl.
     */
    @Test
    public void testCalcFuelNeeded() {
        System.out.println("calcFuelNeeded");
        double shipFuelCapacity = 1000.0;
        double tripDuration = 14.0;
        StorageControl instance = new StorageControl();
        double expResult = 980.0;
        double result = instance.calcFuelNeeded(shipFuelCapacity, tripDuration);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
