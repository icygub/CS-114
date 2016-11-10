package chapter8;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /**
     * User input is placed in inputList[], then gets passed calcDups(inputList)
     * @param args
     */
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int input[] = new int[10];
        int amount = 0;
        System.out.println("Enter integers between 1 and 100. Hit enter to finish:");
        for(int i = 0; i<input.length; i++){
            int tester = sc.nextInt();
            if (tester == 0){
                break;
            }
            else{
                input[i] = tester;
            }
            amount++;
        }
        int inputList[] = Arrays.copyOf(input, amount);

        calcDups(inputList);
    }

    public static void calcDups(int inputList[]) {
        int dups[] = new int[inputList.length];
        int dupsInInputList = 0;
        int index = 0;

        for(int i : inputList){
            if (isInDups(dups, i)) {
                continue;
            }
            else{
                for(int secI : inputList){
                    if(i == secI){
                        dupsInInputList++;
                    }
                }
                dups[index] = i;
                index++;
                System.out.println(i + " appears " + dupsInInputList + " times");
            }
            dupsInInputList = 0;
        }
    }

    public static boolean isInDups(int list[], int value){
        for(int i : list){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}
