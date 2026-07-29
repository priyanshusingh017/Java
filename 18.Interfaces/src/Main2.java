interface demo {
    int x = 10;
    // this treated as -> public static final int x =10; and can't modify later
}

class test implements demo {
    int y = 20;
    // this treated as normal instance variable.
}

public class Main2 {
    public static void main(String[] args) {
        test d = new test();
        System.out.println(demo.x);
        System.out.println(d.y);

        d.y = 50;

        System.out.println(d.y);
    }
}
