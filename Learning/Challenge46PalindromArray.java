import java.util.Scanner;
import java.util.Arrays;
public class Challenge46PalindromeArray {
    public static void main(String[] args){
       System.out.println("To check the Palindrome Array");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Element: ");
        int n = input.nextInt();
        int[] myArray = new int[n];
        for(int i=0;i<n;i++){
          System.out.print("Enter the element at "+ i +" position: ");
          myArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(myArray));
        boolean result = isPalindromeArray(myArray);
        //System.out.println("after passsing from function:- "+ result);
        if(result){
            System.out.println("ur number is plindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static boolean isPalindromeArray(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
