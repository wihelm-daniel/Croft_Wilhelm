/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;
import byui.cit260.superAdventure.control.GameControl;
import byui.cit260.superAdventure.control.RoomObjectControl;
import byui.cit260.superAdventure.model.RoomObject;
import superadventure.SuperAdventure;
/**
 *
 * @author Daniel (Entire file)
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
    
    @Override
       public boolean doAction(String value) {
           
           value = value.toUpperCase();
           char choice = value.charAt(0);
        
        switch (choice){
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.startSavedGame();
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
                return true;
            default:
                ErrorView.display("MainMenuView",
                        "*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void startNewGame() {
       GameControl.createNewGame(SuperAdventure.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

     private void startSavedGame() {
        System.out.println("\n\nEnter the file path for the file where the game "
                         + "was saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = GameMenuView();
        gameMenu.display();
     }

    private void saveGame() {
        System.out.println("\n\nEnter the file path for file where the game "
                        + "is to be saved.");
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(SuperAdventure.getCurrentGame(), filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    private void getHelp() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

   

    private void listRoomObject() {
       System.out.println("0\n\nEnter the file path to save list to.");
       String filePath = this.getInput();
       
       try {
            RoomObjectControl.saveList(RoomObject.RoomObject<>, filePath), filePath)filePath);
       } catch (Exception ex){
           ErrorView.display("MainMenuVeiw - listRoomObject", ex.getMessage());
       }
               
               
    }

   
   
}
