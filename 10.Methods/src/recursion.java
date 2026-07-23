import java.util.Scanner;

public class recursion {
    // factorial -->
    public static int factorial(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }

        return n*factorial(n-1);
    }
    // Fibonacci series -->
    public static int fab(int n){
        // base case -->
        if(n==0 || n==1){
            return n;
        }

        return fab(n-1)+fab(n-2);
    }
    // power(a,b) -->
    public static int power(int a , int b){
        // base case -->
        if(b==0){
            return 1;
        }

        return a*power(a,b-1);
    }
    // reverse number -->
    public static void reversenumber(int n){
        // base case
        if(n==0){
            return;
        }
        System.out.print(n%10);

        reversenumber(n/10);
    }
    // check palindrome -->
    public static boolean check(String n){

        if(n.length()<=1){
            return true;
        }

        if(n.charAt(0)!=n.charAt(n.length()-1)){
            return false;
        }

        return check(n.substring(1,n.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        for(int i=0;i<n;i++){
            System.out.print(fab(i)+ " ");
        }
        System.out.println();

        System.out.println("Power (2^5):- " + power(2,5));

        reversenumber(12345);
        System.out.println();

        if(check("new")){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
