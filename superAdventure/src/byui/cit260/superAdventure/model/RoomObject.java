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
public class RoomObject implements Serializable{
    
    private int type;
    private String name;
    private String message;
    private String exitClue;
    private int treasure;

    public RoomObject() {
    }
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExitClue() {
        return exitClue;
    }

    public void setExitClue(String exitClue) {
        this.exitClue = exitClue;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    @Override
    public String toString() {
        return "RoomObject{" + "type=" + type + ", name=" + name + ", message=" + message + ", exitClue=" + exitClue + ", treasure=" + treasure + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.type;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.message);
        hash = 83 * hash + Objects.hashCode(this.exitClue);
        hash = 83 * hash + this.treasure;
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
        final RoomObject other = (RoomObject) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        if (!Objects.equals(this.exitClue, other.exitClue)) {
            return false;
        }
        if (this.treasure != other.treasure) {
            return false;
        }
        return true;
    }

    
        
}
