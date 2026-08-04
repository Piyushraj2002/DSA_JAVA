import java.util.Scanner;
public class Challenge38Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check the number is Palindrome or not?");
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        boolean result = isPalindrome(number);
        System.out.println("So the  given number is palindrome-"+result);
        input.close();
    }
    public static boolean isPalindrome(int n){
        int original = n;
        if(n<0){
            return false;
        }
        if(original==reverseDigit(n)){
            return true;
        }
        return false;
    }
    public static int reverseDigit(int m){

        int reverseNumber = 0;
        while(m!=0){
          //int reverseNumber = 0;
          int lastDigit;
          lastDigit=m%10;
          reverseNumber=(reverseNumber*10)+lastDigit;
          m/=10;
        }
        return reverseNumber;
    }
}
