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
public class Villains implements Serializable{
    
    private int weakness;
    private String taunts; //@TODO - Is there more than one taunt?
    private String successMessage;

    public Villains() {
    }
    
    public int getWeakness() {
        return weakness;
    }

    public void setWeakness(int weakness) {
        this.weakness = weakness;
    }

    public String getTaunts() {
        return taunts;
    }

    public void setTaunts(String taunts) {
        this.taunts = taunts;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    @Override
    public String toString() {
        return "Villains{" + "weakness=" + weakness + ", taunts=" + taunts + ", successMessage=" + successMessage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.weakness;
        hash = 37 * hash + Objects.hashCode(this.taunts);
        hash = 37 * hash + Objects.hashCode(this.successMessage);
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
        final Villains other = (Villains) obj;
        if (this.weakness != other.weakness) {
            return false;
        }
        if (!Objects.equals(this.taunts, other.taunts)) {
            return false;
        }
        if (!Objects.equals(this.successMessage, other.successMessage)) {
            return false;
        }
        return true;
    }

    
    
}
