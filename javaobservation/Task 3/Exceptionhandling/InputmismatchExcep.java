package exceptionhandling;
import java.util.Scanner;

public class InputmismatchExcep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Number is: " + n);
        } catch (Exception e) {
            System.out.println("Please enter a number only");
        }

        sc.close();
    }
}


