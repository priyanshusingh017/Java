import java.util.Scanner;

public class practice {
    public static int sumOfNatural(int n){
        if(n==1) return 1;
        else return sumOfNatural(n-1) + n;
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    public static double average(int[] n){
        int sum = 0;
        for(int i : n){
            sum += i;
        }
        return (double)sum/n.length;
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Increasing pattern using recursion -->
    static void printPatternI(int n) {
        if (n == 0) {
            return;
        }

        printPatternI(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
    // Decreasing pattern using recursion -->
    static void printPatternD(int n) {

        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }

        System.out.println();

        printPatternD(n - 1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        // Q1 -->
//        System.out.print("enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("Multiplication table of " + n + ":");
//        for(int i=1; i<=10;i++){
//            System.out.println(n+"*"+i+"="+(n*i));
//        }

//        // Q2 -->
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            for(int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Q3 -->
//        System.out.print("Enter the natural number for sum :- ");
//        int num = sc.nextInt();
//        System.out.println(sumOfNatural(num));
//
//        // Q4 -->
//        int n1 = sc.nextInt();
//        for(int i=n1; i>=0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        // Q5 -->
//        System.out.print("Enter the number for fibonacci Series:- ");
//        int number = sc.nextInt();
//        for(int i=0; i<number; i++){
//            System.out.print(fibonacci(i) + " ");
//        }

//        // Q6 -->
//        int[] numbers = {10, 20, 30, 40, 50};
//
//        double result = average(numbers);
//
//        System.out.println("Average = " + result);

        // Q7 -->
        System.out.print("Enter the number for pattern(Increase): ");
        printPatternI(sc.nextInt());

        // Q8 -->
        System.out.print("Enter the number for pattern(Decrease): ");
        printPatternD(sc.nextInt());

        // Q9 -->
        System.out.print("Enter the Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}

