package superadventure;

import byui.cit260.superAdventure.model.Game;
import byui.cit260.superAdventure.model.Inventory;
import byui.cit260.superAdventure.model.Keys;
import byui.cit260.superAdventure.model.Location;
import byui.cit260.superAdventure.model.Locks;
import byui.cit260.superAdventure.model.Player;
import byui.cit260.superAdventure.model.Puzzles;
import byui.cit260.superAdventure.model.RoomObject;
import byui.cit260.superAdventure.model.Villains;
import java.util.HashSet;
import java.util.Set;

public class SuperAdventure {

    public static void main(String[] args) {

        //Dan
        Player playerOne = new Player();
        playerOne.setName("Fred Flinstone");
        playerOne.setTime(7.00);
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        //Brad
        Keys keysOne = new Keys();
        keysOne.setKeyShape("Circle");
        String keyInfo = keysOne.toString();

        System.out.println(keyInfo);

        //Dan
        Location loc = new Location();
        loc.setRow(4);
        loc.setColumn(2);
        loc.setVisted(true);
        loc.setRoomObject(7);
        String locInfo = loc.toString();
        System.out.println(locInfo);

        //Dan
        RoomObject rObject = new RoomObject();
        rObject.setType(2);
        rObject.setName("Treasure Chest #3");
        rObject.setMessage("Can you open me?");
        rObject.setExitClue("Ether Power works on the villain from space.");
        rObject.setTreasure(14);
        String rObjectInfo = rObject.toString();
        System.out.println(rObjectInfo);

        //Dan
        Villains vil = new Villains();
        vil.setWeakness(4);
        vil.setTaunts("I will destroy you!");
        vil.setSuccessMessage("Asto is down for the count!");
        String vilInfo = vil.toString();
        System.out.println(vilInfo);

        //Dan
        Puzzles puz = new Puzzles();
        puz.setQuestion("What is 4^2");
        puz.setAnswer("16");
        puz.setHints("It rhymes with ixteen");
        puz.setSuccessMessage("You are, like, wicked smart");

        //Dan
        Locks lock = new Locks();
        lock.setLockShape("Oval");
        lock.setHints("The Presidents Office");
        lock.setTreasure(4);
        String lockInfo = lock.toString();
        System.out.println(lockInfo);

        //Brad
        Inventory inv = new Inventory();
        inv.setItem("Sword");
        inv.setUsed(4);
        inv.setQuantity(2);
        String invDetails = inv.toString();
        System.out.println(invDetails);

        //Brad
        Game gameClass = new Game();
        gameClass.setNameOfGame("Super Adventure");
        gameClass.setNumOfMaps("5 Levels");
        gameClass.setRoomObjects("Various Objects are found in each room");
        gameClass.setInventoryItemCount("Each player can have various amounts of inventory that they carry");
        String gameDetails = gameClass.toString();
        System.out.println(gameDetails);

    }

    public static Player getPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
