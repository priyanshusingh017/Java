import java.util.ArrayList;
import java.util.Scanner;

class ArmStrongException extends Exception{
    ArmStrongException(String message){
        super(message);
    }
}

public class practice2 {
    public static boolean isArmStrong(int n){
        int temp = n;
        int original = n;
        int count =0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }

        double newNumber =0;
        while(original!=0){
            double digit = original%10;
            newNumber += Math.pow(digit,count);
            original=original/10;
        }
        return n==(int)newNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        for(int i: arr){
            try{
                if(isArmStrong(i)){
                    throw new ArmStrongException("Armstrong Number is found");
                }
                System.out.println(i);
            }catch(ArmStrongException e){
                System.out.println(e.getClass().getSimpleName()+": "+e.getMessage());
            }
        }

    }
}
