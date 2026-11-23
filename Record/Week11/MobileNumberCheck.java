package records;


import java.util.Scanner;

class LengthNotSufficientException extends Exception {
    LengthNotSufficientException(String message) {
        super(message);
    }
}

public class MobileNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter mobile number: ");
            String mobile = sc.nextLine();

            if (!mobile.matches("[0-9]+")) {
                throw new NumberFormatException("Mobile number must contain digits only");
            }

            if (mobile.length() > 10) {
                throw new ArrayIndexOutOfBoundsException(
                    "Mobile number should not exceed 10 digits");
            }

            if (mobile.length() < 10) {
                throw new LengthNotSufficientException(
                    "Mobile number should contain 10 digits");
            }

            System.out.println("Valid Mobile Number: " + mobile);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (LengthNotSufficientException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

