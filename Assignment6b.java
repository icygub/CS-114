package chapter5;
import java.util.Scanner;

public class Assignment6b {

    public static void main(String[] args) {
	    printMoney();
    }

    public static void printMoney() {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter an amount: ");
        float userAmount = keyboard.nextFloat();
        /**
        int dollars = (int)(userAmount / 1);
        int quarters = (int)((userAmount - dollars) / .25);
        int dimes = (int)((userAmount - (dollars + (quarters * .25))) / .1);
        int nickels = (int)((userAmount - (dollars + (quarters * .25) + (dimes * .1))) / .05);
        int pennies = (int)((userAmount - (dollars + (quarters * .25) + (dimes * .1) + (nickels * .05))) / .01);
        double penniesS = (double)((userAmount - (dollars + (quarters * .25) + (dimes * .1) + (nickels * .05))) / .01);
        */

        float total = userAmount;
        int dollarQty = (int)(userAmount / 1);
        total = (float) dollarQty % 1;
        System.out.println(total);
        int quarterQty = (int)(total / .25);
        total -= (float) quarterQty * .25;
        System.out.println(total);
        int dimeQty = (int)(total / .10);
        total -= (float) dimeQty * .10;
        System.out.println(total);
        int nickelQty = (int)(total / .5);
        total -= (float) nickelQty * .5;
        System.out.println(total);
        int pennyQty = (int)(total / .1);
        /**
        System.out.println(dollars);
        System.out.println(quarters);
        System.out.println(dimes);
        System.out.println(nickels);
        System.out.println(pennies);
        System.out.println(penniesS);
        int whatthe = (int)pennies;
         */
        System.out.println(dollarQty);
        System.out.println(quarterQty);
        System.out.println(dimeQty);
        System.out.println(nickelQty);
        System.out.println(pennyQty);
/**
        System.out.printf("\n%d\tdollar%s", dollars, getPlurality(dollars));
        System.out.printf("\n%d\tquarter%s", quarters, getPlurality(quarters));
        System.out.printf("\n%d\tdime%s", dimes, getPlurality(dimes));
        System.out.printf("\n%d\tnickel%s", nickels, getPlurality(nickels));
        if (pennies <= 1)
            System.out.printf("\n%d\tpenny", pennies);
        else
            System.out.printf("\n%d\tpennies", pennies);
*/
    }
/**
    public static String getPlurality(int currency) {
        String hasS;
        if (currency <= 1)
            hasS = "";
        else
            hasS = "s";
        return hasS;
    }
 */
}
