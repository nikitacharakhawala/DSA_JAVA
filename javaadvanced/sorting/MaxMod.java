package javaadvanced.sorting;

import java.util.Arrays;

public class MaxMod {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 3};
        System.out.println(getMaxModPair(A));
    }

    public static int getMaxModPair(int[] A){
        int max=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                secondMax=max;
                max=A[i];
            }else if(A[i]>secondMax && A[i]!=max){
                secondMax=A[i];
            }
        }
        System.out.println(max+":::"+secondMax);
        if(secondMax==Integer.MIN_VALUE)
            return 0;
        return secondMax%max;
    }
}
