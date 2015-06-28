/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Discovery implements Serializable {
    
    private double maxWeight;
    private double amountLoaded;
    private double loadedWeight;

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(double amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    public double getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(double loadedWeight) {
        this.loadedWeight = loadedWeight;
    }
    
}
