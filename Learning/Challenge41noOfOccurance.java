import java.util.Scanner;

public class Challenge41noOfOccurance {
    public static void main(String[] args) {
        System.out.println("find number of occurrences of an element");
        /*int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 1;
        myArray[3] = 1;
        myArray[4] = 5;*/
        Scanner input = new Scanner(System.in);
        //new method to inser the array element
        int[] myArray = ArrayUtility.inputArray();
        System.out.print("Enter the number to be count: ");
        int n = input.nextInt();
        int result = noOfOccur(myArray,n);
        System.out.println("No of occ:" + result);
    }
    public static int noOfOccur(int[] arr, int n){
        int count = 0;
        int i =0;
        while(i< arr.length){
            if(arr[i]==n){
                count++;
            }
            i++;
        }
        return count;
    }
}
