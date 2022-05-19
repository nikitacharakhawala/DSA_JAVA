package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] A={-1, 1 };
        System.out.println(getSubarrayZeroSum(A));
    }

    public static int getSubarrayZeroSum(int[] A){
        HashSet<Long> hs=new HashSet<>();
        long[] prefix=createPrefixSum(A);

        for(int i=0;i<prefix.length;i++){
            if(hs.contains(prefix[i])){
                return 1;
            }else{
                hs.add(prefix[i]);
            }

        }
        if(hs.contains((long)0)){
            return 1;
        }
        return 0;
    }

    public static long[] createPrefixSum(int[] A){
        long[] prefixSum=new long[A.length];

        for(int i=0;i<A.length;i++){
            if(i==0){
                prefixSum[i]=A[i];
            }else{
                prefixSum[i]=prefixSum[i-1]+A[i];
            }
        }
        return prefixSum;
    }
}
