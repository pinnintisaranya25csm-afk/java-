class A{
    int x=67;
    int y=87;
    void add(){
        int z=23;
        System.out.println("addition is " + (x+y+z));
    }
}
class B extends A{
    @Override
   void add(){
        int z=23;
        System.out.println("addition is " + (x+y+z+23));
    } 
    void sub (){
        System.out.println("subtraction is " +(x-y));
    }
}
class C extends A{
    //overload
     void add( int a, float b, String n){
        int z=23;
        System.out.println("addition is " + (x+y+z+b+a));
        System.out.println("name is " + n);
    }
    void sub ( float s){
        System.out.println("subtraction is " +(x-s));
    }
}

public class Hirerichal {
    public static void main(String[] args) {
      B ch =new B();
      C cs = new C();
      ch .add();
      ch.sub();
      cs.add(23,23.f,"saranya");
      cs.sub(47.56f);


    }
    
}
