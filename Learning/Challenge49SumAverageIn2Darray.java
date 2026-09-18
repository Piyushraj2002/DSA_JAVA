import java.util.Arrays;
import java.util.Scanner;

public class Challenge49SumAverageIn2Darray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayUtility.input2Darray();
        System.out.println(Arrays.deepToString(arr));
        int sum = sumOf2dArray(arr);
        float average = (float)sum/countElement(arr);
        System.out.println("Sum of elements of arrays are: "+ sum);
        System.out.println("Average of the given array is: "+ average);
    }
    public static int sumOf2dArray(int[][] arr){

        int i=0;
        int sum = 0;
        while(i<arr.length){

            int j=0;
            while (j<arr[i].length){
                sum += arr[i][j];
                j++;

            }
            i++;
        }
        return sum;
    }
    public static int countElement(int[][] arr){
        int count = 0;
        int i=0;
        while(i<arr.length){
            int j=0;
            while (j<arr[i].length){
                j++;
                count++;
            }
            i++;
        }
        return count;
    }
}
