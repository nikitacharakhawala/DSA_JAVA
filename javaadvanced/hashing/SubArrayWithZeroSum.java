package javaadvanced.hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5, -15};
        System.out.println(getSubArrayWithSumZero(A));
    }

    public static int getSubArrayWithSumZero(int[] A){
        long sum=0;
        HashSet<Long> sumSet=new HashSet<>();
        sumSet.add(sum);
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(sumSet.contains(sum)){
                return 1;
            }else{
                sumSet.add(sum);
            }
        }
        return 0;
    }
}
