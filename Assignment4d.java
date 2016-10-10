package chapter3;
import java.util.Scanner;
/**
 * CS 114 4d
 * John and Abigail
 * Professor: Brother Masterson
 * Description: Accepts an ASCII code (between 0 and 255) and displays the corresponding character.
 */
public class Assignment4d {

    String input;
    int num;
    String ascii;
    String yesOrNo;

    public void printASCII() {
        Scanner avocado = new Scanner(System.in);

        //while loops allows for continuous conversion
        while(true){
            System.out.println("Input: ");
            input = avocado.next();
            //tests if input is an int
            try {
                num = Integer.parseInt(input);
            }
            //if not an int, user will be advised and loops starts over
            catch (NumberFormatException e) {
                System.out.println("Your input is not an int.");
                continue;
            }
            //if int is not between 0-255, loop starts over
            if (num < 0 || num > 255) {
                System.out.println("Input must be between 0-255.");
                continue;
            }

            ascii = Character.toString((char) num);
            System.out.println("Output: " + ascii);

            System.out.println("Type y to continue. Anything else will break.");
            yesOrNo = avocado.next();
            //user can choose to enter another ascii code
            if (yesOrNo.equals("y"))
                continue;
            else {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
