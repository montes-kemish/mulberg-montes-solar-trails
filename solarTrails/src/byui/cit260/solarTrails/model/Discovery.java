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
    private double amountContainerLoaded;
    private double loadedWeight;

    public Discovery(){
        this.amountContainerLoaded = 0;
        this.maxWeight = 1000;
        this.loadedWeight = 0;
        
    }
    
    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getAmountContainerLoaded() {
        return amountContainerLoaded;
    }

    public void setAmountContainerLoaded(double amountContainerLoaded) {
        this.amountContainerLoaded = amountContainerLoaded;
    }

    public double getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(double loadedWeight) {
        this.loadedWeight = loadedWeight;
    }
    
}
