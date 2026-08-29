package inheritance;

 class A {
    void first(){
        
        System.out.println("this is a parent class");
       }
        void add(){
           int x=20,y=30;
           System.out.println("addition is" + (x+y));
        }
   }
   class B extends A{
       void main(){
       System.out.println("this is is a child  class");
   }
       void subtract(){
           int a=90,b=49;
           System.out.println("subtraction is" + (a-b));
       }    
   }
   public class Singlelevel{
       public static void main(String[] args) {
           B obj=new B();
           obj.add();
           obj.subtract();
           obj.main();
           obj.first();
       }
       
   }
