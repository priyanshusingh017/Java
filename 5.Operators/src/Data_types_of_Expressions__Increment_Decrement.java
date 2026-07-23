public class Data_types_of_Expressions__Increment_Decrement {
    public static void main(String[] args){

        // Data types of expressions ->
        byte x = 5;
        int y=6;
        short z=7;

        int A = y+z;
        float b = 6.54f +x;

        System.out.println("After addition with float "+b);

        byte s = 10;
        System.out.println("After addition btw byte is promoted to int - "+s+x);


        // Increment & Decrement -->
        int a = 10;

        System.out.println("Original: " + a);

        System.out.println("Prefix Increment: " + (++a));
        System.out.println("After Prefix: " + a);

        System.out.println("Postfix Increment: " + (a++));
        System.out.println("After Postfix: " + a);

        System.out.println("Prefix Decrement: " + (--a));
        System.out.println("After Prefix Decrement: " + a);

        System.out.println("Postfix Decrement: " + (a--));
        System.out.println("After Postfix Decrement: " + a);
    }
}
