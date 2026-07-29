abstract class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public void sayHello(){
        System.out.println("Hello World");
    }
    abstract public void greet();
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
    public void greet(){
        System.out.println("Namaste");
    }
}

abstract class Child2 extends Parent{
    public Child2(){
        System.out.println("Child2 Constructor");
    }
}

class Child3 extends Child2{
    public Child3(){
        System.out.println("Child3 Constructor");
    }
    public void greet(){
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        // concrete class
        Child child = new Child();
        child.greet();
        child.sayHello();
        // dynamic method dispatch
        Child2 child3 = new Child3();
        child3.greet();
    }
}
