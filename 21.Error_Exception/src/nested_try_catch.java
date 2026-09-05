import java.util.Scanner;

public class nested_try_catch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            try {
                int n = sc.nextInt();
                int[] arr = {10, 20, 30};

                System.out.println(arr[n]);

            } catch (ArithmeticException e) {
                // it don't catch because no matching catch found

                // if we use it ->  System.out.println(arr[n] / 0); then this catch block catch exception

                System.out.println("Arithmetic Exception");
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is invalid");
        }
    }
}
