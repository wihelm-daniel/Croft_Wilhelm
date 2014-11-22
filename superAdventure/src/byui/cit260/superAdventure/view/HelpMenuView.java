/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.superAdventure.view;
/**
 *
 * @author Daniel
 */
public class HelpMenuView extends View{
       
    public HelpMenuView(){
        super("\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Help Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ G - Game play                        +" +
            "\n+ Z - Puzzles                          +" +
            "\n+ T - Treasure Chests                  +" +
            "\n+ V - Villians                         +" +
            "\n+ P - Power Crystals                   +" +
            "\n+ C - Clues                            +" + 
            "\n+ K - Keys                             +" +
            "\n+ W - Winning the game                 +" +
            "\n+ E - Exit to Main Menu                +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
     
    /*void displayMenu() {
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'E');
    }

    private String getInput() {
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
            case 'G':
                this.gamePlayHelpView();
                break;
            case 'Z':
                this.puzzleHelpView();
                break;
            case 'T':
                this.TreasureHelpView();
                break;
            case 'V':
                this.villainsView();
                break;
            case 'P':
                this.powerCrystalHelpView();
                break;
            case 'C':
                this.clueHelpView();
                break;
            case 'K':
                this.keyHelpView();
                break;
            case 'W':
                this.winGameHelpView();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
    }

    private void gamePlayHelpView() {
        GamePlayHelpView gamePlayHelp = new GamePlayHelpView();
        gamePlayHelp.displayMenu();
        
    }

    private void puzzleHelpView() {
        System.out.println("\n puzzleHelpView called");
    }
    
    private void TreasureHelpView() {
        System.out.println("\n TreasureHelpView called");
        // Added by Brad
        TreasureView treasureView = new TreasureView();
        treasureView.displayTreasure();
        // End of Brad's additions
    }
   
    private void villainsView() {
        System.out.println("\n villainsView called");
    }

    private void powerCrystalHelpView() {
        System.out.println("\n powerCrystalHelpView called");
    }

    private void clueHelpView() {
        ClueView clueMenu = new ClueView();
        clueMenu.displayMenu();
        //System.out.println("\n clueHelpView called");
    }

    private void keyHelpView() {
        System.out.println("\n keyHelpView called");
    }

    private void winGameHelpView() {
        System.out.println("\n winGameHelpView called");
    }

    
}
