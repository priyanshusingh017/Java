class One {
    public void greet() {
        System.out.println("Good Morning");
    }

    public void name() {
        System.out.println("My name is java");
    }
}

class Two extends One {
    public void Welcome() {
        System.out.println("Welcome");
    }

    public void name() {
        System.out.println("My name is java in class two");
    }
}

public class Main {
    public static void main(String[] args) {
//        One obj = new One();
//        obj.name();

        One obj = new Two();
        // Two obj2 = new One(); // not Allowed
        obj.name();
        obj.greet();
        // obj.Welcome(); --> reference to parent class and object is created for child class .
    }
}
