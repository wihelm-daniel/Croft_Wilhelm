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

public class Locks implements Serializable{
    
    private String lockShape;
    private String hints; // @TODO - is this really plural. Is there more than one hint?
    private int treasure;

     public Locks() {
    }
    
    public String getLockShape() {
        return lockShape;
    }

    public void setLockShape(String lockShape) {
        this.lockShape = lockShape;
    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    @Override
    public String toString() {
        return "Locks{" + "lockShape=" + lockShape + ", hints=" + hints + ", treasure=" + treasure + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.lockShape);
        hash = 53 * hash + Objects.hashCode(this.hints);
        hash = 53 * hash + this.treasure;
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
        final Locks other = (Locks) obj;
        if (!Objects.equals(this.lockShape, other.lockShape)) {
            return false;
        }
        if (!Objects.equals(this.hints, other.hints)) {
            return false;
        }
        if (this.treasure != other.treasure) {
            return false;
        }
        return true;
    }

    
    
}
