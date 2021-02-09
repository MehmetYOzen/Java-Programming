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
public class SongData {
    public static void main(String[] args) {
        //Create Scanner
        Scanner inPut = new Scanner(System.in);
        
        //Create lm with using LyricMachine class
        LyricMachine lm = new LyricMachine();
        
        //Ask user to enter the number of lines
        System.out.print("Enter the number of Verses:");
        int verse = inPut.nextInt();
        
        //Check if its negative
        while(verse <= 0){
            System.out.println("Sorry, the Verse number can't be smaller than '1'");
            System.out.print("Try again: ");
            verse = inPut.nextInt();
        }
        
        //Ask user to enter the number of verses
        System.out.print("Enter the maximum number of Lines in a Verse:");
        int line = inPut.nextInt();
        
        //Check if its negative
        while(verse <= 0){
            System.out.println("Sorry, the Line number can't be smaller than '1'");
            System.out.print("Try again: ");
            line = inPut.nextInt();
        }
        
        //initialize numbers
        lm.initializeArray(verse, line);
        
        //Ask the user to type lyric.
        System.out.println("Type the lyric part by part: ");
        lm.readInLyricLine();
        lm.displayLyrics();
    }
}
