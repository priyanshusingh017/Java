package mypackage;
import mypackage.Calculator;
import mypackage.scCalculator;
import mypackage.HybridCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Q1 -->
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,2));
        System.out.println(calculator.sub(5,2));
        System.out.println(calculator.mul(5,2));
        System.out.println(calculator.div(5,2));
        System.out.println(calculator.mod(5,2));

        scCalculator scC = new scCalculator();
        System.out.println(scC.power(5,2));
        System.out.println(scC.sqrt(25));

        HybridCalculator hc = new HybridCalculator();
        System.out.println(hc.average(5,2));

        // Q2 -->
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String s = sc.nextLine();

        System.out.println("Hello, " + s);
    }
}
