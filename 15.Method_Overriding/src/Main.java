class A{
    public int a;
    public int value(){
        return 1;
    }
    public void m1(){
        System.out.println("m1 of class A");
    }
}

class B extends A{
    @Override
    public void m1(){
        System.out.println("m1 of class B");
    }
    public void m2(){
        System.out.println("m2 of class B");
    }
}

public class Main {
    public static void main(String[] args){
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();
    }
}
