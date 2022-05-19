package javadsaintermediate.arrayproblems;

import java.util.HashMap;

public class ShaggyAndDistances {
    public static void main(String[] args) {
        int[] A={7, 1, 3, 4, 1, 7};
        System.out.println(checkDistance(A));
    }

    public static int checkDistance(int[] A){
        HashMap<Integer, Integer> hm=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                ans=Math.min(ans, i-hm.get(A[i]));
            }else{
                hm.put(A[i],i);
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}
