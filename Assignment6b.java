package chapter5;
import java.util.Scanner;

/**
 * 6b
 * CS 114
 * Group 10 John and Abigail
 * Description: User inputs amount of money, and program shows how many dollars and coins make up that amount.
 */

public class Assignment6b {
    /**
     * Asks user for money amount, and sends it as argument to printMoney()
     * @param args
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = kb.nextDouble();
        printMoney(amount);
    }

    /**
     * Calculates and prints currency information
     * @param amount
     */
    public static void printMoney(double amount) {
        int dollarQty = 0;
        double dollarVal;
        double leftover;
        //only calculates dolllars if amount is >= 1
        if (amount >= 1 ) {
            dollarQty = (int) (amount / 1.0);
            dollarVal = dollarQty;
            leftover = (double)Math.round((amount % dollarVal) * 100d) / 100d;
        } else
            leftover = amount;

        //calculates qty and val of each coin
        int quarterQty = (int)(leftover / .25);
        double quarterVal = quarterQty * .25;
        leftover -= quarterVal;
        leftover = (double)Math.round(leftover * 100d) / 100d;

        int dimeQty = (int)(leftover / .1);
        double dimeVal = dimeQty * .1;
        leftover -= dimeVal;
        leftover = (double)Math.round(leftover * 100d) / 100d;

        int nickelQty = (int)(leftover / .05);
        double nickelVal = nickelQty * .05;
        leftover -= nickelVal;
        leftover = (double)Math.round(leftover * 100d) / 100d;

        int pennyQty = (int)(leftover / .01);

        //does not print if there are no coins
        if (dollarQty > 0)
            System.out.printf("\n%d\tdollar%s", dollarQty, getPlurality(dollarQty));
        if (quarterQty > 0)
            System.out.printf("\n%d\tquarter%s", quarterQty, getPlurality(quarterQty));
        if (dimeQty > 0)
            System.out.printf("\n%d\tdime%s", dimeQty, getPlurality(dimeQty));
        if (nickelQty > 0)
            System.out.printf("\n%d\tnickel%s", nickelQty, getPlurality(nickelQty));
        //since penny and pennies are very different, getPlurality() is not called
        if (pennyQty > 0) {
            if (pennyQty == 1)
                System.out.printf("\n%d\tpenny", pennyQty);
            else
                System.out.printf("\n%d\tpennies", pennyQty);
        }

    }

    /**
     * Calculates if the coin should print as a plural
     * @param currency
     * @return String hasS
     */
    public static String getPlurality(int currency) {
        String hasS;
        if (currency <= 1)
            hasS = "";
        else
            hasS = "s";
        return hasS;
    }
}
