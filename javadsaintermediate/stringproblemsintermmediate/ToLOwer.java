package javadsaintermediate.stringproblemsintermmediate;

import java.util.Arrays;

public class ToLOwer {
    public static void main(String[] args) {
        char[] A= {'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        to_lower(A);
        System.out.println(Arrays.toString(A));
    }

    public static char[] to_lower(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>=65 && A[i]<=90){
                A[i]+=32;
            }
        }
        return A;
    }
}
