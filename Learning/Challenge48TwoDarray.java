import java.util.Arrays;
import java.util.Scanner;

public class Challenge48TwoDarray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = input2Darray();
        System.out.println(Arrays.deepToString(arr));
        System.out.print("enter number to be Searched: ");
        int toBeSearch = input.nextInt();
        boolean isFound = searchInArray(arr,toBeSearch);
        if(isFound){
            System.out.println("element is present");
        }else{
            System.out.println("not present");
        }
    }
    public static boolean searchInArray(int[][] arr,int n){
       int i=0;
       while (i< arr.length){
           int j=0;
           while (j<arr[i].length){
               if(arr[i][j] == n){
                   return true;
               }
               j++;
           }
           i++;
       }
        return false;
    }
    public static int[][] input2Darray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of column: ");
        int col = input.nextInt();
        int[][] numArray = new int[rows][col];
        //enter the data
        int i=0;
        while(i<rows){
            int j=0;
            while(j<col){
                System.out.print("Enter value for row " + i + ", column " + j + ": ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}
