package implementation;
interface I{
	void add();
}
class D{
	void multiply() {
		int x=10,y=112;
		System.out.println("Product is "+ (x*y));
	}
}
class  Z extends D implements I{

	@Override
	public void add() {
		// TODO Auto-generated method stub
	int a=22;
	float b=23.3f;
	System.out.println(" Addition is "+ (a+b));
	}
	void subtraction( int a,int b) {
		System.out.println("Subtraction is "+(a-b));
	}
	
}
public class ClassandInterface {
	public static void main (String args[]) {
		System.out.println("In this a class at a time  inherits both a class and interface . ");
		
		Z cc = new Z();
		cc.add();
		cc.multiply();
		
		cc.subtraction(23, 34);
	}

}
