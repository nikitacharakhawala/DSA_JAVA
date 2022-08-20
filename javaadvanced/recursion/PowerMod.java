package javaadvanced.recursion;

public class PowerMod {
    public static void main(String[] args) {
        int A=2, B=3, C=3;
        System.out.println(getPowerMod(A,B,C));
    }

    public static int getPowerMod(int A, int B, int C){
        if(B==0)
            return 1;
        long halfPower=getPowerMod(A,B/2, C);
        if(B%2==0)
            return (int)((halfPower%C)*(halfPower%C))%C;
        else
            return (int)((halfPower%C)*(halfPower%C)*A%C)%C;
    }
}
