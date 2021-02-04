/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysWithClass;

/**
 *
 * @author mehme
 */
public class SongData {
    public static void main(String[] args) {
        LyricMachine lm = new LyricMachine();
        
        lm.initializeArray(5, 4);
        lm.readInLyricLine();
        lm.displayLyrics();
    }
}
