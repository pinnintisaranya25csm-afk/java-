package mypackage;class Book {

    private int bookId;
    private String bookName;
    private String author;
    private double price;


    Book() {
        bookId = 0;
        bookName = "No Book";
        author = "Unknown";
        price = 0;
    }

    
    Book(int id, String name, String author, double price) {
        bookId = id;
        bookName = name;
        this.author = author;
        this.price = price;
    }

    
    public void setBookId(int id) {
        bookId = id;
    }

    public void setBookName(String name) {
        bookName = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

class Person {

    String name;
    int age;

    void getPerson(String n, int a) {
        name = n;
        age = a;
    }
}

class Student extends Person {

    int rollNo;

    void getStudent(int r) {
        rollNo = r;
    }

    void displayStudent() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll No : " + rollNo);
    }
}

class Faculty extends Person {

    String subject;

    void getFaculty(String s) {
        subject = s;
    }

    void displayFaculty() {
        System.out.println("\nFaculty Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Subject : " + subject);
    }
}

class Area {

    double area(double r) {
        return 3.14 * r * r;
    }

    int area(int l, int b) {
        return l * b;
    }
}



class Vehicle {

    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {

    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {

    void display() {
        System.out.println("This is a Bike");
    }
}



abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("Drawing Rectangle");
    }
    }

interface Printable {

    void print();
}

class Report implements Printable {

    public void print() {
        System.out.println("Printing Report");
    }
}


public class LibraryManagement {

    public static void main(String[] args) {

        Book b1 = new Book();

        b1.setBookId(101);
        b1.setBookName("Java");
        b1.setAuthor("James Gosling");
        b1.setPrice(550);

        b1.displayBook();

        Book b2 = new Book(102, "Python", "Guido", 650);

        b2.displayBook();

        Student s = new Student();
        s.getPerson("Saranya", 18);
        s.getStudent(243);
        s.displayStudent();

        Faculty f = new Faculty();
        f.getPerson("Ramesh", 40);
        f.getFaculty("Java");
        f.displayFaculty();

        Area a = new Area();

        System.out.println("Area of Circle = " + a.area(5.0));
        System.out.println("Area of Rectangle = " + a.area(10, 20));

        Vehicle v;

        v = new Car();
        v.display();

        v = new Bike();
        v.display();

   

        Shape c = new Circle();
        c.draw();

        Shape r = new Rectangle();
        r.draw();

        Report rp = new Report();
        rp.print();
    }
}
