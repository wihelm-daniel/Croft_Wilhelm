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
public class PuzzleGame implements Serializable{
    
    private String objectName;
    private String description;
    private int lowRange;
    private int highRange;
    private String reward;

     public PuzzleGame() {
         this.objectName = " ";
         this.description = " ";
         this.lowRange = 0;
         this.highRange = 0;
         this.reward = " ";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLowRange() {
        return lowRange;
    }

    public void setLowRange(int lowRange) {
        this.lowRange = lowRange;
    }

    public int getHighRange() {
        return highRange;
    }

    public void setHighRange(int highRange) {
        this.highRange = highRange;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    @Override
    public String toString() {
        return "PuzzleGame{" + "objectName=" + objectName + ", description=" + description + ", lowRange=" + lowRange + ", highRange=" + highRange + ", reward=" + reward + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.objectName);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + this.lowRange;
        hash = 97 * hash + this.highRange;
        hash = 97 * hash + Objects.hashCode(this.reward);
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
        final PuzzleGame other = (PuzzleGame) obj;
        if (!Objects.equals(this.objectName, other.objectName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.lowRange != other.lowRange) {
            return false;
        }
        if (this.highRange != other.highRange) {
            return false;
        }
        if (!Objects.equals(this.reward, other.reward)) {
            return false;
        }
        return true;
    }
 

   
    
}
