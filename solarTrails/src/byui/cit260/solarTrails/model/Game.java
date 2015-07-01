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
    private Player player;
    private Discovery discovery;
    private RegularScene regularScene;
    private SpaceCraft [] spaceCraft;
    private Map map;
    private StorageTanks inventory;
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

    public Discovery getDiscovery() {
        return discovery;
    }

    public void setDiscovery(Discovery discovery) {
        this.discovery = discovery;
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

    public StorageTanks getInventory() {
        return inventory;
    }

    public void setInventory(StorageTanks inventory) {
        this.inventory = inventory;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setInventory(StorageTanks[] inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSpaceCraft(SpaceCraft spaceCraft) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

} 