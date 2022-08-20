package javaadvanced.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int N=46;
        System.out.println(getSumOfDigits(N));
    }

    public static int getSumOfDigits(int N){
        int ans=0;
        if(N==0)
            return 0;
        ans=N%10;
        return ans+getSumOfDigits(N/10);
    }
}
