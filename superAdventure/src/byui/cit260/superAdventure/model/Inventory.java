
package byui.cit260.superAdventure.model;

import java.io.Serializable;
import java.util.Objects;


//@TODO - This class is describing an item in inventory. 
//        Inventory is analogous to a warehouse where you store items.
public class Inventory implements Serializable{
    
    private String objectName;
    private String description;
    private String objectState;
    

    public Inventory() {
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

    public String getObjectState() {
        return objectState;
    }

    public void setObjectState(String objectState) {
        this.objectState = objectState;
    }

    @Override
    public String toString() {
        return "Inventory{" + "objectName=" + objectName + ", description=" + description + ", objectState=" + objectState + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.objectName);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.objectState);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.objectName, other.objectName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.objectState, other.objectState)) {
            return false;
        }
        return true;
    }

   

  
    
}
