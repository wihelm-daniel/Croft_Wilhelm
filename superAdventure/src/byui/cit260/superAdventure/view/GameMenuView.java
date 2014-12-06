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


