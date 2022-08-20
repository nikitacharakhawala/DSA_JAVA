package javaadvanced.recursion;

public class KthSymbol {
    public static void main(String[] args) {
        int A=2, B=2;
        System.out.println(getKthSymbol(A,B));
    }

    public static int getKthSymbol(int A, int B){
        if(B==1)
            return 0;
        int val=getKthSymbol(A-1, B/2+B%2);
        if(val==0){
            if(B%2==0)
                return 1;
            else
                return 0;
        }else{
            if(B%2==0)
                return 0;
            else
                return 1;
        }
    }
}
