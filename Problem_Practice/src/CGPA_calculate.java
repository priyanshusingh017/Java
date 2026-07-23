import java.util.Scanner;

public class CGPA_calculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks of sub1 - ");
        int sub1 = sc.nextInt();
        System.out.print("Enter the marks of sub2 - ");
        int sub2 = sc.nextInt();
        System.out.print("Enter the marks of sub3 - ");
        int sub3 = sc.nextInt();

        double sum = sub1+sub2+sub3;
        double percent = (sum/300)*100;
        System.out.println("The sum is :- "+sum);
        System.out.println("The percent is :- "+percent);

    }
}
