package javaadvanced.hashing;

import javadsaintermediate.tree.PreOrderTraversal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class CompareSortedArray {
    public static void main(String[] args) {
        int[] A={1, 7, 11, 8, 11, 7, 1};
        int[][] B={{0, 2, 4, 6}};
        System.out.println(Arrays.toString(getCompareSortedArray(A,B)));
    }

    public static int[] getCompareSortedArray(int[] A, int[][] B){
        Random random=new Random();
        long[] prefixSum=new long[A.length];
        int[] answer=new int[B.length];
        HashMap<Integer, Integer> randomHashMap=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(!randomHashMap.containsKey(A[i])){
                randomHashMap.put(A[i], random.nextInt(Integer.MAX_VALUE-1));
            }
            if(i==0){
                prefixSum[i]=randomHashMap.get(A[i]);
            }else{
                prefixSum[i]=prefixSum[i-1]+randomHashMap.get(A[i]);
            }
        }
        //System.out.println(Arrays.toString(prefixSum));
        for(int i=0;i<B.length;i++){
            int l1=B[i][0];
            int r1=B[i][1];
            int l2=B[i][2];
            int r2=B[i][3];
            long leftSum=(l1==0) ? prefixSum[r1] : prefixSum[r1]-prefixSum[l1-1];
            long rightSum=(l2==0) ? prefixSum[r2] : prefixSum[r2]-prefixSum[l2-1];
            System.out.println(leftSum+":::"+rightSum);
            if(leftSum==rightSum){
                answer[i]=1;
            }else {
                answer[i]=0;
            }
        }
        return answer;
    }
}
