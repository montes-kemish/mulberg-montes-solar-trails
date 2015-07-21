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
public class ShipControlTest {
    
    public ShipControlTest() {
    }

    /**
     * Test of calAmountRequired method, of class ShipControl.
     */
    @Test
    public void testCalAmountRequired() {
        System.out.println("calAmountRequired");
        double days = -1;
        double noOfPeople = 2;
        double dailyConsumption = 2;
        ShipControl instance = new ShipControl();
        double expResult = -1;
        double result = instance.calAmountRequired(days, noOfPeople, dailyConsumption);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
