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
public enum SceneType {
    start,
    fuel, 
    water, 
    food,
    uranus,
    space,
    outerdarkness,
    mars,
    saturn,
    jupiter,
    object;

    @Override
    public String toString() {
        return "SceneType{" + '}';
    }
    
    
}
