import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int[] myArray = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter element at"+(i)+": ");
            myArray[i] = input.nextInt();
        }
        return myArray;
    }

  //further we will add more function accordinfg to our need
  
}
