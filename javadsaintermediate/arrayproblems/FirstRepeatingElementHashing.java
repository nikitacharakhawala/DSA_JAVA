package javadsaintermediate.arrayproblems;

import java.util.HashMap;


public class FirstRepeatingElementHashing {
    public static void main(String[] args) {
        int[] A={10, 5, 3, 4, 3, 5, 6};
        System.out.println(repeatingElement(A));
    }

    public static int repeatingElement(int[] A){
        int minIndex=Integer.MAX_VALUE, ans=-1;
        HashMap<Integer, Integer> hs=new HashMap<Integer, Integer>();
        for(int i=0;i<A.length;i++){
           if(!hs.containsKey(A[i])){
               hs.put(A[i], i);
           }else{
               minIndex=Math.min(hs.get(A[i]), minIndex);
               ans=A[minIndex];
           }
        }
        return ans;
    }
}
