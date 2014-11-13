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
public enum RoomObject implements Serializable {

   none(' ')
    Icee('V,')
FlameBoy('V,')
PlanetGuy('V,')
        LakeBoy('V,')
        StoneFace('V,')
    AcidFace('V,')
        Neutron('V,')
    Hottron('V,')
        Puzzle1('P,')
    Puzzle2('P,')
        Puzzle3('P,')
    Puzzle4('P,')
        Puzzle5('P,')
    Puzzle6('P,')
        Puzzle7('P,')
    Puzzle8('P,')
        Chest1('C,')
    Chest2('C,')
        Chest3('C,')
    Chest4('C,')
        Chest5('C,')
    Chest6('C,')
        Chest7('C,')
    Chest8('C,')
    
    



private final char objectSymbol;

    public RoomObject(String objectName) {
this.objectName = objectName;
this.objectSymbol = objectSymbol;
    }

    
   

    public char getObjectSymbol() {
        return objectSymbol;
    }

   

    @Override
        public String toString() {
        return "RoomObject{" + "objectName=" + objectName + ", objectSymbol=" + objectSymbol + '}';
    }

    @Override
        public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.objectName);
        hash = 89 * hash + this.objectSymbol;
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
        if (!Objects.equals(this.objectName, other.objectName)) {
            return false;
        }
        if (this.objectSymbol != other.objectSymbol) {
            return false;
        }
        return true;
    }

}
