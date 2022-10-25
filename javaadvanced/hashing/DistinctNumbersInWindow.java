package javaadvanced.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int[] A={1,2,1,3,4,3};
        int B=3;
        System.out.println(Arrays.toString(getDistinctNumber(A,B)));
    }

    public static int[] getDistinctNumber(int[] A, int B){
        HashMap<Integer, Integer> freqMap=new HashMap<>();
        int[] answer=new int[A.length-B+1];
        int index=0;
        for(int i=0;i<B;i++){
            freqMap.put(A[i], i);
        }
        answer[index]=freqMap.size();
        index++;
        for(int i=1;i<=A.length-B;i++){
            freqMap.remove(A[i-1], i-1);
            freqMap.put(A[i+B-1], i+B-1);
            answer[index]=freqMap.size();
            index++;
        }
        return answer;
    }
}
