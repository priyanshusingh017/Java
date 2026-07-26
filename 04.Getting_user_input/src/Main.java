import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String
        System.out.print("Enter your name: ");
        String name = sc.next();

        // Integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Double
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Boolean
        System.out.print("Are you a student? (true/false): ");
        boolean student = sc.nextBoolean();

        // Character
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        // Output
        System.out.println("\n===== User Details =====");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Salary  : " + salary);
        System.out.println("Student : " + student);
        System.out.println("Grade   : " + grade);

        /*
        --> used to check that enter number is integer or not using hasNextInt() Function -
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

         */

        sc.close();

    }
}