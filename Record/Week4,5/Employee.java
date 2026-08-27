package records;
class Employ {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    Employ() {
        name = "Not Given";
        id = 0;
        designation = "Not Given";
        salary = 0;
        promotionStatus = "No";
    }

    Employ(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        salary = 0;
        promotionStatus = "No";
    }

    Employ(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}

public class Employee{
    public static void main(String[] args) {

        Employ e1 = new Employ();

        Employ e2 = new Employ(
            "Ravi", 101, "Software Engineer"
        );

        Employ e3 = new Employ(
            "Priya", 102, "Manager", 50000, "Promoted"
        );

        e1.display();
        e2.display();
        e3.display();
    }
}




