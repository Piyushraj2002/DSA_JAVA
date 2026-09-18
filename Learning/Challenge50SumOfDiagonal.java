import java.util.Arrays;
import java.util.Scanner;

public class Challenge50SumOfDiagonal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Find the sum of diagonal of matrix");
        int[][] squareMatrix = ArrayUtility.input2Darray();
        System.out.println(Arrays.deepToString(squareMatrix));
        long sumOfDiagonalElement = sumOfDiagonal(squareMatrix);
        System.out.println("sum of two diagonal are: "+ sumOfDiagonalElement);
    }
    public static long sumOfDiagonal(int[][] arr){
        long sum = findSumOfDiagonal(arr);
        if(arr.length % 2 != 0){ //odd nxn per repeat add ho rha
            int repeatWalaKaIndex = arr.length /2;
            sum-=arr[repeatWalaKaIndex][repeatWalaKaIndex];
        }
        return sum;
    }
    public static int findSumOfDiagonal(int[][] arr){
        int i=0;
        int sum = 0;
        while (i<arr.length){
            int j=0;
            while (j< arr.length){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j == arr.length-1){
                    sum+=arr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
