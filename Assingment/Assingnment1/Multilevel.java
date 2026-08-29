package inheritance;

class A {
    int x=28;
    int y=34;
    void add(){
        int w=22;
        System.out.println("addition is " + (x+y+w+1));
    }  
}
class B extends A{
    float s=23.3f;
    void mul(){
        System.out.println("multiplication is " + (s*2));
    }
}
class C extends B {
    int a=23;
    @Override
    void add(){
        int w=22;
        System.out.println("addition is " + (x+y+w+89));
    
}
 void mul(){
        System.out.println("multiplication is " + (s*80));
    }
    void div(){
        System.err.println("division is "+(a/3));
    }
}
public class Multilevel {
    public static void main(String[] args) {
        C obj =new C();
        obj.add();
        obj.mul();
        obj.div();
    }
    
}