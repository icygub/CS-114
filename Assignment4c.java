package chapter3;
import java.util.Scanner;
/**
 * CS 114 4C
 * John and Abigail
 * Instructor: Brother Masterson
 * Description: Using employee data, calculates payroll, including gross pay, deductions, and net pay.
 */
public class Assignment4c {

    String name;
    double hours;
    double hourlyRate;
    double fRate;
    double sRate;
    double grossPay;
    double fPercent;
    double sPercent;
    double fWithhold;
    double sWithhold;
    double deduction;
    double netPay;

    public void payroll(){
        Scanner keyboard = new Scanner(System.in);

        //Asks user for required data
        System.out.println("Enter employee's Name: ");
        name = keyboard.next();
        System.out.println("Enter the number of hours worked in a week: ");
        hours = keyboard.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        hourlyRate = keyboard.nextDouble();
        System.out.println("Enter federal tax rate: ");
        fRate = keyboard.nextDouble();
        System.out.println("Enter state tax rate: ");
        sRate = keyboard.nextDouble();

        //calculates grossPay using hours and hourlyRate
        grossPay = hourlyRate * hours;
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Hours Worked:  %.2f", hours);
        System.out.printf("\nPay Rate:      $%.2f", hourlyRate);
        System.out.printf("\nGross Pay:     $%.2f", grossPay);
        System.out.println("\nDeductions");

        //calculates all payroll deductions and net pay, and prints it
        fPercent = fRate * 100.00;
        sPercent = sRate * 100.00;
        fWithhold = grossPay * fRate;
        sWithhold = grossPay * sRate;
        deduction = fWithhold + sWithhold;
        netPay = grossPay - deduction;
        System.out.printf("\tFederal Withholding (%.1f",fPercent);
        System.out.print("%): ");
        System.out.printf("$%.2f", fWithhold);
        System.out.printf("\n\tState Withholding (%.1f",sPercent);
        System.out.print("%):   ");
        System.out.printf("$%.2f", sWithhold);
        System.out.printf("\n\tTotal Deduction:            $%.2f", deduction);
        System.out.printf("\nNet Pay:       $%.2f", netPay);


    }
}
