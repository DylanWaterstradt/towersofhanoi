//Name: Dylan Waterstradt
//Date: 05-18-2023
//Class: CS 145
//Program: DWTowersOfHanoi
//Definition:
//Basically this program asks the player the
//amount of discs they would like to play the
//towers of hanoi puzzle with, and then proceeds
//to solve it for them.  Instructions are printed
//at the start of the program, incase there are
//any questions.
//
//Note to Teacher:
//
//The longest line in this program contains 92 characters
//with out counting the initial indentation.  I wanted to
//shorten it, but I didn't want to lose clarity with the
//parameter variables being used.  I hope you understand.
//Thanks.  One last thing, I didn't notice any particular
//lines of code that seemed overly complicated that
//should be explained with comments.  If there is any,
//please let me know.  Thanks again.

import java.util.*;
import java.io.*;

public class DWTowersOfHanoi {

    /**
      * Method Type: Void
      * Returns: N/A
      *
      * Definition:
      *
      * This is the main method of the program.
      * We first set up our variables and any
      * objects we are going to use, then we
      * simply call the printIntro() method to
      * introduce the user to the game.  From
      * there we notify the user for input so
      * the program can solve the puzzle for them.
      *
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int discAmount = 0;
        
        printIntro();
        
        System.out.print("How many discs would you like to play with?: ");
        discAmount = input.nextInt();
        
        solveGame(discAmount, 1, 2, 3);
    }
    
    /*
     * Method Type: Void
     * Returns: N/A
     * 
     * Definition:
     *
     * This method simply prints what the program
     * does.  This is the first method called in
     * main that lets the user know what they are
     * playing.
     *
     */
    public static void printIntro() {
        System.out.print("Welcome to the game called, \"");
        System.out.print("Towers of Hanoi.\"\nAll you have "); 
        System.out.println("to do is enter the amount of discs,");
        System.out.print("you wish to play with and watch the ");
        System.out.println("game solve the puzzle for you.");
        System.out.print("\nFor more information, visit ");
        System.out.println("https://en.wikipedia.org/wiki/Tower_of_Hanoi");
        System.out.println("to understand how it works.");
        System.out.println("\n");
    }
    
    /*
     * Method Type: Void
     * Return Type: N/A
     *
     * Parameters:
     * int discs - the amount of discs the user wishes to play with.
     * int firstT - the first tower in which the discs are stacked on.
     * int last - the final destination tower.
     * int middle - the spare tower that we use to help seperate the discs.
     *
     * Definition:
     *
     * Upon being called it first checks to see if we are on the first,
     * if so it moves it to the final destination tower, otherwise we
     * re-call the method until we start with the first disc, then we move
     * the disc to the last tower, move the second disc to the middle tower,
     * then we move the first disc back to the middle tower, and place the
     * third disc on the third tower.  This cycle repeats until the puzzle is
     * solved.
     *
     */
    public static void solveGame(int discs, int first, int last, int middle) {
        if(discs == 1) {
            System.out.println("Moved disc " + discs + " from tower " + first + " to " + last);
            return;
        } else {
            solveGame(discs-1, first, middle, last);
            System.out.println("Moved disc " + discs + " from tower " + first + " to " + last);
            solveGame(discs-1, middle, last, first);
        }
    }

}