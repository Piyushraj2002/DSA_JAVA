import java.util.Arrays;
import java.util.Scanner;

public class Challenge44DeleteArrayItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Deleting an element from an array and printing new array");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println(Arrays.toString(numArray));
        System.out.print("Enter the element u want to delete from array: ");
        int toBeDelete = input.nextInt();
//        int newArraySize = numArray.length-1;
//        int[] nayaArray = new int[newArraySize];
        //purana array aa gya , delete karne wala element aa gya
        //nya array create ho gya ba method likhnA hai uska
        int[] result = printAfterDelete(numArray,toBeDelete);
        System.out.println(Arrays.toString(result));
    }
    //array return krega isiliye array wala method bnega.
    public static int[] printAfterDelete(int[] numArray, int num){
         //check jo delete karna hai wo kitna baar hai present.
        int occuranceOFDeleteElement = Challenge41noOfOccurance.noOfOccur(numArray,num);
        System.out.println("Occurance of to be delete element: "+ occuranceOFDeleteElement);
        //aisa v ho sakta hai ki ek baar v present na ho
        if(occuranceOFDeleteElement == 0){
            return numArray;
        }
        //aisa v hoga ek se jyada ho means occ times
        int sizeOfNewArray = numArray.length-occuranceOFDeleteElement;
        int[] newArr = new int[sizeOfNewArray];
        int i=0,j=0;
        while (i< numArray.length){ //mtlb pura taraverse hone tak
            //i purana array me chal rha
            //j naya wala me jayega
            if(numArray[i] != num){
                newArr[j] = numArray[i];
                j++; //naya array tab hi update hoga jab kaam hoga
            }
            i++;
        }
        return newArr;
    }
}
