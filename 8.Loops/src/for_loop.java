import java.util.Scanner;

public class for_loop {
    public static void main(String[]args){

        /*
        A for loop is used when we know how many times we want to repeat a block of code.

        for(initialization; condition; increment/decrement){
           // code to execute
        }
         */

        // print the even number -->
        System.out.println("Print the even number -");
        for(int i=2; i<=10; i=i+2){
            System.out.println(i);
        }

        // print the table -->
        System.out.println("print the Table - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + number*i);
        }

        // Print the first n natural number -
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i==n){
                System.out.println(i);
            }
            else {
                System.out.print(i + ",");
            }
        }

        // print the number N to 1 -->
        System.out.print("Enter the value of N :- ");
        int N = sc.nextInt();
        System.out.println("Print the number " + N + "to 1 -");
        for(int i=N; i>=1; i--){
            if(i==1){
                System.out.println(i);
            }
            else {
                System.out.print(i + ",");
            }
        }

        // print the odd number
        System.out.println("Print the odd number -");
        for(int i=1; i<=10; i=i+2){
            System.out.println(i);
        }

        // print the sum of n natural number ->
        System.out.print("Enter the number for sum - ");
        int number1 = sc.nextInt();
        int sum =0;
        for(int i=1; i<=number1; i++){
            sum += i;
        }
        System.out.println("Sum is: " + sum );

    }
}
