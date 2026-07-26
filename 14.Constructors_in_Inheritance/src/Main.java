class Base1{

    Base1(){
        System.out.println("Base1_Constructor");
    }
    Base1(int a){
        System.out.println("Base1_Constructor with arguments with value of a is "+a);
    }
}

class Derived1 extends Base1{

    Derived1(){
        // super(1);
        System.out.println("Derived1_Constructor");
    }

    Derived1(int a , int b ){
        super(a);
        System.out.println("Derived1_Constructor with arguments value of b is "+b);
    }
}
class derived2 extends Derived1{
    derived2(){
        System.out.println("derived2_Constructor");
    }
    derived2(int a, int b  , int c){
        super(a,b);
        System.out.println("derived2_Constructor with arguments value of c is "+c);
    }
}
public class Main {
    public static void main(String[] args) {
        //Base1 base1 = new Base1();
        //Derived1 derived1 = new Derived1();
        //Derived1 derived2 = new Derived1(1,2);
        //derived2 d = new derived2();
        derived2 d1 = new derived2(1,2,3);

    }
}
