import java.util.Scanner;

public class Challenge35ReverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Numnber: ");
        int number = input.nextInt();
        int reverseNumber = reverseDigit(number);
        System.out.println("Reversed number: " + reverseNumber);
    }
    public static int reverseDigit(int num){
      int reverseDigit = 0;
      int lastDigit;
        while(num!=0){
            lastDigit=num%10;
            reverseDigit = (reverseDigit+lastDigit)*10;
            num=num/10;
        }
        return reverseDigit/10;
    }
}
