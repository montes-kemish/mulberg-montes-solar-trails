/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author User
 */
public enum Actor implements Serializable {
    
    
    Healthie("He is an expert in health and will save many through new medicine"),
    Welthie("He is a rich man and will save many through new economic discoveries"),
    Foodie("He is a nutritian and will save many from hunger"),
    Knowie("A teacher and will save meny through education"),
    Lovie("He loves everyone"),
    Adventurie("He leads the adventure and will be the captain of the ship");
    
    
    private final String description;
    private final Point coordinates;// I created a "import java.awt.Point;" to solve problem
    //create the location property
    
     Actor(String description) {
     this.description = description;
      coordinates = new Point (1,1);
   
}
            
    public String getDescription(){
    return description;
}
public Point getCoordinates(){
    return coordinates;
}
}
