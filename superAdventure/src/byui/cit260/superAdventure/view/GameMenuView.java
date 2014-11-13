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
public class GameMenuView extends View{
    
          public GameMenuView(){ 

    super("\n" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+              Game Menu               +" +
            "\n++++++++++++++++++++++++++++++++++++++++" +
            "\n+ L - Look at an object                +" +
            "\n+ X - Exit Room                        +" + 
            "\n+ I - Inventory                        +" +
            "\n+ M - View Map                         +" +
            "\n+ S - Save game and continue playing   +" +
            "\n+ Q - Quit to Main Menu                +" +
            "\n++++++++++++++++++++++++++++++++++++++++");
          }
   /* void displayMenu() {
         char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'Q');
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
            case 'L':
                this.lookAtObject();
                break;
            case 'X':
                this.exitRoom();
            case 'I':
                this.listInventory();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'S':
                this.saveProgress();
                break;
            case 'Q':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    }
}

    private void lookAtObject() {
        System.out.println("\n lookAtObject called");
    }
    
    private void listInventory() {
         System.out.println("\n listInventory called");
    }
   
    private void exitRoom() {
        System.out.println("\n exitRoom called");
    }
   

    private void viewMap() {
        MapView mapMenu = new MapView();
        mapMenu.displayMenu();
        //System.out.println("\n viewMap called");
    }

    private void saveProgress() {
       System.out.println("\n saveProgress called");
    }

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


