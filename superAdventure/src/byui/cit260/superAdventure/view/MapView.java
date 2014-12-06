/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

import byui.cit260.superAdventure.model.RoomObject;
import java.util.Scanner;

/**
 *
 * @author Brad Croft
 */
public class MapView extends View {

    public MapView(String promptMessage) {
        super("\n"
                + "\tThe Map"
                + "The map is in a grid of a 5 x 5 square."
                + "\n\tA\tB\tC\tD\tE"
                + "\n\tF\tG\tH\tI\tJ"
                + "\n\tK\tL\tM\tN\tO"
                + "\n\tP\tR\tS\tT\tU"
                + "\n\tV\tW\tX\tY\tZ"
                + "\nEnter \"Q\" to exit the map"
        );
    }

    MapView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("Enter your map choice.");
            input = keyboard.nextLine();
            input = input.trim();

            if (input.length() < 1) {
                System.out.println("Invalid Map - The name must not be blank");
                continue;
            }
            break;
        }

        return input;
    }

    /* Instructor: 
     * What is the action to be taken place as the player visits each room.
     * You should be calling some control function or displaying some other view
     * when they visit the room not just printing out the locaton.
     */
    private void MapAView() {
        System.out.print("Map ");
        System.out.println("A");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Icee);
    }

    private void MapBView() {
        System.out.print("Map ");
        System.out.println("B");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Hottron);
    }

    private void MapCView() {
        System.out.print("Map ");
        System.out.println("C");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest4);
    }

    private void MapDView() {
        System.out.print("Map ");
        System.out.println("E");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle1);
    }

    private void MapFView() {
        System.out.print("Map ");
        System.out.println("F");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Acidface);
    }

    private void MapGView() {
        System.out.print("Map ");
        System.out.println("G");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest8);
    }

    private void MapHView() {
        System.out.print("Map ");
        System.out.println("H");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle7);
    }

    private void MapIView() {
        System.out.print("Map ");
        System.out.println("I");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.LakeBoy);
    }

    private void MapJView() {
        System.out.print("Map ");
        System.out.println("J");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.FlameBoy);
    }

    private void MapKView() {
        System.out.print("Map ");
        System.out.println("K");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle2);
    }

    private void MapLView() {
        System.out.print("Map ");
        System.out.println("L");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest7);
    }

    private void MapMView() {
        System.out.print("Map ");
        System.out.println("M");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Neutron);
    }

    private void MapNView() {
        System.out.print("Map ");
        System.out.println("N");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest6);
    }

    private void MapOView() {
        System.out.print("Map ");
        System.out.println("O");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle6);
    }

    private void MapPView() {
        System.out.print("Map ");
        System.out.println("P");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest3);
    }

    private void MapRView() {
        System.out.print("Map ");
        System.out.println("R");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Stoneface);
    }

    private void MapSView() {
        System.out.print("Map ");
        System.out.println("S");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.PlanetGuy);
    }

    private void MapTView() {
        System.out.print("Map ");
        System.out.println("T");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle4);
    }

    private void MapUView() {
        System.out.print("Map ");
        System.out.println("U");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle5);
    }

    private void MapVView() {
        System.out.print("Map ");
        System.out.println("V");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest1);
    }

    private void MapWView() {
        System.out.print("Map ");
        System.out.println("W");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle8);
    }

    private void MapXView() {
        System.out.print("Map ");
        System.out.println("X");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest2);
    }

    private void MapYView() {
        System.out.print("Map ");
        System.out.println("Y");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Chest5);
    }

    private void MapZView() {
        System.out.print("Map ");
        System.out.println("Z");
        System.out.println("In this room you found: ");
        System.out.println(RoomObject.Puzzle3);
    }

    public void doAction(char value) {
    }

    @Override
    public void doAction(String value) {
        switch (value) {
            case "A":
                this.MapAView();
                break;
            case "B":
                this.MapBView();
                break;
            case "C":
                this.MapCView();
                break;
            case "D":
                this.MapDView();
                break;
            case "E":
                this.MapAView();
                break;
            case "F":
                this.MapFView();
                break;
            case "G":
                this.MapGView();
                break;
            case "H":
                this.MapHView();
                break;
            case "I":
                this.MapIView();
                break;
            case "J":
                this.MapJView();
                break;
            case "K":
                this.MapKView();
                break;
            case "L":
                this.MapLView();
                break;
            case "M":
                this.MapMView();
                break;
            case "N":
                this.MapNView();
                break;
            case "O":
                this.MapOView();
                break;
            case "P":
                this.MapPView();
                break;
            case "R":
                this.MapRView();
                break;
            case "S":
                this.MapSView();
                break;
            case "T":
                this.MapTView();
                break;
            case "U":
                this.MapUView();
                break;
            case "V":
                this.MapVView();
                break;
            case "W":
                this.MapWView();
                break;
            case "X":
                this.MapXView();
                break;
            case "Y":
                this.MapYView();
                break;
            case "Z":
                this.MapZView();
                break;
            case "Q":
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
