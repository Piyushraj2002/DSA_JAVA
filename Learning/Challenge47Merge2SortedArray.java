import java.util.Scanner;
import java.util.Arrays;
public class Challenge47Merge2SortedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Merge two sorted array in this program");
        System.out.print("Enter the total element of first array:-");
        int n = input.nextInt();
        int[] firstArray = new int[n];
        for (int i = 0;i<n;i++){
            System.out.print("Enter the element at "+ i +" position: ");
            firstArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.print("Enter the number of element in second array:- ");
        int m = input.nextInt();
        int[] secondArray = new int[m];
        for(int i=0;i<m;i++){
            System.out.print("The element at " + i+" position is: ");
            secondArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(secondArray));
        //merging two sorted array (81)
        //compare ith and jth element and push in new array
        int[] sortedArray = new int[n+m];
        int i =0;int j=0;
        int k=0;
        while(i<n && j<m){
            if(firstArray[i]<=secondArray[j]){
                sortedArray[k] = firstArray[i];
                i++;
            }else{
                sortedArray[k] = secondArray[j];
                j++;
            }
            k++;
        }
        while(i<firstArray.length){
            sortedArray[k] = firstArray[i];
            i++;k++;
        }
        while(j<secondArray.length){
            sortedArray[k]=secondArray[j];
            j++;k++;
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
