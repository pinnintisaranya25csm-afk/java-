package exceptionhandling;

public class Stringexception {
	
	    public static void main(String[] args) {
	        try {
	            String s = "Hello";
	            System.out.println(s.charAt(10));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("String index is invalid");
	        }
	    }
	}

