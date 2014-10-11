/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.model;
import java.io.Serializable;
/**
 *
 * @author Daniel
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean visted;
    private int roomObject;

    public Location() {
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisted() {
        return visted;
    }

    public void setVisted(boolean visted) {
        this.visted = visted;
    }

    public int getRoomObject() {
        return roomObject;
    }

    public void setRoomObject(int roomObject) {
        this.roomObject = roomObject;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visted=" + visted + ", roomObject=" + roomObject + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.column;
        hash = 29 * hash + (this.visted ? 1 : 0);
        hash = 29 * hash + this.roomObject;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visted != other.visted) {
            return false;
        }
        if (this.roomObject != other.roomObject) {
            return false;
        }
        return true;
    }

   
    
    

}
