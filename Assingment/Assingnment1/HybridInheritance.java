package inheritance;
 interface Ae{
	 void show();
	 
 }
 interface Be{
	 void animal();
 }
class Ce implements Ae {
	@Override
	 public void show() {
		System.out.println("This a simple interface implementation");
		
	}
	public void dog() {
		 System.out.println(" Dog is a pet animal");
	 }	
}
class De extends Ce{
	public void dclass() {
		System.out.println("This  shows D class");
	}
	
}
class  Se implements Ae,Be{

	@Override
	public void animal() {
	
		System.out.println("Interface B was imlemented in S class");
		
	}

	@Override
	public void show() {
		System.out.println("Interface A was imlemented in S class");
		
	}
	
	
	
}
public class HybridInheritance {
	public static void main(String[] args) {
		De ob = new De();
		Se obj =new Se();
		
		ob.dclass();
		ob.dog();
		
		obj.animal();
		obj.show();
			
	}
}