package demos;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);

        String input;
        do{
            System.out.print("Enter An Integer: ");
            input = s.nextLine();

        }while(!isInteger(input));

    }

    public static boolean isInteger(String input)
    {
        try{

            int temp = Integer.parseInt(input);
            return true;


        }
        catch (Exception e){
            return false;
        }
    }
}
