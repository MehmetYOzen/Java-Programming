/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysWithClass;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Object to manage and display an array of String representing collected items
 *
 * @author mehmet ozen <mehmetozen@gmail.com>
 */
public class CollectedItems {

    //MEMBER VARIABLES
    private String[] collectionArray;
    private String title;
    private double[] valueCost;

    //MEMBER METHODS
    /**
     * Constructor-like method that creates our array of collected items and a
     * title
     *
     * @param collectionSize how many items you plan to store
     * @param t name of the collection
     */
    public void setupCollection(int collectionSize, String t) {
        // Create a Scanner instance
        Scanner inPut = new Scanner(System.in);

        //title
        t = inPut.nextLine(); //Inputing String
        
        //passing to the next line.
        System.out.println("");
        
        //Ask the user to input item number
        System.out.println("How many items do you want to collect?");
        System.out.print("Enter the number: ");
        
        // use Scanner to read an integer from user
        collectionSize = inPut.nextInt();

        //Checking if its negative
        while (collectionSize < 0) {
            System.out.println("Uhmm I guess it has to be a positive+ number, try again:");
            collectionSize = inPut.nextInt();
        }
        //Cleaning buffer
        inPut.nextLine();

        //Passing to the next line
        System.out.println("");
        
        // Create an array of the requested size, store in collectionArray
        collectionArray = new String[collectionSize];// operating on my member variables
        valueCost = new double[collectionSize];// operating on my member variables
        title = t;//inject the given String as the title

    } // close setupCollection

    /**
     * Adds the given item to this object's internal array
     *
     * @param cost
     * @param itemName the title of the item to store
     */
    public void insertItem(String itemName, double cost) {
        //Take the cost as a valueCost

        //Create a scanner
        Scanner inPut = new Scanner(System.in);
        
        // Loop over collectionArray, and store the item in
        for (int i = 0; i < collectionArray.length; i++) {

            // Ask for the name and the value for the items
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            itemName = inPut.nextLine();
            collectionArray[i] = itemName;

            //asking user to enter values for each item.
            System.out.print("The value of " + collectionArray[i] + ": " + "$");
            cost = inPut.nextDouble();
            
            //Taking the value - item cost
            valueCost[i] = cost;

            //Cleaning buffer
            inPut.nextLine();

            //Checking the value if its negative
            while (valueCost[i] < 0) {
                System.out.print("I am so sure this is not the right value! Try again: ");
                //Taking the value - item cost again!
                cost = inPut.nextDouble();
                
                //attaching the cost to array
                valueCost[i] = cost;
                
                //Cleaning buffer
                inPut.nextLine();
            }//while loop close
            
            //Passing to the next line
            System.out.println("");
        } //while loop close

        // Pass to the next line
        System.out.println("");
    } // close insertItem

    public void createMenu() {
        //variables
        int menu = 0;
        int itemSelect = 1;

        // Create a Scanner instance
        Scanner inPut = new Scanner(System.in);

        //Create a switch in a while to use the menu - While menu setted to 6 because 6 is exit!
        while (menu != 5) {
            //Passing to the next 2 lines.
            System.out.println("");
            System.out.println("");

            //Taking the menu inPut.
            System.out.print("Enter the number to use menu: ");
            menu = inPut.nextInt();

            //passing to the next line 
            System.out.println("");

            //switch menu open
            switch (menu) {
                //Renaming an Item - WORKS WELL!
                case 1:
                    renamingItem(itemSelect);
                    break;
                //Renaming a Collection - WORKS WELL
                case 2:
                    renameCollection();
                    break;

                //Changing the value of item - WORKS WELL!
                case 3:
                    valueChange(itemSelect);
                    break;

                //Displaying Items - WORKS WELL!
                case 4:
                    // Display all collected items
                    displayCollection();
                    break;

                //Exiting - WORKS WELL
                case 5:
                    System.out.println("Ohh ok... bye!");
                    break;

                //default - WORKS WELL
                default:
                    System.out.println("Whoops try to enter a number from the menu please:");
                    break;
            }//Close switch menu
        }//Close while loop
    }//Close createMenu

    //Menu Cases for switch
    //(1) Renaming item
    public void renamingItem(int item) {
        // Create a Scanner instance
        Scanner inPut = new Scanner(System.in);
        item = 1;
        //Using While to repeat renaming procces until the user presses something else
        while (item < collectionArray.length && item > 0) {
            //Asking for the Item number
            System.out.println("Please Select the Item number to rename");
            System.out.print("(or type any other number to go back!): ");

            //item Input
            item = inPut.nextInt();

            //if Item doesn't exist
            if (item > collectionArray.length || item <= 0) {
                System.out.println("Going back to the menu...");
            } else {
                //normally itemArray starts from 0 so we have to decrease the itemSelect by 1
                item--;

                //Asking to rename
                System.out.print("Enter the new name of " + Arrays.asList(collectionArray[item]) + ": ");

                //Cleaning buffer
                inPut.nextLine();

                //taking the new name input
                collectionArray[item] = inPut.nextLine();

                //showing the new name
                System.out.println("Congrats the new name is: " + Arrays.asList(collectionArray[item]));
            }//Else Close
        }//While Close
    }//close renamingItem

    //(2) Renaming Collection
    public void renameCollection() {
        // Create a Scanner instance
        Scanner inPut = new Scanner(System.in);

        //Passing to other line
        System.out.println("");

        //Asking for the collection number.
        System.out.println("Enter a new name to change " + title + ": ");

        //Renaming
        title = inPut.nextLine();

        //Succes!
        System.out.println("Succesfully changed to " + title);
    }

    //(3) Value Change
    public void valueChange(int item) {
        // Create a Scanner instance
        Scanner inPut = new Scanner(System.in);

        //giving item a value
        item = 1;

        //Using While to repeat renaming procces until the user presses something else
        while (item < valueCost.length && item > 0) {
            //asking the item number
            System.out.println("Which Item you want to change the value of?");
            System.out.print("Enter the number of Item: ");

            //taking the itemnumber
            item = inPut.nextInt();

            //calculating
            if (item > valueCost.length || item <= 0) {
                //giving error
                System.out.println("No item found...");
            } else {
                //normally itemArray starts from 0 so we have to decrease the itemSelect by 1
                item--;

                //asking for the new value of item
                System.out.print("Enter the new value of " + Arrays.asList(valueCost[item]) + ": $");

                //Cleaning buffer
                inPut.nextLine();

                //taking the new cost
                valueCost[item] = inPut.nextDouble();
                
                //showing the new value of item
                System.out.println("Congrats the new value is: "
                        + Arrays.asList(valueCost[item]));
            }//Else Close
        }//Wihle Close
    }//Close valueChange

    //(4) Display Item
    public void displayCollection() {
        //Passing to the next line.
        System.out.println("");

        //Showing title of collection and items
        System.out.println("Items in " + Arrays.asList(title) + ":");//Display the title
        for (int r = 0; r < collectionArray.length; r++) {//Create for loop to display items

            //displaying item name
            System.out.println("Item " + (r + 1) + ": " + Arrays.asList(collectionArray[r]));

            //displaying item value
            System.out.println("Cost($): " + Arrays.asList(valueCost[r]));

            //Passing to the next line
            System.out.println("");
        } // close for

    } // close displayCollection

} // close class
