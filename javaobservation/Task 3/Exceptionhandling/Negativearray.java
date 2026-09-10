package exceptionhandling;

public class Negativearray {
	
	    public static void main(String[] args) {
	        try {
	            int[] a = new int[-5];
	        } catch (NegativeArraySizeException e) {
	            System.out.println("Array size cannot be negative");
	        }
	    }
	}

