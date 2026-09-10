package exceptionhandling;
import java.io.*;

public class Ioexception {

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}


