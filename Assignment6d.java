package chapter5;
import java.util.Scanner;

/**
 * CS 114 6d Rock Paper Scissors
 * Group 10 John and Abigail
 * Description: Rock, paper, scissors! Duh!!!!!
 */

public class Assignment6d {
    /**
     * Game receives input and is printed here. Calls calcChoice() for 0,1,2 values
     * @param args
     */
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        //generates random number for computer
        int compValue = (int) (Math.random() * 3);
        String compChoice = calcChoice(compValue);
        //receives user input
        System.out.print("Scissor(0), Rock(1), Paper(2): ");
        int playerValue = s.nextInt();
        String playerChoice = calcChoice(playerValue);
        //calculates result
        String result;
        if ((playerValue == 0 && compValue == 2) ||
                (playerValue == 1 && compValue == 0) ||
                (playerValue == 2 && compValue == 1))
            result = "You win.";
        else if (compValue == playerValue)
            result = "It is a draw";
        else
            result = "You lost.";
        //prints outcomes
        System.out.println("The computer is " + compChoice + ". You are " + playerChoice + ". " + result);
    }

    /**
     * Calculates String choice for value
     * @param value
     * @return
     */
    public static String calcChoice(int value) {
        String choice = null;
        switch (value) {
            case 0: choice = "Scissor";
                break;
            case 1: choice = "Rock";
                break;
            case 2: choice = "Paper";
                break;
        }
        return choice;
    }
}
