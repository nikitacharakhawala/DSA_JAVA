package javaadvanced.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(getFact(n));
    }

    public static int getFact(int n){
        if(n==0)
            return 1;
        return n*getFact(n-1);
    }
}
