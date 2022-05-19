package javadsaintermediate.mathproblems;

public class FactorialRec {
    public static void main(String[] args) {
        int A=4;
        System.out.println(getFactorial(A));
    }

    public static int getFactorial(int n){
       if(n==0)
           return 0;
       if(n==1)
           return 1;
       return n*getFactorial(n-1);

    }
}
