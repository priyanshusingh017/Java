import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Q1 -->
        float[] numbers = {10.5f, 20.5f, 30.5f, 40.5f, 50.5f};

        float sum = 0;

        for (float num : numbers) {
            sum += num;
        }

        System.out.println("Sum = " + sum);

        //Q2 -->
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int number = sc.nextInt();

        boolean found = false;

        for (int element : arr) {
            if (element == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number is present");
        } else {
            System.out.println("Number is not present");
        }

        // Q3 -->
        int[] marks = {70, 80, 90, 60, 75};

        int sums = 0;

        for (int mark : marks) {
            sums += mark;
        }

        double average = (double) sums / marks.length;

        System.out.println("Average = " + average);

        // Q4 -->
        int[][] martix1 = {
                {1,2,3}, {4,5,6}
        };
        int[][] martix2 = {
                {7,8,9},{10,11,12}
        };

        int[][] martix3 = new int[2][3];

        for(int i = 0; i < martix1.length; i++){
            for(int j = 0; j < martix1[i].length; j++){
                martix3[i][j] = martix1[i][j] + martix2[i][j];
            }
        }

        System.out.println("Result - ");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(martix3[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println();

        // Q5 -->
        int[] arr1 = {10, 20, 30, 40, 50};

        System.out.println("reverse array - ");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Q6 -->
        int[] arr2 = {10, 50, 20, 90, 30};

        int max = arr[0];

        for (int element : arr2) {
            if (element > max) {
                max = element;
            }
        }

        System.out.println("Maximum = " + max);

        // Q7 -->
        int[] arr3 = {20, 50, 10, 90, 5};

        int min = arr[0];

        for (int element : arr3) {
            if (element < min) {
                min = element;
            }
        }

        System.out.println("Minimum = " + min);

        // Q8 -->
        int[] arr4 = {10, 20, 30, 40, 50};

        boolean isSorted = true;
        for(int i=0; i<arr4.length-1; i++){
            if(arr4[i]>arr4[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted array");
        }
    }
}

