package javaadvanced.hashing;

import java.util.HashMap;

public class ShaggyAndDistances {
    public static void main(String[] args) {
        int[] A={7,1,3,4,1,7};
        System.out.println(getDistances(A));
    }

    public static int getDistances(int[] A){
        int distance=Integer.MAX_VALUE;
        HashMap<Integer, Integer> distanceIndexMap=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(!distanceIndexMap.containsKey(A[i])){
                distanceIndexMap.put(A[i], i);
            }else{
                distance=Math.min(i-distanceIndexMap.get(A[i]), distance);
            }
        }
        return distance==Integer.MAX_VALUE ? -1 : distance;
    }
}
