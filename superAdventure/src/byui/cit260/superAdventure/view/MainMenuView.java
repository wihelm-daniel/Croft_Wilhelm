/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;
import byui.cit260.superAdventure.control.GameControl;
import byui.cit260.superAdventure.model.RoomObject;
import superadventure.SuperAdventure;
/**
 *
 * @author Daniel
 */
public class MainMenuView extends View{
    
    public MainMenuView(){
    super ("\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Main Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ N - New game                         +" +
            "\n+ L - Load the game                    +" +
            "\n+ S - Save the game                    +" +
            "\n+ H - Get help on how to play the game +" +
            "\n+ O - List the Objects in the game     +" +
            "\n+ Q - Quit                             +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
    }
    
    
       private void doAction(char choice) {
        
        switch (choice){
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.loadGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'H':
                this.getHelp();
            case 'O':
                this.listRoomObject();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
    }

    private void startNewGame() {
       GameControl.createNewGame(SuperAdventure.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        System.out.println("\n*** loadGame called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame called ***");
    }
    private void getHelp() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listRoomObject() {
        RoomObject.listRoomObjects();
    }
}
