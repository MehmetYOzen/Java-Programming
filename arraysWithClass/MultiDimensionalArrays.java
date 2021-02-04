/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysWithClass;

/**
 *
 * @author mehmet ozen <mehmetozen@gmail.com>
 */
public class MultiDimensionalArrays {
    
    public static void main(String[] args) {
        //Create a two-dimensional array of String values
        //each bin of which describes the contents
        //of Mehmet's technoStuff
        //We want a 6x3 grid, which  Java thinks of as 6 arrays, each with an array
        //of length 3 inside it
        String[][] technoStuff = new String[6][3];
        //Assign the description of the upper left bin
        //to the first row, first column
        technoStuff[0][0] = "Mouse, Bluetooth connection?";
        technoStuff[1][2] = "KeyBoard, Cable connection";
        technoStuff[2][1] = "Cable, USB-A to USB-C";
        technoStuff[0][1] = "Driver, 512GB";
        
        System.out.println("Value of TechnoStuff.length: " + technoStuff.length);
        
        //TODO tinkering for Thursday 4-Feb-21
        /*
        Adjust the array looping code such that the output displays
        current row and colmn count for each value
        sample:
        contents row 1:
            col 1: "blahblah
            col 2: "blahblah
            col 3: "blahblah
        contents row 2:
            col 1: "blahblah
            col 2: "blahblah
            col 3: "blahblah
        
        Extension IDEA: Can you create an output that actually draws lines
        and makes a grid display of values
        
          5 | 6 | 6  | 4
        ------------------
         8  | 9 | 24 | 2
        
        */
        //Create row and col vaiables
        int col = 0;
        int row = 0;
        //Display values of the array
        //outer for loop iterates over the rows of our 6x3 array
        for(row = 0; row < technoStuff.length; row++){
            if (technoStuff[row][col] == null){
                //If it is Empty the system will try to read empty
                //but it will fail... so we can use this to get
                //rid of nulls.
                technoStuff[row][col] = "Empty";
                    
            } else {
                //Lets type the rows and columns
                System.out.println("Row " + (row + 1));
            }
            //this inner for() loops over each column in our CURRENT row
            for(col = 0; col < technoStuff[row].length; col++){
                //Check if there are any empty spaces (nulls)
                if (technoStuff[row][col] == null){
                    //If it is Empty the system will try to read empty
                    //but it will fail... so we can use this to get
                    //rid of nulls.
                    technoStuff[row][col] = "Empty";
                    
                } else {
                    //Lets type the rows and columns
                    System.out.println("Row " + (row + 1));
                    //Now, send to console the value of the current row and col
                    System.out.println("Column " + (col + 1) + ": " + technoStuff[row][col]);
                }
            } //Close inner for over the columns
            
            //add a return character
            System.out.println();
            
        }//Close outer for over the rows
        
    }//Close main
    
}//Close Class
