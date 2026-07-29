class Solution {
    public int reverse(int x) {
        int lastDigit;
        //int reverseDigit =0;
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        long reverseDigit =0;
        while(x!=0){
            lastDigit = x%10;
            reverseDigit = (reverseDigit *10)+ lastDigit;
            x = x/10;
        }
        if(reverseDigit > Integer.MAX_VALUE || reverseDigit< Integer.MIN_VALUE){
            return 0;
        }else{
            return (int) reverseDigit;
        }
       // return reverseDigit;
    }
}