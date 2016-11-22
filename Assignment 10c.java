package chapter9;
import java.util.Scanner;
import java.util.Arrays;

/**
 * CS 114 10c
 * Ryan and John
 * 11/22/2016
 * Description: Will compare if two strings are anagrams.
 */
public class Main {
    /**
     * Gets user input and prints result
     * @param args
     */
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("First string: ");
        String fir = sc.nextLine();
        System.out.print("Second string: ");
        String sec = sc.nextLine();
        if(areAnagrams(fir, sec))
            System.out.println("They are anagrams.");
        else
            System.out.println("They are not anagrams.");
    }

    /**
     * Compare two strings, and returns true if they are anagrams
     * @param fir
     * @param sec
     * @return
     */
    public static boolean areAnagrams(String fir, String sec){
        boolean result = true;

        if(fir.length() == sec.length()){
            Character firList[] = new Character[fir.length()];
            Character secList[] = new Character[sec.length()];
            for(int i = 0; i<fir.length(); i++){ //adds letters of fir to firList[]
                firList[i] = fir.charAt(i);
            }
            for(int i = 0; i<sec.length(); i++){ //ads letters of sec to secList[]
                secList[i] = sec.charAt(i);
            }
            Arrays.sort(firList);
            Arrays.sort(secList);
            for(int i = 0; i<fir.length(); i++){ //compares positions of both lists
                if(firList[i] != secList[i]){
                    result = false;
                    break;
                }
            }
        }
        else{ //if strings are not same length
            result = false;
        }
        return result;
    }
}
