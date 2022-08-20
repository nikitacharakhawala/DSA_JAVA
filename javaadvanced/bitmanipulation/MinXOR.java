package javaadvanced.bitmanipulation;

import java.util.Arrays;

public class MinXOR {
    public static void main(String[] args) {
        int[] A={15, 5, 1, 10, 2 };
        System.out.println(minXOR(A));
    }

    public static int minXOR(int[] A){
        Arrays.sort(A);
        int minXOR=0;
        if(A.length==1){
            return A[0];
        }else{
            minXOR=A[0]^A[1];
            System.out.println(minXOR);
            for(int i=2;i<A.length;i++){
                int xOR=A[i]^A[i-1];
                System.out.println(xOR);
                if(xOR<minXOR){
                    minXOR=xOR;
                }
            }
        }
        return minXOR;
    }
}
