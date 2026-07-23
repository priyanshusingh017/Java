public class Method_Overloading {

    // Different Number of Parameters -->
    static void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    static void sum(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    // Different Data Types -->
    static void display(int x){
        System.out.println("Integer : " + x);
    }
    static void display(double x){
        System.out.println("Double : " + x);
    }

    // Different Order of Parameters -->
    static void show(int age, String name){
        System.out.println(name + " " + age);
    }
    static void show(String name, int age){
        System.out.println(name + " " + age);
    }

    // Changing only the return type is not allowed -->
/*
    int add(int a, int b){
        return a+b;
    }

    double add(int a, int b){
        return a+b;
    }
*/
    public static void main(String[] args) {

        sum(10,20);

        sum(10,20,30);

        display(10);

        display(10.5);

        show(21, "Priyanshu");

        show("Harry", 25);


    }
}
