package javaadvanced.hashing;

import java.util.HashMap;

public class CountRactangles {
    public static void main(String[] args){
        int[] A={1, 1, 2, 2, 3, 3};
        int[] B={1, 2, 1, 2, 1, 2};
        System.out.println(countRactangles(A, B));
    }

    public static int countRactangles(int[] A, int[] B){
        HashMap<String, Integer> coordinatesMap=new HashMap<>();
        int ractangleCount=0;
        for(int i=0;i<A.length;i++){
            coordinatesMap.put(A[i]+""+B[i], coordinatesMap.getOrDefault(A[i]+""+B[i], 0)+1);
        }
        System.out.println(coordinatesMap);

        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]!=A[j] && B[i]!=B[j]){
                    if(coordinatesMap.containsKey(A[j]+""+B[i]) && coordinatesMap.containsKey(A[i]+""+B[j])){
                        ractangleCount++;
                    }
                }
            }
        }
        return ractangleCount/2;
    }
}
