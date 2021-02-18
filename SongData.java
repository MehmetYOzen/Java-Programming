/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysWithClass;

import java.util.Scanner;

/**
 * Client class of LyricLine
 * @author mehmet ozen <mehmetozen159@gmail.com>
 */
public class SongData {
    public static void main(String[] args) {
        testLyricLine();
        System.out.println();
//        testLyricMachine();
        buildLyricLineArray();
    }//Close main
    
    public static void testLyricMachine(){
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
        }//Close while
        
        //Ask user to enter the number of verses
        System.out.print("Enter the maximum number of Lines in a Verse:");
        int line = inPut.nextInt();
        
        //Check if its negative
        while(verse <= 0){
            System.out.println("Sorry, the Line number can't be smaller than '1'");
            System.out.print("Try again: ");
            line = inPut.nextInt();
        }//Close while
        
        //initialize numbers
        lm.initializeArray(verse, line);
        
        //Ask the user to type lyric.
        System.out.println("Type the lyric part by part: ");
        lm.readInLyricLine();
        lm.displayLyrics();
    }//Close testLyricMachine
        
    public static void testLyricLine(){
        System.out.println();
        System.out.println();
        
        // Create a LyricLine with inputs
        // for line text and displayTime
        LyricLine line = new LyricLine("When I grow up you know what I wanna be?", 2500);
        displayLyricLineInfo(line);
    }//Close testLyricLine
    
    /**
     * Test code for arrays of custom types!
     */
    public static void buildLyricLineArray(){
        //Create an array size 3
        LyricLine[] superLyrics = new LyricLine[4];
        
        //Set the Lyrics
        superLyrics[0] = new LyricLine("Yeah, when I grow up, you know what I wanna be?", 4800);
        superLyrics[1] = new LyricLine("Take a seat, let me tell you my ridiculous dreams", 3900);
        superLyrics[2] = new LyricLine("I wanna rap, yeah, I know it's hard to believe", 3200);
        superLyrics[3] = new LyricLine("And I can tell you're already thinkin' I will never succeed", 2600);
        
        //pass our nice array of LyricLines to our kareoke simulator
        karaokeSimulation(superLyrics);
        
    }//Close buildLyricLineArray
    
    /**
     * Displays lines of lyrics with timings
     * @param kTape Array of instantiated LyricLine objects
     */
    public static void karaokeSimulation(LyricLine[] kTape){
        Scanner inPut = new Scanner(System.in);
        //wait for an enter press
        String wait = inPut.nextLine();
        
        // iterate over our incoming array of LyricLines, one at a time
        for(int line = 0; line < kTape.length; line++){
            //Extract the LyricLine object from our current row
            //and store teporarily
            LyricLine tempLine = kTape[line];
            // dump lyric to console
            System.out.println(tempLine.lineText);
            System.out.println(tempLine.timeToDisplayMilli);
            try {
                Thread.sleep(tempLine.timeToDisplayMilli);
            }catch (InterruptedException ex) {
                // do nothing
            }//Close try/catch
        }//close for
    }// Close Kareoke
    
    public static void displayLyricLineInfo(LyricLine line){
        System.out.println("Text: " + line.lineText);
        System.out.println("Time to display: " + line.timeToDisplayMilli);
    }//Close displayLyricLineInfo
}//Close Class
