/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

/**
 *
 * @author User
 */
public enum InventoryList {
    
    water,
    fuel, 
    food,
    vaccume,
    lens;

    @Override
    public String toString() {
        return "InventoryList{" + '}';
    }

    public static InventoryList getWater() {
        return water;
    }

    public static InventoryList getFuel() {
        return fuel;
    }

    public static InventoryList getFood() {
        return food;
    }

    public static InventoryList getVaccume() {
        return vaccume;
    }

    public static InventoryList getLens() {
        return lens;
    }
    
    
}
