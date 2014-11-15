/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.model;

/** 
 *
 * @author Daniel
 */
class Location {
    
    private int row;
    private int column;
    private int objectName;
    
    public Location() {
        this.row;
        this.column;
        this.objectName;    
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getObjectName() {
        return objectName;
    }

    public void setObjectName(int objectName) {
        this.objectName = objectName;
    }
    
   @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", objectName=" + objectName + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.column;
        hash = 89 * hash + this.objectName;
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
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.objectName != other.objectName) {
            return false;
        }
        return true;
    }'
}

    void setobjectSymbol(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
