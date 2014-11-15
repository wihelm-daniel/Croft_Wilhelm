/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;
import byui.cit260.superAdventure.control.GameControl;
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
            "\n+ Q - Quit                             +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
    }
    
    
    
    
  /*  private final String MENU = "\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Main Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ N - New game                         +" +
            "\n+ L - Load the game                    +" +
            "\n+ S - Save the game                    +" +
            "\n+ H - Get help on how to play the game +" +
            "\n+ E - Exit                             +" +
            "\n++++++++++++++++++++++++++++++++++++++++";
   
    
    public void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
    }

    public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            System.out.println("Enter your menu choice.");
            input = keyboard.nextLine();
            input = input.trim();
            
            if(input.length() < 1) {
                System.out.println("Invaild Name - The name must not be blank");
                continue;
                }
            break;
        }
        
        return input;
    }
    */

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
}
