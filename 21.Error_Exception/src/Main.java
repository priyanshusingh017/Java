import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. syntax error = program is not compile
        // int a = 10 -> here ; is missing
        // System.out.println(a);

        // 2. runtime error -> compilation is successful but something goes wrong during execution
//        try{
//            int a = 10;
//            int b=0;
//            System.out.println(a/b);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("finally always executed");
//        }
//        Scanner input = new Scanner(System.in);
//
//        try{
//            int n = input.nextInt();
//            int[] arr = {10,20,30};
//
//            System.out.println(arr[n]);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        catch(InputMismatchException e){
//            System.out.println("Please enter a number");
//        }
//        finally{
//            System.out.println("finally always executed");
//        }

        // 3. logical error --> program successfully but produces wrong output
        int a=10;
        int b=20;
        int c=30;
        double avg = a+b+c/3; // produces 40 but comes 20 here 10 + 20 + (30/3) = 30+10 =40;
        double average = (double) (a + b + c) /3; // 20
        System.out.println("The average price is: "+average);

    }
}
