package chapter4;
import java.util.Scanner;

/**
 * Assignment 5c
 * Prints snarks....
 * Group 10: John and Abigail
 * CS 114 Brother Masterson
 */

public class Assignment5c {
    /**
     * Program starts with user input
     * @param args
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many snarks to start with? ");
        int startingSnarks = keyboard.nextInt();
        snark(startingSnarks);
    }

    /**
     * Adds one to numSnarks
     * @param numSnarks
     */
    public static void snark(int numSnarks) {
        numSnarks += 1;
        System.out.println(numSnarks);
        moreSnarks(numSnarks);
    }

    /**
     * Adds ten to multiSnarks
     * @param multiSnarks
     */
    public static void moreSnarks(int multiSnarks) {
        multiSnarks += 10;
        System.out.println(multiSnarks);
        powerSnarks(multiSnarks);
    }

    /**
     * lotsOfSharks to the power of five
     * @param lotsOfSnarks
     */
    public static void powerSnarks(int lotsOfSnarks) {
        lotsOfSnarks = (int) Math.pow(5,lotsOfSnarks);
        System.out.println(lotsOfSnarks);
    }
}
