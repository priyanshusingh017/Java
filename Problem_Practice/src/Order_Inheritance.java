class Base {
    Base(int x) {
        System.out.println("Base = " + x);
    }
}

class Derived1 extends Base {
    Derived1(int x, int y) {
        super(x);
        System.out.println("Derived1 = " + y);
    }
}

class Derived2 extends Derived1 {
    Derived2(int x, int y, int z) {
        super(x, y);
        System.out.println("Derived2 = " + z);
    }
}

public class Order_Inheritance {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2(10 , 20 ,30);
    }
}


/*
      1. Base Constructor
              ↓
      2. Derived1 Constructor
              ↓
      3. Derived2 Constructor

      // --> The order is always Parent → Child.
 */