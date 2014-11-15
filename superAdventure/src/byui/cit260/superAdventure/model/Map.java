/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.model;
import byui.cit260.superAdventure.control.MapControl;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;
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
       ImageIcon startingSceneImage = MapControl.getimage(startingScene, "/byui/cit260.superAdventure/images/startingPoint.jpg");
       startingScene.setIcon(startingSceneImage);
       scenes[SceneType.start.ordinal()] = startingScene;
       
       Scene finishScene = new Scene();
       finishScene.setDescription("\n"+
               "Congratualation. The city is safe and you have their undying"+
               "gratitude! Well done. Now get some sleep.");
       finishScene.setobjectSymbol("X");
       finishScene.setTravelTime(Double.POSITIVE_INFINITY);
       ImageIcon startingSceneImage = MapControl.getimage(startingScene, "/byui/cit260.superAdventure/images/finish.jpg");
       finishScene.setIcon(finishSceneImage);
       scenes[SceneType.finish.ordinal()] = finishScene;
   }

    private Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public enum SceneType {
       start, villain1, villain2, villain3, villain4, villain5, villain6, villain7,
       villain8, puzzle1, puzzle2, puzzle3, puzzle4, puzzle5, puzzle6, puzzle7,
       puzzle8, chest1, chest2, chest3, chest4, chest5, chest6, chest7, chest8,
       finish
   }
   
   private static void assignScenesToLocations(Map map, Scene[] scense) {
       Location[][] locations = map.getLocations();
       
       locations [0][0].setScene(scenes[SceneType.start.ordinal()]);
       locations [0][1].setScene(scenes[SceneType.villain7.ordinal()]);
       locations [0][2].setScene(scenes[SceneType.puzzle4.ordinal()]);
       locations [0][3].setScene(scenes[SceneType.chest2.ordinal()]);
       locations [0][4].setScene(scenes[SceneType.villain2.ordinal()]);
       locations [1][0].setScene(scenes[SceneType.puzzle1.ordinal()]);
       locations [1][1].setScene(scenes[SceneType.chest3.o3rdinal()]);
       locations [1][2].setScene(scenes[SceneType.villain4.ordinal()]);
       locations [1][3].setScene(scenes[SceneType.puzzle8.ordinal()]);
       locations [1][4].setScene(scenes[SceneType.chest5.ordinal()]);
       locations [2][0].setScene(scenes[SceneType.villain1.ordinal()]);
       locations [2][1].setScene(scenes[SceneType.puzzle7.ordinal()]);
       locations [2][2].setScene(scenes[SceneType.chest6.ordinal()]);
       locations [2][3].setScene(scenes[SceneType.villain3.ordinal()]);
       locations [2][4].setScene(scenes[SceneType.puzzle5.ordinal()]);
       locations [3][0].setScene(scenes[SceneType.chest1.ordinal()]);
       locations [3][1].setScene(scenes[SceneType.villain8.ordinal()]);
       locations [3][2].setScene(scenes[SceneType.puzzle2.ordinal()]);
       locations [3][3].setScene(scenes[SceneType.chest7.ordinal()]);
       locations [3][4].setScene(scenes[SceneType.villain6.ordinal()]);
       locations [4][0].setScene(scenes[SceneType.puzzle3.ordinal()]);
       locations [4][1].setScene(scenes[SceneType.chest4.ordinal()]);
       locations [4][2].setScene(scenes[SceneType.villain5.ordinal()]);
       locations [4][3].setScene(scenes[SceneType.puzzle6.ordinal()]);
       locations [4][4].setScene(scenes[SceneType.chest8.ordinal()])
   }
}
}
