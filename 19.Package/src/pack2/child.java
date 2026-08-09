package pack2;

import pack1.parent;

public class child extends parent {

    void display() {

        // System.out.println(defaultValue); // ❌ Not allowed

        System.out.println(protectedvalue); // ✅ Allowed
    }


    public static void main(String[] args) {

        child ch = new child();
        ch.display();
    }
}
