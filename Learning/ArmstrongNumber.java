import java.util.*;
public class Challenge37ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        // int count = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //counting the number of digit
        int  ans1 = Count(number);
        System.out.println("no of digit: " + ans1);
        boolean ans2 = isArmstrong(number);
        System.out.println("Armstrong : "+ ans2);
    }
    public static int Count(int n){
        int count =0;
        while(n!=0){
            count++;
            n /= 10;
        }
        return count;
    }
    public static boolean isArmstrong(int m){
        double sum = 0;
        int ans1 = Count(m);
        int original = m;

        //int nextNumber;
        while(m!=0){
            int lastDigit = m % 10;
            sum = sum+Math.pow(lastDigit,ans1);
            m = m/10;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
