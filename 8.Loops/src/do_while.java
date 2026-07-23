import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        /*
        A do-while loop executes a block of code at least once, then checks the condition.

        It is called an exit-controlled loop because the condition is checked after execution.


        int i = 1;          // initialization

        do {

            // work

            i++;            // increment

        } while(i <= 10);   // condition

        */

        // print the number from 100 to 200 -->
        System.out.println("Print the number from 100 to 200 :- ");
        int i =100;
        do{
            System.out.print(i + "\n");
            i++;
        }while(i<=200);

        // print the even number -->
        System.out.println("Print the even number :- ");
        int it = 2;

        do {

            System.out.println(it);

            it += 2;

        } while(it <= 10);

        // print the table -->
        System.out.println("Print the table ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int number = sc.nextInt();
        int num = 1;
        do{
            System.out.println(number + "*" + num + "=" + (number*num));
            num++;
        }while(num<=10);

    }
}
