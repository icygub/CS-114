package piggy.pack;
import java.util.Scanner;

/**
 * Created by Guapito on 10/1/2016.
 */
public class Pig {

    public void theGame(){
        Scanner keyboard = new Scanner(System.in);
        int roll;
        int ptot=0;
        int ctot=0;
        int turnTotal;
        String choice = "";
        int cChoice = 0;

        do{
            turnTotal = 0;
            System.out.println("Your total is " + ptot);

            do {
                roll = 1 + (int)(Math.random()*6);
                System.out.println("You rolled: " + roll);
                if (roll == 1){
                    System.out.println("You lost " + turnTotal + " points.");
                    turnTotal = 0;
                }
                else {
                    turnTotal += roll;
                    System.out.println("Nice! Turn total is " + turnTotal);
                    System.out.println("Wanna roll or hold?");
                    choice = keyboard.next();
                }
            }while(roll != 1 && choice.equals("roll"));

            ptot += turnTotal;
            System.out.println("Your grand total is " + ptot);

            /* COMPUTER STARTS HERE */

            if (ptot < 100) {
                turnTotal = 0;
                System.out.println("\nCPU total is " + ctot);

                do {
                    roll = 1 + (int) (Math.random() * 6);
                    System.out.println("CPU rolled: " + roll);
                    if (roll == 1) {
                        System.out.println("CPU lost " + turnTotal + " points");
                        turnTotal = 0;
                    }
                    else {
                        turnTotal += roll;
                        System.out.println("Cool! Turn total is " + turnTotal);
                        cChoice = 1 + (int) (Math.random() * 2);
                        if (cChoice == 1)
                            System.out.println("Computer continues.");
                        else {
                            System.out.println("Computer holds");
                        }
                    }
                } while(roll != 1 && cChoice != 2);

                ctot += turnTotal;
                System.out.println("CPU grand total is " + ctot + "\n");
            }

        } while(ptot < 100 && ctot < 100);

        if (ptot > ctot)
            System.out.println("You win!");
        else
            System.out.println("CPU wins!...");
    }
}