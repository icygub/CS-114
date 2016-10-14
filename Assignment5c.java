package chapter4;
import java.util.Scanner;

public class Assignment5c {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many snarks to start with? ");
        int startingSnarks = keyboard.nextInt();
        snark(startingSnarks);
    }

    public static void snark(int numSnarks) {
        numSnarks += 1;
        System.out.println(numSnarks);
        moreSnarks(numSnarks);
    }

    public static void moreSnarks(int multiSnarks) {
        multiSnarks += 10;
        System.out.println(multiSnarks);
        powerSnarks(multiSnarks);
    }

    public static void powerSnarks(int lotsOfSnarks) {
        lotsOfSnarks = (int) Math.pow(lotsOfSnarks, 5);
        System.out.println(lotsOfSnarks);
    }
}
