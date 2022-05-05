package javadsaintermediate.stringproblemsintermmediate;

import java.util.Arrays;

public class IsIlnum {
    public static void main(String[] args) {
        char[] A= {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println(Isalnum(A));

    }

    public static int Isalnum(char[] A) {
        for(int i=0;i<A.length;i++){
            if(!((A[i]>=65 && A[i]<=90) || (A[i]>=97 && A[i]<=122) || (A[i]>=48 && A[i]<=57))){
                return 0;
            }
        }
        return 1;
    }
}
