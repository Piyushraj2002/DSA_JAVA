import java.util.Scanner;

public class Challenge36Fibonacci {
    public static void main(String[] args) {
        System.out.println("Calculate Fibonacci Series.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number nth term: ");
        int n = input.nextInt();
        int result = fibonacci(n);
        System.out.println("\n fibonaci of n is:" + result);
    }
    public static int fibonacci(int m){
        int a=0;
        int b=1;
        int current; // 0,1,current
        if(m==0){
            return 0;
        }
        System.out.print("series:"+a);
        if(m == 1){
            return a;   // sirf ek term chahiye tha
        }
        System.out.print(","+b);
        for(int i=2;i<=m;i++){
            current= a+b;
            System.out.print(","+current);
            a=b;
            b=current;
        }
        return b;
    }
}
