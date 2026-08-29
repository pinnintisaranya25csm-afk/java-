package inheritance;
interface Wes{
	void add();
}
interface Wil {
	void mul();
}
class Car implements Wes,Wil{
	@Override
	public void add() {
		
		int x=55;
		int y=77;
		System.out.println("Addition is "+(x+y));
	}
	@Override
	public void mul() {
		int a=90;
		int b=889;
		System.out.println("Multiplication is "+(a*b));
		}
	
}

public class MultipleInheritance {
	public static void main(String[]aargs) {
		 Car obj = new Car();
		 
		 obj.add();
		 obj.mul();
	}

}
