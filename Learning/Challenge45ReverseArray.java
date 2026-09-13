import java.util.Arrays;

public class Challenge45ReverseArray {
    public static void main(String[] args) {
        //reverse an array
        System.out.println("program to reverse an array.");
        int[] arr = ArrayUtility.inputArray();
        System.out.println(Arrays.toString(arr));
        int[] newArr = reverseArray(arr);
        System.out.println("reversed array is: "+ Arrays.toString(newArr));

    }
    public static int[] reverseArray(int[] arr){
        int newsize = arr.length;
        int[] newArray = new int[newsize];
        int i= arr.length-1;
        int j =0;
        while(i>=0){
            newArray[j] = arr[i];
            j++;
            i--;
        }
        return newArray;
    }
}
