public class Challenge42MaxMinInArray {
    public static void main(String[] args) {
        System.out.println("find maximum and minimum element");
        //taking input from the ArrayUtility -> save time 
        int[] myArray = ArrayUtility.inputArray();
        int max = findMax(myArray);
        System.out.println("maximum element in my array is: " + max);
        int min = findMin(myArray);
        System.out.println("minimum element in my array is: " + min);
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        int i = 0;
        while(i< arr.length){
            if(arr[i]>max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        int j=0;
        while (j< arr.length){
            if (arr[j]<min){
                min=arr[j];
            }
            j++;
        }
         return min;
    }
}
