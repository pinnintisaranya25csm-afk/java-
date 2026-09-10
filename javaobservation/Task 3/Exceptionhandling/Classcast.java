package exceptionhandling;

public class Classcast {
    public static void main(String[] args) {
        try {
            Object x = "Hello";
            Integer n = (Integer) x;
        } catch (ClassCastException e) {
            System.out.println("Invalid type conversion");
        }
    }
}


