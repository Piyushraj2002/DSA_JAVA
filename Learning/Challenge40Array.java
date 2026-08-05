import java.util.Scanner;

public class Challenge40Array {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array");
        System.out.println("Find the sum and average of all elements in an array.");
        //int[] myARrray = {1,2,3,4,5,6,7,8,9};
        /*int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        myArray[5] = 6;
        myArray[6] = 7;
        myArray[7] = 8;
        myArray[8] = 9;
        myArray[9] = 10;*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] myArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter element at"+(i)+": ");
            myArray[i] = input.nextInt();
        }
        int sum = sumOfArray(myArray);
        System.out.println("Sum of the given arraqy is: " + sum);
        double avg = Average(myArray);
        System.out.println("average: " + avg);
    }
    public static int sumOfArray(int[] arr){
        int sum =0;
        int i=0;
        while (i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        return  sum;
    }
    public static double Average(int [] arr){
       double average = sumOfArray(arr);
        return average/arr.length;
    }
}
