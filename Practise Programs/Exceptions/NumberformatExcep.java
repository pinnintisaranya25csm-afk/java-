package exceptionhandling;

public class NumberformatExcep {
	
	    public static void main(String[] args) {
	        try {
	            String s = "abc";
	            int n = Integer.valueOf(s);
	            System.out.println(n);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number");
	        }
	    }

}
