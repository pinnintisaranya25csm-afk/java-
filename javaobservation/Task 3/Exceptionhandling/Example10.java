package exceptionhandling;

public class Example10 {
	
	    public static void main(String[] args) {
	        try {
	            Class.forName("ABC");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Class not found");
	        }
	    }
	}

