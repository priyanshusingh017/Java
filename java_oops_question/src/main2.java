import java.util.*;

public class main2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int upper =0; int lower =0;

        for(char c : s.toCharArray()){ // toCharArray is to convert char into array 
            if(Character.isUpperCase(c)){
                upper++;
            }
            else if(Character.isLowerCase(c)){
                lower++;
            }
        }
        System.out.println("Upper: "+upper);
        System.out.println("Lower: " + lower);
    }
}
