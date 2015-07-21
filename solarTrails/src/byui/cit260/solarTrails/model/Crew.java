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
 * @author angelamulberg
 */
public class Crew implements Serializable{
  
    private String specialties;
    private double names;

    public Crew() {
    }

    
    @Override
    public String toString() {
        return "Crew{" + "specialties=" + specialties + ", names=" + names + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.specialties);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.names) ^ (Double.doubleToLongBits(this.names) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crew other = (Crew) obj;
        if (!Objects.equals(this.specialties, other.specialties)) {
            return false;
        }
        if (Double.doubleToLongBits(this.names) != Double.doubleToLongBits(other.names)) {
            return false;
        }
        return true;
    }
    
    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public double getNames() {
        return names;
    }

    public void setNames(double names) {
        this.names = names;
    }

    

}
