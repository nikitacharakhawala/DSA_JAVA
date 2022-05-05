package javadsaintermediate.mathproblems;

import javax.swing.text.StyleContext;

public class ConcateIntegers {
    public static void main(String[] args) {
        int A=30, B=20,C=10;
        System.out.println(concateInteger(A, B, C));
    }

    public static int concateInteger(int A, int B, int C){
       int min=Math.min(A, Math.min(B,C));
       int max=Math.max(A, Math.max(B,C));
       int middle=(A+B+C)-(min+max);
       return Integer.parseInt(String.valueOf(min).concat(String.valueOf(middle).concat(String.valueOf(max))));
    }
}
