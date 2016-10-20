package chapter5;
import java.util.Scanner;

public class Assignment6c {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = s.nextInt();
        String result;
        if (age < 12) {
            result = classify(age, null);
        }
        else {
            System.out.println("Enter Gender:");
            String gender = s.next();
            result = classify(age, gender);
        }

        System.out.println(result);
    }

    public static String classify(int age, String gender) {

        String result = null;
        if (age >= 18) {
            if (gender.equals("Female"))
                result = "Relief Society";
            else if (gender.equals("Male"))
                result = "Priesthood";
        }
        else if (age >= 12) {
            if (gender.equals("Female"))
                result = "Young Women's";
            else if (gender.equals("Male"))
                result = "Young Men's";
        }
        else if (age >= 3)
            result = "Primary";
        else if (age >= 1)
            result = "Nursery";
        else if (age < 1)
            result = "Babe In Arms";

        return result;
    }
}
