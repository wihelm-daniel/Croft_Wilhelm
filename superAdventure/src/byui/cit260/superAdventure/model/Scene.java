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
class Scene implements Serializable{
    
    private String Description;
    private String objectSymbol;
    private int travelTime;
    
    public Scene() {

}

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getObjectSymbol() {
        return objectSymbol;
    }

    public void setObjectSymbol(String objectSymbol) {
        this.objectSymbol = objectSymbol;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Description);
        hash = 79 * hash + Objects.hashCode(this.objectSymbol);
        hash = 79 * hash + this.travelTime;
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.objectSymbol, other.objectSymbol)) {
            return false;
        }
        if (this.travelTime != other.travelTime) {
            return false;
        }
        return true;
    }

    
    
}
