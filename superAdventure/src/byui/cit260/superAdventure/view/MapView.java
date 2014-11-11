/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;

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
                + "\n\tP\tQ\tR\tS\tT"
                + "\n\tU\tV\tW\tX\tY"
                + "\nEnter \"Z\" to exit the map"
        );
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
    }

    private void MapBView() {
        System.out.print("Map ");
        System.out.println("B");
    }

    private void MapCView() {
        System.out.print("Map ");
        System.out.println("C");
    }

    private void MapDView() {
        System.out.print("Map ");
        System.out.println("E");
    }

    private void MapFView() {
        System.out.print("Map ");
        System.out.println("F");
    }

    private void MapGView() {
        System.out.print("Map ");
        System.out.println("G");
    }

    private void MapHView() {
        System.out.print("Map ");
        System.out.println("H");
    }

    private void MapIView() {
        System.out.print("Map ");
        System.out.println("I");
    }

    private void MapJView() {
        System.out.print("Map ");
        System.out.println("J");
    }

    private void MapKView() {
        System.out.print("Map ");
        System.out.println("K");
    }

    private void MapLView() {
        System.out.print("Map ");
        System.out.println("L");
    }

    private void MapMView() {
        System.out.print("Map ");
        System.out.println("M");
    }

    private void MapNView() {
        System.out.print("Map ");
        System.out.println("N");
    }

    private void MapOView() {
        System.out.print("Map ");
        System.out.println("O");
    }

    private void MapPView() {
        System.out.print("Map ");
        System.out.println("P");
    }

    private void MapQView() {
        System.out.print("Map ");
        System.out.println("Q");
    }

    private void MapRView() {
        System.out.print("Map ");
        System.out.println("R");
    }

    private void MapSView() {
        System.out.print("Map ");
        System.out.println("S");
    }

    private void MapTView() {
        System.out.print("Map ");
        System.out.println("T");
    }

    private void MapUView() {
        System.out.print("Map ");
        System.out.println("U");
    }

    private void MapVView() {
        System.out.print("Map ");
        System.out.println("V");
    }

    private void MapWView() {
        System.out.print("Map ");
        System.out.println("W");
    }

    private void MapXView() {
        System.out.print("Map ");
        System.out.println("X");
    }

    private void MapYView() {
        System.out.print("Map ");
        System.out.println("Y");
    }

    
    public void doAction(char value) {
    }

    @Override
    public void doAction(String value) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
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
            case "Q":
                this.MapQView();
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
                return; // Some reason its not returning to the previous menu.
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
        
        
        
    }

}
