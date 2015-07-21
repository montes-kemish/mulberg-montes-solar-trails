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
public class InventoryItem implements Serializable {

private String storageType;
private double quantityInStock;
private double requiredQuantity;
private Container container;
private String description;

    public InventoryItem() {
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "storageType=" + storageType + ", quantityInStock=" + quantityInStock + ", requiredQuantity=" + requiredQuantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.storageType);
        hash = 53 * hash + Objects.hashCode(this.quantityInStock);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.requiredQuantity) ^ (Double.doubleToLongBits(this.requiredQuantity) >>> 32));
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
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.storageType, other.storageType)) {
            return false;
        }
        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        return Double.doubleToLongBits(this.requiredQuantity) == Double.doubleToLongBits(other.requiredQuantity);
    }


    public String getStorageType() {
        return storageType;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public double getRequiredQuantity() {
        return requiredQuantity;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public void setDescription(String water) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setRequiredQuantity(double requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }
    
    
}
