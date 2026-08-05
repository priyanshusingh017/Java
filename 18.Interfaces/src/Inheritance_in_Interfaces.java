interface Animal {
    void eat();
}
interface Dog extends Animal {
    void bark();

    public default void play() {
        System.out.println("Playing Dog");
    }
}

class petDog implements Dog{

    public void eat(){
        System.out.println("petDog is Eating");
    }
    public void bark(){
        System.out.println("Barking...");
    }

    @Override
    public void play() {
        System.out.println("Playing Dog....");
    }
}

public class Inheritance_in_Interfaces {
    public static void main(String[] args) {

        petDog petdog = new petDog();
        petdog.eat();
        petdog.bark();
        petdog.play();
    }
}
