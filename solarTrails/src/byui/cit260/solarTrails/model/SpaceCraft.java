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
public enum SpaceCraft implements Serializable {
    
    /**
     *
     */
    Falcon_Shuttle(" This is the smallest ship, 2-3 crew capacity, low cargo and fast speed",3,10,5),
    Discovery_Science ("mid-size, 3-5 crew capacity, medium cargo, average speed",5,20,10), 
    Daedalus_Crusier("large size, 4-6 crew capacity, largo cargo, slow",6,30,15);
    
        private final String description;
        private final int crewCapacity;
        private final int lenght;
        private final int width;
        
        SpaceCraft(String description,int crewCapacity, int lenght, int width){
            this.description = description;
            this.crewCapacity = crewCapacity;
            this.lenght = lenght;
            this.width = width;
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
}
