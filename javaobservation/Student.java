package mypackage;
import java.util.Scanner;

class Studentutility {

    void studentInfo(Scanner sc) {

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks 1 : ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2 : ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3 : ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage);
    }

    void evenOdd( Scanner sc) {

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    void largest( Scanner sc) {

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Largest = " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest = " + b);
        else
            System.out.println("Largest = " + c);
    }

    void grade( Scanner sc) {

        System.out.print("Enter Percentage : ");
        double p = sc.nextDouble();

        if (p >= 90)
            System.out.println("Grade A");
        else if (p >= 75)
            System.out.println("Grade B");
        else if (p >= 60)
            System.out.println("Grade C");
        else if (p >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }

    void dayOfweek( Scanner sc) {

        System.out.print("Enter Day Number (1-7) : ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }

    void multiplicationtable( Scanner sc) {

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    void displaynnumbers( Scanner sc) {

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ");
        }

        System.out.println();
    }

    void sumnaturalnumbers( Scanner sc) {

        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;
        }

        System.out.println("Sum = " + sum);
    }

    void fibonacci( Scanner sc) {

        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series : ");

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }

        return fact;
    }

    boolean prime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    int maximum(int a, int b) {

        if (a > b)
            return a;
        else
            return b;
    }

    double areaCircle(double r) {

        return 3.14 * r * r;
    }
}

public class Student  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Studentutility  obj = new Studentutility();

        int choice;

        do {

            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Student Information");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Display Grade");
            System.out.println("5. Day of the Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Display Numbers");
            System.out.println("8. Sum of Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("14. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    obj.studentInfo(sc);
                    break;

                case 2:
                    obj.evenOdd(sc);
                    break;

                case 3:
                    obj.largest(sc);
                    break;

                case 4:
                    obj.grade(sc);
                    break;

                case 5:
                    obj.dayOfweek(sc);
                    break;

                case 6:
                    obj.multiplicationtable(sc);
                    break;

                case 7:
                    obj.displaynnumbers(sc);
                    
                    break;

                case 8:
                    obj.sumnaturalnumbers(sc);
                    break;

                case 9:
                    obj.fibonacci(sc);
                    break;

                case 10:
                    System.out.print("Enter Number : ");
                    int n = sc.nextInt();
                    System.out.println("Factorial = " + obj.factorial(n));
                    break;

                case 11:
                    System.out.print("Enter Number : ");
                    n = sc.nextInt();

                    if (obj.prime(n))
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not a Prime Number");

                    break;

                case 12:
                    System.out.print("Enter First Number : ");
                    int a = sc.nextInt();

                    System.out.print("Enter Second Number : ");
                    int b = sc.nextInt();

                    System.out.println("Maximum = " + obj.maximum(a, b));
                    break;

                case 13:
                    System.out.print("Enter Radius : ");
                    double r = sc.nextDouble();

                    System.out.println("Area = " + obj.areaCircle(r));
                    break;

                case 14:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 14);

   
    }
}

