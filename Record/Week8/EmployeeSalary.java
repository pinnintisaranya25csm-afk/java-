package records;
import java.util.Scanner;

interface Salary {
    void displaySalary();
}

class RegularEmployee implements Salary {

    public void displaySalary() {
        int basic = 25000;
        int hra = 15000;
        int ta = 5000;

        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee implements Salary {

    public void displaySalary() {
        int basic = 12000;
        int hra = 0;
        int ta = 3000;

        int total = basic + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        if (id.startsWith("R")) {
            RegularEmployee r = new RegularEmployee();
            r.displaySalary();
        }
        else if (id.startsWith("C")) {
            ContractEmployee c = new ContractEmployee();
            c.displaySalary();
        }

        sc.close();
    }
}
