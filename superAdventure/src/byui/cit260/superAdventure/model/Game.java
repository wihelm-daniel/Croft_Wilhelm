
package byui.cit260.superAdventure.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;


public class Game implements Serializable{
    
    private String nameOfGame;
    private Player playerName;
    private Player playerLocation;
    
  
       
   public Game() {
       this.nameOfGame = " ";
       this.playerName = null;
       this.playerLocation = null;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public Player getPlayerName() {
        return playerName;
    }

    public void setPlayerName(Player playerName) {
        this.playerName = playerName;
    }

    public Player getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Player playerLocation) {
        this.playerLocation = playerLocation;
    }

    public InventoryArrayList[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryArrayList[] inventory) {
        this.inventory = inventory;
    }

    public LocationArrayList[] getLocation() {
        return location;
    }

    public void setLocation(LocationArrayList[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Game{" + "nameOfGame=" + nameOfGame + ", playerName=" + playerName + ", playerLocation=" + playerLocation + ", inventory=" + inventory + ", location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nameOfGame);
        hash = 97 * hash + Objects.hashCode(this.playerName);
        hash = 97 * hash + Objects.hashCode(this.playerLocation);
        hash = 97 * hash + Arrays.deepHashCode(this.inventory);
        hash = 97 * hash + Arrays.deepHashCode(this.location);
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
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    public void setMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
