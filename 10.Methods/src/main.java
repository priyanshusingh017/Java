import java.util.Scanner;

public class main {
    static int square(int n){
        return n*n;
    }

    static int sum(int a , int b){
        return a+b;
    }

    static void check_even_or_odd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int num = sc.nextInt();

        System.out.print("Enter number2 : ");
        int num2 = sc.nextInt();

        System.out.print("Enter number to check even or odd : ");
        int n = sc.nextInt();

        System.out.println("Square of number1 :- "+square(num));
        System.out.println("Square of number2 :- "+square(num2));

        System.out.println("Sum of numbers :- "+sum(num,num2));

        check_even_or_odd(n);


        sc.close();

    }
}
