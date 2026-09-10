package exceptionhandling;

public class Example9 {

	    public static void main(String[] args) {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }
	    }
	}

