package javaadvanced.sorting;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] A={3,4,1,9,56,7,9,12};
        int B=5;
        System.out.println(getMaximumChocolate(A,B));
    }

    public static int getMaximumChocolate(int[] A, int B){
        if(B==0 || A.length==0)
            return 0;
        Arrays.sort(A);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<A.length-B+1;i++){
            ans=Math.min(ans, A[i+B-1]-A[i]);
        }
        return ans;

    }
}
