package implementation;
class  Animal  {
	 void display() {
		 System.out.println("The animal is.....");
		 System.out.println("The food it eats is....");
	 }
	
}
class Dog extends Animal{
	void details() {
		System.out.println("The animal is dog .");
		System.out.println("Food it eats is chicken .");
	}
}
class Cat extends Animal{
	void detailofcat() {
		System.out.println("The animal is cat .");
		System.out.println("Food it eats is mouse .");
	}
}
public class interclass {
	public static void main(String args[]) {
		Dog d =new Dog();
		Cat c = new Cat();
		
		d.display();
		d.details();
		
		c.display();
		c.detailofcat();
		
		
	}

}
