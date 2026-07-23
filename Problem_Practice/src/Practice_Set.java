import java.util.Scanner;

public class Practice_Set {
    public static void main(String[]args){

        // q1 -->
        float A = 7/4.0f  * 9/2.0f ;
        System.out.println("Output of the expressions - 7/4.0f  * 9/2.0f is :- " +A);

        // q2 -->
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Grade :- ");
        char grade = sc.next().charAt(0);

        char encrypt = (char)(grade+8);
        System.out.println("Grade after encrypting :- "+encrypt);

        char decrypt = (char)(encrypt-8);
        System.out.println("Grade after decrypting :- "+decrypt);

        // q3 -->
        System.out.print("Enter the number :- ");
        int number = sc.nextInt();

        int num = 10;
        String result = (number>=num) ? "User number is greater " : "Given number is greater.";
        System.out.println(result);

        // q4 -->
        System.out.print("Enter the value of V :- ");
        int v = sc.nextInt();

        System.out.print("Enter the value of u :- ");
        int u = sc.nextInt();

        System.out.print("Enter the value of a :- ");
        int a = sc.nextInt();

        System.out.print("Enter the value of s : ");
        int s = sc.nextInt();

        double results = (Math.pow(v,2) - Math.pow(u,2)) / (2*a*s);

        System.out.println("The result of the set is :- "+results);


        // q5 -->
        int ab = sc.nextInt();
        System.out.println(ab>8);
        System.out.println(7*49/7+35/7);

    }
}
