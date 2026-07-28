import java.util.Scanner;

public class Practice_set_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

//        // Q1 -->
//        System.out.print("Enter your String : ");
//        String UserInput = input.nextLine();
//
//        System.out.println("Your input :- "+UserInput + " , " + "After lowercase :- " + UserInput.toLowerCase());
//
//        // Q2 --> Replace spaces with underscore
//        String Output = "";
//        for(char s: UserInput.toCharArray()){
//            if(s ==' '){
//                Output =  (Output + '_');
//            }
//            else{
//                Output =  (Output + s);
//            }
//        }
//        System.out.println("Your output :- "+Output);
//
//        String output_method2 = UserInput.replace(' ' , '_');
//        System.out.println("Your output with replace method:- "+output_method2);

        // Q3 -->
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>" , "Rhoan");
        System.out.println(letter);

        // Q4 -->
        String str = "This  is   Java Programming.";
        System.out.println("Double Space " + str.indexOf("  "));
        System.out.println("Triple Space " + str.indexOf("   "));

        // Q5 -->
        String strt = "Dear Harry,\n\t This Java Course is nice.\nThanks";
        System.out.println(strt);


    }
}
