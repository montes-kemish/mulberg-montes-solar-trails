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
public class StorageTanks implements Serializable {

private String storageType;
private double quantityInStock;
private double requiredQuantity;

    public StorageTanks() {
    }

    @Override
    public String toString() {
        return "StorageTanks{" + "storageType=" + storageType + ", quantityInStock=" + quantityInStock + ", requiredQuantity=" + requiredQuantity + '}';
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
        final StorageTanks other = (StorageTanks) obj;
        if (!Objects.equals(this.storageType, other.storageType)) {
            return false;
        }
        if (!Objects.equals(this.quantityInStock, other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredQuantity) != Double.doubleToLongBits(other.requiredQuantity)) {
            return false;
        }
        return true;
    }


    public String getStorageType() {
        return storageType;
    }

    public String getQuantityInStock() {
        return quantityInStock;
    }

    public double getRequiredQuantity() {
        return requiredQuantity;
    }


}
