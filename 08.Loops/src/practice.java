import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        // Q1 -->
//        int a = input.nextInt();
//        if(a==11){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        }

//        // Q2 -->
//        System.out.println("Enter the marks for subject1 ");
//        int mark1 = input.nextInt();
//        System.out.println("Enter the marks for subject2 ");
//        int mark2 = input.nextInt();
//        System.out.println("Enter the marks for subject3 ");
//        int mark3 = input.nextInt();
//        if(mark1>=33 &&  mark2>=33 && mark3>=33 && ((mark1+mark2+mark3)/3)>=40){
//            System.out.println("Pass");
//        }
//        else{
//            System.out.println("Fail");
//        }

//        // Q3 -->
//        System.out.println("Enter your amount(Salary) :- ");
//        double amount = input.nextDouble();
//
//        double tax = 0;
//        if(amount<=250000){
//            tax = 0;
//        }
//        else if(amount<=500000){
//            tax = (amount-250000)*0.05;
//        }
//        else if(amount<=1000000){
//            tax = (250000)*0.05 + (amount-500000)*0.20;
//        }
//        else{
//            tax = (250000)*0.05 +(500000)*0.20 +(amount-1000000)*0.30;
//        }
//
//        System.out.println("Your Tax is : "+tax);

//        // Q4 -->
//        System.out.println("Enter the number");
//        int num = input.nextInt();
//        switch(num){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid input");
//                break;
//        }

//        // Q5 -->
//        System.out.println("Enter the year :- ");
//        int year = input.nextInt();
//        if((year%4==0 &&  year%100!=0) ||(year%400==0)){
//            System.out.println("The year is a leap year");
//        }
//        else{
//            System.out.println("The year is not a leap year");
//        }
//
        // Q6 -->
        System.out.print("Enter the website URL: ");
        String url = input.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        }
        else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        }
        else {
            System.out.println("Unknown Website Type");
        }

    }
}
