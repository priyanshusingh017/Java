public class Operators_expressions {

    public static void main(String[] args){
        int a = 15;
        int b = 4;
        System.out.println("Arithmetic operations :- ");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        System.out.println("Comparison Operations :- ");
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Equal: " + (a == b));

        boolean x = true;
        boolean y = false;

        System.out.println("Logical operations :- ");
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));

        int num = 5;
        System.out.println("Prefix: " + (++num));
        System.out.println("Postfix: " + (num++));
        System.out.println("After Postfix: " + num);

        String ans = (a > b) ? "A is Greater" : "B is Greater";
        System.out.println(ans);

        System.out.print("Bitwise operations : (2&3) -  ");
        System.out.println(2&3);
    }
}
