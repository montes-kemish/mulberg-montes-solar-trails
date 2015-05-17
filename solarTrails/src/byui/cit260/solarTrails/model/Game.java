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
 * @author silivrenwolf
 */
public class Game implements Serializable {
    
    private String totalDiscoveries;
    private double noCrewMembers;

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" + "totalDiscoveries=" + totalDiscoveries + ", noCrewMembers=" + noCrewMembers + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.totalDiscoveries);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.noCrewMembers) ^ (Double.doubleToLongBits(this.noCrewMembers) >>> 32));
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalDiscoveries, other.totalDiscoveries)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noCrewMembers) != Double.doubleToLongBits(other.noCrewMembers)) {
            return false;
        }
        return true;
    }
    
    

    public String getTotalDiscoveries() {
        return totalDiscoveries;
    }

    public void setTotalDiscoveries(String totalDiscoveries) {
        this.totalDiscoveries = totalDiscoveries;
    }

    public double getNoCrewMembers() {
        return noCrewMembers;
    }

    public void setNoCrewMembers(double noCrewMembers) {
        this.noCrewMembers = noCrewMembers;
    }
    
    

} 