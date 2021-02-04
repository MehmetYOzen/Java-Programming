/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysWithClass;

import java.util.Scanner;

/**
 *
 * @author mehme
 */
public class LyricMachine {
    String[][] lyrics;
    String songTitle;
    String artist;
    int releaseYear;
    
    /**
     * Call this method first to create the container in which we'll
     * store our song's lyrics
     * @param maxLinesInVerse
     * @param numVerses 
     */
    public void initializeArray(int maxLinesInVerse, int numVerses){
        if(maxLinesInVerse > 0 && numVerses > 0){
            //initialize array of a given size
            lyrics = new String[maxLinesInVerse][numVerses];
            System.out.println("Created array with max line count: " + lyrics.length);
            System.out.println("Created array with verse count: " + lyrics[0].length);

        } else {
            System.out.println("There is a problem with entered numbers they must be positive!");
        }//Close if/else
    }//Close initialize array
    
    // Method to read in lyrics, one line
    // at a time
    public void readInLyricLine(){
        //IDEA: input line, hit enter,
        //then some signal that you're
        //done with that verse
        
        //Create scanner
        Scanner inPut = new Scanner(System.in);
        
        //Read in first verse only
        //Loop that will ask user for line, then inject into current row of col 1
        for(int line = 0; line < lyrics.length; line++){
            //Read in a single line from user, store temp in userLine
            String userLine = inPut.nextLine();
            //inject userLine into the array
            lyrics[line][0] = userLine;
        }//Close for
        
    }//Close readInLyrics
    
    public void displayLyrics(){
        for(int row = 0; row < lyrics.length; row++){
            //this inner for() loops over each column in our CURRENT row
            for(int col = 0; col < lyrics[row].length; col++){
                //Check if there are any empty spaces (nulls)
                if (lyrics[row][col] == null){
                    //If it is Empty the system will try to read empty
                    //but it will fail... so we can use this to get
                    //rid of nulls.
                    lyrics[row][col] = "Empty";
                    
                } else {
                    //Lets type the rows and columns
                    System.out.println("Row " + (row + 1));
                    //Now, send to console the value of the current row and col
                    System.out.println("Column " + (col + 1) + ": " + lyrics[row][col]);
                }
            } //Close inner for over the columns
            
            //add a return character
            System.out.println();
            
        }//Close outer for over the rows
    }
}//Close Class
