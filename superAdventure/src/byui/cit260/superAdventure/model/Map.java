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
public class Map implements Serializable{
    
    private int row;
    private int column;

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
    private String objectName;
    private char objectSymbol;
    private int objectState;

    public Map(){
    }
    
    public Map(int noOfRows, int noOfColumns) {
    
           if (noOfRows <1 || noOfColumns <1) {
            System.out.println("The number of row and columns must be > zero.");
            return;
        }
           this.noOfRows = noOfRows;
           this.noOfColumns = noOfColumns;
           
           this.locations = new Location[noOfRows][noOfColumns];
           
           for (int row = 0; row < noOfRows; row++) {
               for (int column = 0; column < noOfColumns; column++) {
                   
                   Location location = new Location();
                   location.setColumn(column);
                   location.setRow(row);
                   location.setobjectSymbol("?");
                   
                   locations[row][column] = location;
               }
           }
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public char getObjectSymbol() {
        return objectSymbol;
    }

    public void setObjectSymbol(char objectSymbol) {
        this.objectSymbol = objectSymbol;
    }

    public int getObjectState() {
        return objectState;
    }

    public void setObjectState(int objectState) {
        this.objectState = objectState;
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + ", objectName=" + objectName + ", objectSymbol=" + objectSymbol + ", objectState=" + objectState + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + Objects.hashCode(this.objectName);
        hash = 79 * hash + this.objectSymbol;
        hash = 79 * hash + this.objectState;
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
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.objectName, other.objectName)) {
            return false;
        }
        if (this.objectSymbol != other.objectSymbol) {
            return false;
        }
        if (this.objectState != other.objectState) {
            return false;
        }
        return true;
    }

   private static Scene[] createScenes() throws MapControlExeption {
       BufferedImage image = null;
       
       Game game = SuperAdventure.getCurrentGame();
       
       Scene[] scenes = new Scene[SceneType.vaules().length];
       
       Scene startingScene = new Scene();
       startingScene.setDescription("\n" +
               "You arrive at Champion city. You find a newspaper lying on" +
               "the ground. It tells of eight villains who are terroiaing" +
               "the city. You know you have it in you to free the city of" +
               "these wicked villains. You set off to take care of business.");
       startingScene.setobjectSymbol("S");
       startingScene.setBlocked(false);
       startingScene.setTravelTime(240);
       ImageIcon startingSceneImage = MapControl.getimage(startingScene, /)
       
   }
    
    
}