package javaadvanced.array1;

import java.util.Arrays;

public class EquibrilliumIndex {
    public static void main(String[] args) {
        int[] A={-7, 1, 5, 2, -4, 3, 0};
        System.out.println(getEquibrilliumIndex(A));
    }

    public static int getEquibrilliumIndex(int[] A){
        int[] prefixArray=getPrefixSum(A);

        int sl=0,sr=0, index=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(i==0){
                sl=0;
            }else{
                sl=prefixArray[i-1];
            }
            sr=prefixArray[A.length-1]-prefixArray[i];
            if(sl==sr){
                index=Math.min(index, i);
            }
        }
        return index==Integer.MAX_VALUE ? -1 : index;
    }

    public static int[] getPrefixSum(int[] A){
        int[] prefixSum=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(i==0)
                prefixSum[i]=A[i];
            else{
                prefixSum[i]=prefixSum[i-1]+A[i];
            }
        }
        return prefixSum;
    }
}
