package implementation;
interface I9 {
	void add();
}
interface I8 extends I9{
	void sub();
}
interface I6{
	void rem();
}
interface I extends I6,I8{
	void mul();
}
class  Dsa implements I{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("addition is " +(10+20));
	}

	@Override
	public void rem() {
		// TODO Auto-generated method stub
		System.out.println("Remainder is "+ (65%5));
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(" Subtraction is "+(23-11));
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("MULtiplication is "+(78*65));
		
	}
	
	
}
public class IneerInterface {
	public static void main (String args[]) {
		System.out.println("In this a interface extends two or more interfaces");
		Dsa a=new Dsa();
		 a.add();
		 a.rem();
		 a.sub();
		 a.mul();
	
	}

}
