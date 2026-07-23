import java.io.IOException;
import  java.util.Scanner;

public class User_input {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String name = input.nextLine();

        System.out.println("Hello "+name+ " , have a good day .");
    }
}
