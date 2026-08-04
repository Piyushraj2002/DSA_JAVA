import java.util.Scanner;
public class Challenge39PatternPrinting {
    static void main(String[] args) {
        System.out.println("Three Pattern printing in single code");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = input.nextInt();
        rightPyramid(n);
        System.out.println("Next");
        reverseRightHalfPyramid(n);
        System.out.println("Next");
        leftHalfPyramid(n);
    }
    public static void rightPyramid(int n){
        for(int i =1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseRightHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void leftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
