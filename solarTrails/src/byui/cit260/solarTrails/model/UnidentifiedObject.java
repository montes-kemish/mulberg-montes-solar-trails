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
public class UnidentifiedObject implements Serializable {
    
    private String description;
    private String discoveries;
    private String coordinates;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscoveries() {
        return discoveries;
    }

    public void setDiscoveries(String discoveries) {
        this.discoveries = discoveries;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
    
    
    
   
}
