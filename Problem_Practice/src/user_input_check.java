import java.util.Scanner;

public class user_input_check {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Valid Integer: " + number);
        } else {
            System.out.println("Invalid Input! Please enter an integer.");
        }

        sc.close();

    }
}
