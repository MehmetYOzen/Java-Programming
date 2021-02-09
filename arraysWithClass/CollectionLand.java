
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysWithClass;
/**
 *
 * @author mehmet ozen <mehmetozen159@gmail.com>
 */
public class CollectionLand {
    /**
     * Front door
     * @param args 
     */
    public static void main(String[] args) {
        // When possible, do as little coding in main
        //call startUserInputtedCollection
        startUserInputtedCollection();
    } // close main
    
    /**
     * Method which allows users to add an item to a collection
     * and view its output
     */
    public static void startUserInputtedCollection(){
        
        // Make an instance of my CollectedItems
        CollectedItems elecTools = new CollectedItems();
        
        
        //Ask the user to input the number of item
        System.out.println("Welcome to the collection tools!!");
        System.out.println();
        System.out.println("Enter the name of");
        System.out.print("your collection: ");
        
        
        //Feeding the collection with its name and the number of items
        int numOfItems = 0;
        String collectionName = "N/A";
        elecTools.setupCollection(numOfItems, collectionName);
        
        
        //Call the insertItem method to get the values from user
        String itemNames = "N/A";
        double itemValue = 0;
        elecTools.insertItem(itemNames, itemValue);
        
        
        // Display all collected items
        elecTools.displayCollection();      
        System.out.println("");
        
        //menu
        System.out.println("     !Menu!");
        System.out.println("(1) Rename Item...");
        System.out.println("(2) Rename Collection...");
        System.out.println("(3) Change the value of item Collection...");
        System.out.println("(4) Display Collections and Items...");
        System.out.println("(5) Exit!");
        
        
        //create menu
        elecTools.createMenu();
       
        
    }//Close startUserInputtedCollection
}//Close Class