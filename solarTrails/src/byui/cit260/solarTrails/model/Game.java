/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author silivrenwolf
 */
public class Game implements Serializable {
    
    private String totalDiscoveries;
    private double noCrewMembers;
    private Player player;
   //Discovey was deleted
    private RegularScene regularScene;
    private SpaceCraft [] spaceCraft;
    private Map map;
    private InventoryItem inventory;
    private String[] actors;

    public Game() {
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

   

    public RegularScene getRegularScene() {
        return regularScene;
    }

    public void setRegularScene(RegularScene regularScene) {
        this.regularScene = regularScene;
    }

    public SpaceCraft[] getSpaceCraft() {
        return spaceCraft;
    }

    public void setSpaceCraft(SpaceCraft[] spaceCraft) {
        this.spaceCraft = spaceCraft;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public InventoryItem getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem inventory) {
        this.inventory = inventory;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setInventory(InventoryItem[] inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSpaceCraft(SpaceCraft spaceCraft) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.totalDiscoveries);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.noCrewMembers) ^ (Double.doubleToLongBits(this.noCrewMembers) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.player);
        hash = 29 * hash + Objects.hashCode(this.regularScene);
        hash = 29 * hash + Arrays.deepHashCode(this.spaceCraft);
        hash = 29 * hash + Objects.hashCode(this.map);
        hash = 29 * hash + Objects.hashCode(this.inventory);
        hash = 29 * hash + Arrays.deepHashCode(this.actors);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.regularScene, other.regularScene)) {
            return false;
        }
        if (!Arrays.deepEquals(this.spaceCraft, other.spaceCraft)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actors, other.actors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalDiscoveries=" + totalDiscoveries + ", noCrewMembers=" + noCrewMembers + ", player=" + player + ", regularScene=" + regularScene + ", spaceCraft=" + spaceCraft + ", map=" + map + ", inventory=" + inventory + ", actors=" + actors + '}';
    }
    
    

} 