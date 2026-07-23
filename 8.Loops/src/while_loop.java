import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){

        /*
        Syntax =>
            while(true){
                // code to execute.
            }

            //  Flow of execution -->

              Check condition
                   ↓
              true → Execute code
                   ↓
                 Repeat

              false → Exit loop
         */

        // Print Even Numbers
        int i=2;
        System.out.println("Print Even Numbers :- ");
        while(i<=10){
            System.out.println(i);
            i=i+2;
        }

        // Sum of First 5 Numbers
        int value = 1;
        int sum =0;
        while(value<=5){
            sum += value;
            value++;
        }
        System.out.println("Sum of First 5 Numbers: "+sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int number = sc.nextInt();
        int num = 1;
        while(num<=10){

            System.out.println(number + "*" + num + "=" + number*num);

            num++;
        }
    }
}
