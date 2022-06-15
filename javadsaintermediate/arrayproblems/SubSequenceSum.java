package javadsaintermediate.arrayproblems;

import java.util.ArrayList;

public class SubSequenceSum {
    public static void main(String[] args) {
        int[] A={1,20,13,4,5};
        int B=18;
        System.out.println(subSeqSum(A,B));
    }

    public static int subSeqSum(int[] A, int B) {
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans=ans+(A.length*(A[i]));
        }
        return ans;
    }
}
