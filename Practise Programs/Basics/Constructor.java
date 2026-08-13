package mypackage;

public class Constructor {  
	int id;
	String name;
	Constructor (int id,String n){
		this.id=id;
		this.name=n;
	}
void display() {
	System.out.println("Name of the student is " + this.name + " and id of the student is " + this.id );
	
}	

	public static void main(String[] args) {
		System.out.println("CSM D Class list is:");
		Constructor s1 = new Constructor( 101,"Sarnya");
		Constructor s2 = new Constructor(102, "Joong");
		s1.display();
		s2.display();
		// TODO Auto-generated method stub

	}

}
