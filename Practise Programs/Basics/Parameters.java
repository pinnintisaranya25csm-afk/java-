package mypackage;

public class Parameters {
	void addition(int a, int b) {
		System.out.println("addition is:"+(a+b));	
	}
   int arthemetics(int a,int b) {
	   return a*b;
	   }
   String display(String name) {
	   return name;
   }
   float division(float a,float b) {
	   
	   return a/b;
   }
   public static void main(String args[]) {
	   System.out.println("various return types");
	   Parameters pr = new Parameters();
	   pr.addition(2, 3);
	   System.out.println("Multiplication is :" +pr.arthemetics(20, 10));
	   System.out.println("Name is"+ pr.display("saranya"));
	   System.out.println("division is :"+pr.division(23.6f,43.2f));
   }
   
   
	   
   
	

}
