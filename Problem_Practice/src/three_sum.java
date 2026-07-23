import java.util.Scanner;

public class three_sum {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers -");

        System.out.print("Enter the num1 :- ");
        int num1 = input.nextInt();
        System.out.print("Enter the num2 :- ");
        int num2 = input.nextInt();
        System.out.print("Enter the num3 :- ");
        int num3 = input.nextInt();

        int sum = num1+num2+num3;
        System.out.println("The sum is :- "+sum);

        input.close();
    }
}
