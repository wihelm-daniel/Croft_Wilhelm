
package byui.cit260.superAdventure.model;

import java.io.Serializable;
import java.util.Objects;


//@TODO - This class is describing an item in inventory. 
//        Inventory is analogous to a warehouse where you store items.
public class Inventory implements Serializable{
    
    private String item;
    
    //@TODO - You might want to add an attribute for description
    
    private int used;
    private int quantity;

    public Inventory() {
    }

       
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Inventory{" + "item=" + item + ", used=" + used + ", quantity=" + quantity + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.item);
        hash = 71 * hash + this.used;
        hash = 71 * hash + this.quantity;
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
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (this.used != other.used) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        return true;
    }
    
    
    
   
    
    
}
