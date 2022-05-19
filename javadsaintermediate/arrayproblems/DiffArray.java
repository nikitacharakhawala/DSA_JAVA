package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;

public class DiffArray {
    public static void main(String[] args) {
        int[] A={1,5,3};
        int k=2;
        System.out.println(getOccurances(A, k));
    }

    public static int getOccurances(int[] A, int k){
        HashMap<Integer, Integer> hm=new HashMap<>();


        for(int i=0;i<A.length;i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i])+1);
            }else{
                hm.put(A[i], 1);
            }
        }

        for(int i=0;i<A.length;i++){
            int X=k+A[i];

            if(X==A[i]) {
                if (hm.get(A[i]) > 1) {


                    return 1;
                }
            }else if(hm.containsKey(X)){

                   return 1;
               }

        }


        return 0;
    }
}
