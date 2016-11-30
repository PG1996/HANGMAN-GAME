/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import static javaapplication1.Hangman1.a;

/**
 *
 * @author Parth Goel
 */
public class MovieDatabase {
    public String MovieData() {
        //int a;
        String arr[] = new String[15];
        arr[0] = "TITANIC";
        arr[1] = "LIFE OF PI";
        arr[2] = "PURSUIT OF HAPPYNESS";
        arr[3] = "INCEPTION";
        arr[4] = "SLUMDOG MILLONAIRE";
        arr[5] = "THE MAZE RUNNER";
        arr[6] = "INTERSTELLAR";
        arr[7] = "THE PRESTIGE";
        arr[8] = "FIGHT CLUB";
        Random rand = new Random();
        a = rand.nextInt(8);
        return arr[a];
    }
    
}
