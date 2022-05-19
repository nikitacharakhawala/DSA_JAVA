package javadsaintermediate.mathproblems;

public class FibonacciRec {
    public static void main(String[] args) {
        int A=9;
        System.out.println(getFibbonacci(A));
    }

    public static int getFibbonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return getFibbonacci(n-1)+getFibbonacci(n-2);
    }
}
