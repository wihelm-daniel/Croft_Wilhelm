
package byui.cit260.superAdventure.model;

import java.io.Serializable;
import java.util.Objects;




public class Keys implements Serializable{
    private String keyShape;

    public String getKeyShape() {
        return keyShape;
    }

    public void setKeyShape(String keyShape) {
        this.keyShape = keyShape;
    }

    public Keys() {
    }

    @Override
    public String toString() {
        return "Keys{" + "keyShape=" + keyShape + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.keyShape);
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
        final Keys other = (Keys) obj;
        if (!Objects.equals(this.keyShape, other.keyShape)) {
            return false;
        }
        return true;
    }

    public void keyShape(String circle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
    
    
}
