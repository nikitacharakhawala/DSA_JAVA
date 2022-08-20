package javaadvanced.recursion;

public class MagicNumber {
    public static void main(String[] args) {
        int N=83557;
        System.out.println(isMagicNumber(N));
    }

    public static int isMagicNumber(int N){
        if(N==1)
            return 1;
        if(N<10){
            return 0;
        }
        int sum=0;
        while(N>0){
            sum+=N%10;
            N=N/10;
        }

        return isMagicNumber(sum);
    }
}
