import java .util.Scanner;
public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        //boolean cod = (age==18);
        if (age >= 18) {// we can use here cod also as mention that use boolean value only
            System.out.println("You are a child");
        }
        else {
            System.out.println("You are not child");
        }
    }
}
