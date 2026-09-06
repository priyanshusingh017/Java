import java.util.InputMismatchException;
import java.util.Scanner;

public class Handling_Specific_Exceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("enter the n: ");
            int n=sc.nextInt();
            int[] arr = {10,20,30,40};

            System.out.println("The value of array index enter is: " + arr[n]);
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            System.out.println("The value of array-value/number is: "+arr[n]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception:- " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch" + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound :- " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception:- " + e.getMessage());
        }
        finally{
            System.out.println("Exiting Application");
            sc.close();
        }
    }
}
