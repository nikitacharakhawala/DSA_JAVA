package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenXOR {
    public static void main(String[] args) {
        int[] A={3, 6, 8, 10, 15, 50};
        int B=5;
        System.out.println(pairWithXOR(A, B));
    }

    public static int pairWithXOR(int[] A, int B){
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            int x=A[i]^B;
            if(hs.contains(x)){
                count++;
            }else{
                hs.add(A[i]);
            }
        }
        return count;
    }
}
