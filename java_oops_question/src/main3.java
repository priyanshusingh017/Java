import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] s2 = s1.split(" ");
        int count =0;
        for(int i=0; i<s2.length; i++){
            char ch = s2[i].charAt(0);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        if(count==0){
            System.out.println("No String found");
        }
        else{
            System.out.println(count);
        }
    }
}
