import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice among 1 ,2 and 3: ");
        int choice = sc.nextInt();

        switch(choice){

            case 1:
                System.out.println("Tea");
                break;


            case 2:
                System.out.println("Coffee");
                break;


            case 3:
                System.out.println("Juice");
                break;


            default:
                System.out.println("Invalid choice");

        }
        sc.close();
    }
}
