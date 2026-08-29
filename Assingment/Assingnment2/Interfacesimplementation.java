package implementation;
interface I1{
	void show();
}
interface I2{
	void showi2(); 
}
interface I3{
	void showi3();
}
class X implements I1{

	@Override
	public void show() {
	 System.out.println("Class x implements I1 .");
		
	}
	
}

class Y implements I2,I3{

	@Override
	public void showi3() {
		// TODO Auto-generated method stub
		System.out.println("Class y implements I3 .");
		
	}

	@Override
	public void showi2() {
		// TODO Auto-generated method stub
		System.out.println("Class Y implements I2 . ");
	}
	
}
public class Interfacesimplementation {
	public static void main(String args[] ) {
		X sa =new X();
		Y aw =new Y();
		
		sa.show();
		System.out.println("Class x impleents only one I2. ");
		
		aw.showi2();
		aw.showi3();
		System.out.println("Class Y implements both I2,I3 at the same time .");
		
		
	}

}
