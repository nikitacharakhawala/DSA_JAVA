package javaadvanced.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LongestContinousSeqZeroSum {
    public static void main(String[] args) {
        int[] A={1,2,-2,4,-4};
        System.out.println(Arrays.toString(longestSeqZeroSum(A)));
    }

    public static int[] longestSeqZeroSum(int[] A){
        int[] prefixArray=prefixSum(A);
        HashMap<Integer, Integer> hMap=new HashMap<>();
        int maxLength=Integer.MIN_VALUE, startIndex=-1, endIndex=-1;
        hMap.put(0,-1);
        //System.out.println(Arrays.toString(prefixArray));
        for(int i=0;i<prefixArray.length;i++){
            if(hMap.containsKey(prefixArray[i])){
                int length=i-hMap.get(prefixArray[i]);
                if(length>maxLength){
                    startIndex=hMap.get(prefixArray[i])+1;
                    endIndex=i;
                    maxLength=length;
                }
            }else{
                hMap.put(prefixArray[i], i);
            }
        }
        int[] answer=new int[endIndex-startIndex+1];
        int index=0;
        for(int i=startIndex;i<=endIndex;i++){
            answer[index++]=A[i];
        }
        return answer;
    }

    public static int[] prefixSum(int[] A){
        int[] prefixArray=new int[A.length];

        for(int i=0;i<A.length;i++){
            if(i==0){
                prefixArray[i]=A[i];
            }else{
                prefixArray[i]=prefixArray[i-1]+A[i];
            }
        }
        return prefixArray;
    }


}
