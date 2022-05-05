package javadsaintermediate.stringproblemsintermmediate;

import java.util.Arrays;

public class ToUpper {
    public static void main(String[] args) {
        char[] A= {'S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        to_upper(A);
        System.out.println(Arrays.toString(A));
    }

    public static char[] to_upper(char[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>=97 && A[i]<=122){
                A[i]-=32;
            }
        }
        return A;
    }
}
