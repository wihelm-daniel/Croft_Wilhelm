
package byui.cit260.superAdventure.model;

import java.util.Objects;


public class Game {
    
    private String nameOfGame;
    
    
    private String numOfMaps;// @TODO - change to int data type
    private String roomObjects; // @TODO - change to int data type   
    private String inventoryItemCount; // @TODO - change to int data type

    public Game() {
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public String getNumOfMaps() {
        return numOfMaps;
    }

    public void setNumOfMaps(String numOfMaps) {
        this.numOfMaps = numOfMaps;
    }

    public String getRoomObjects() {
        return roomObjects;
    }

    public void setRoomObjects(String roomObjects) {
        this.roomObjects = roomObjects;
    }

    public String getInventoryItemCount() {
        return inventoryItemCount;
    }

    public void setInventoryItemCount(String inventoryItemCount) {
        this.inventoryItemCount = inventoryItemCount;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + nameOfGame + ", maps=" + numOfMaps + ", roomObjects=" + roomObjects + ", inventoryItemCount=" + inventoryItemCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nameOfGame);
        hash = 37 * hash + Objects.hashCode(this.numOfMaps);
        hash = 37 * hash + Objects.hashCode(this.roomObjects);
        hash = 37 * hash + Objects.hashCode(this.inventoryItemCount);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.nameOfGame, other.nameOfGame)) {
            return false;
        }
        if (!Objects.equals(this.numOfMaps, other.numOfMaps)) {
            return false;
        }
        if (!Objects.equals(this.roomObjects, other.roomObjects)) {
            return false;
        }
        if (!Objects.equals(this.inventoryItemCount, other.inventoryItemCount)) {
            return false;
        }
        return true;
    }

   
    
    
    
}
