/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.solarTrails.model;

import java.io.Serializable;

/**
 *
 * @author montes-kemish
 */
public class Map implements Serializable{
    
    //class Instances
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    
    
    public Map() {
    }

    public Map(int noOfRows, int noOfColums) {
        if (noOfRows < 1 || noOfColums < 1){
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for location objects
        this.locations = new Location [noOfRows][noOfColumns];
        
        for (int row = 0; row<noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++){
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
               
        }
        
     }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    
   
    

    
    
    
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }
    
    
    
}
