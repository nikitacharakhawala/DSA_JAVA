package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctNumbersInWIndow {
    public static void main(String[] args) {
        int[] A={1, 2, 1, 3, 4, 3};
        int B=3;
        System.out.println(Arrays.toString(getDistinctNum(A, B)));

    }

    public static int[] getDistinctNum(int[] A, int B){
        int[] answer=new int[A.length-B+1];
        int index=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<B;i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            }else{
                hm.put(A[i], 1);
            }
        }
        answer[index]=hm.size();
        index++;
        for(int i=1;i<=A.length-B;i++){
            int j=i+B-1;
            int count=hm.get(A[i-1])-1;
            if(count==0){
                hm.remove(A[i-1]);
            }else{
                hm.put(A[i-1], count);
            }
            if(hm.containsKey(A[j])){
                hm.put(A[j], hm.get(A[j])+1);
            }else{
                hm.put(A[j], 1);
            }
            answer[index]=hm.size();
            index++;
        }

        return answer;

    }
}
