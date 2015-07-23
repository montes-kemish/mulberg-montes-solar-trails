/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author User Missig the Fuel Capacity fixed number, first define, then develop
 */
public class SpaceCraft implements Serializable {
    
    /**
     *
     */
       
        private final String description;
        private final int crewCapacity;
        private final int lenght;
        private final int width;
        private final double maxWeightCapacity;
       
        SpaceCraft(String description,int crewCapacity, int lenght, int width, double maxWeightCapacity){
            this.description = description;
            this.crewCapacity = crewCapacity;
            this.lenght = lenght;
            this.width = width;
            this.maxWeightCapacity = maxWeightCapacity;
        }

    public SpaceCraft() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public String getDescription(){
            return this.description;
        }
        public int getCrewCapacity(){
            return this.crewCapacity;
        }
        public int getWidth(){
            return this.width;
        }
        public int getLenght(){
            return this.lenght;
        }

    public double getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    @Override
    public String toString() {
        return "SpaceCraft{" + "description=" + description + ", crewCapacity=" + crewCapacity + ", lenght=" + lenght + ", width=" + width + ", maxWeightCapacity=" + maxWeightCapacity + '}';
    }
    
        
}
