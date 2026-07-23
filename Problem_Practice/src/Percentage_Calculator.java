import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter English marks: ");
        int englishMarks = input.nextInt();

        System.out.print("Enter Hindi marks: ");
        int hindiMarks = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int mathsMarks = input.nextInt();

        System.out.print("Enter Science marks: ");
        int scienceMarks = input.nextInt();

        System.out.print("Enter Physics marks: ");
        int physicsMarks = input.nextInt();

        double totalScore = englishMarks + hindiMarks + mathsMarks + scienceMarks + physicsMarks;
        double percentage = (totalScore / 500) * 100;

        System.out.println("\n----- Result -----");
        System.out.println("English : " + englishMarks);
        System.out.println("Hindi   : " + hindiMarks);
        System.out.println("Maths   : " + mathsMarks);
        System.out.println("Science : " + scienceMarks);
        System.out.println("Physics : " + physicsMarks);
        System.out.println("Total Marks : " + totalScore);
        System.out.println("Percentage : " + percentage + "%");

        input.close();
    }
}