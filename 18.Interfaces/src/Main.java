interface phoneModel {
    void connect();
}

class Samsung implements phoneModel {

    public void connect() {
        System.out.println("Samsung Connected");
    }
}

class Apple implements phoneModel {
    public void connect() {
        System.out.println("Apple  Connected");
    }
}

public class Main {
    public static void main(String[] args) {

        // normal object called -->
        Samsung samsung = new Samsung();
        samsung.connect();
        Apple apple = new Apple();
        apple.connect();

        // dynamic dispatch method -->
        /*
        Reference -----> phoneModel
        Object --------> Samsung
        or
        Object --------> Apple
         */
        // phoneModel pm - interface reference
        phoneModel pm;
        // Samsung object
        pm = new Samsung();
        pm.connect();
        // Apple object
        pm = new Apple();
        pm.connect();

    }
}
