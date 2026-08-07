//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge43CheckSortedArray {
    public static void main(String[] args){
       /* System.out.println("Check whether the given array is sorted or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        int size = input.nextInt();
        int [] myArrayBhai = new int[size];
        int i = 0;
        while(i != size){
            System.out.print("Enter the "+ i+ "element: ");
            myArrayBhai[i] = input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(myArrayBhai)); */
        //i have utility class so i will simply import that
        int [] myArrayBhai = ArrayUtility.inputArray();
        System.out.println(Arrays.toString(myArrayBhai));
        boolean  isInc = isIncreasing(myArrayBhai);
        boolean  isDec = isDecreasing(myArrayBhai);
        //System.out.println("So Our Array is Sorted: " + isInc);
        if( isInc || isDec ){
            System.out.println("your array is sorted.");
        }else{
            System.out.println("Your array is not sorted.");
        }
    }
    public static boolean isIncreasing(int [] arr){
        //int i =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
