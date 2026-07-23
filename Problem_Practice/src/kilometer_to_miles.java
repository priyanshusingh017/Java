import java.util.Scanner;

public class kilometer_to_miles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number in kilometer :- ");
        int kilometer = sc.nextInt();

        double miles = kilometer*0.621371;

        System.out.println("The miles is :- "+miles);

        sc.close();
    }
}
