package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] A={-10, -10, -10 };
        int B=-5;
        System.out.println(Arrays.toString(twoSum(A, B)));

    }

    public static int[] twoSum(int[] A, int B){
        HashMap<Integer, Integer> hm=new HashMap<>();
        int[] ans=new int[2];
        boolean isAns=false;
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(B-A[i])){
                ans[0]=hm.get(B-A[i]);
                ans[1]=i+1;
                isAns=true;
                break;
            }
            if(!hm.containsKey(A[i])){
                hm.put(A[i], i+1);
            }
        }

        return isAns ? ans : null;
    }
}
