import java.util.Arrays;

public class For_Each {
    public static void main(String[] args){

        int [] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks.length);

        // Displaying the array (naive way)
        System.out.println("Printing using naive way - ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        // Displaying the Array (for loop) -->
        System.out.println("Printing using for loop - ");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // printing the array in reverse way - using for loop
        System.out.println("Printing using for loop in reverse - ");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]+" ");
        }

        // display the array in for-each way =>
        System.out.println("Printing using for each loop - ");
        for(int element : marks){
            System.out.println(element);
        }

        // sum of the array =>
        System.out.println("Printing the sum of the array -> ");
        int sum =0;
        for(int element : marks){
            sum += element;
        }
        System.out.println("sum of the element is : "+sum);

        // printing the array using toString -->
        System.out.println("Element of the array using toString :- "+Arrays.toString(marks));

        // find the max / min element -->
        int max = marks[0];
        int min =marks[0];
        for(int i=0; i<marks.length; i++){
            if(marks[i]>max){
                max=marks[i];
            }
            if(marks[i]<min){
                min=marks[i];
            }
        }
        System.out.println("max element is : "+max);
        System.out.println("min element is : "+min);

        // second largest element -->
        int maxelement = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>maxelement){
                secondmax=maxelement;
                maxelement=marks[i];
            }
            else if(marks[i] > secondmax && marks[i]!=maxelement){
                secondmax=marks[i];
            }
        }
        System.out.println("second max element is : "+secondmax);

        // sort the array -->
        Arrays.sort(marks);
        System.out.println("Print the array in sorted way :- " + Arrays.toString(marks));



        int[] arr1 = {10,20,10,30,20};

        System.out.println("Print the array without the duplicate :- ");

        for(int i=0; i<arr1.length; i++){

            boolean duplicate = false;
            for(int j=0; j<i; j++){
                if(arr1[i]==arr1[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(arr1[i] +" ");
            }
        }

        System.out.println("\n");

        // Arrays.copyOf - create a copy arr from existed array
        int[] copy = Arrays.copyOf(arr1,7);
        System.out.println(Arrays.toString(copy));

        // Arrays.copyOfRange - Copy specific part.
        int [] copy1 = Arrays.copyOfRange(arr1,1,4);
        System.out.println(Arrays.toString(copy1));

        // Arrays.fill()
        int [] arr2 = new int[5];
        Arrays.fill(arr2,10);

        System.out.println(Arrays.toString(arr2));

        // Arrays.binarySearch()
        int index = Arrays.binarySearch(arr1,30);
        System.out.print("Index of the given number using binary search - "+index);

    }
}
