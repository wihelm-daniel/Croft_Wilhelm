/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Daniel
 */
public class Location implements Serializable{
    
    private int roomNumber;
    private String objectName;
    private char objectSymbol;
    private int objectState;

    public Location() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public char getObjectSymbol() {
        return objectSymbol;
    }

    public void setObjectSymbol(char objectSymbol) {
        this.objectSymbol = objectSymbol;
    }

    public int getObjectState() {
        return objectState;
    }

    public void setObjectState(int objectState) {
        this.objectState = objectState;
    }

    @Override
    public String toString() {
        return "Location{" + "roomNumber=" + roomNumber + ", objectName=" + objectName + ", objectSymbol=" + objectSymbol + ", objectState=" + objectState + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.roomNumber;
        hash = 79 * hash + Objects.hashCode(this.objectName);
        hash = 79 * hash + this.objectSymbol;
        hash = 79 * hash + this.objectState;
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
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        if (!Objects.equals(this.objectName, other.objectName)) {
            return false;
        }
        if (this.objectSymbol != other.objectSymbol) {
            return false;
        }
        if (this.objectState != other.objectState) {
            return false;
        }
        return true;
    }
    
}