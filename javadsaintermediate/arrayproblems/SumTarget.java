package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;

public class SumTarget {
    public static void main(String[] args) {
        int[] A={2, 7, 11, 15};
        int k=9;
        System.out.println(Arrays.toString(twoSum(A, k)));
    }

    public static int[] twoSum(final int[] A, int B) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int index1=-1, index2=-1;
        int[] ans=new int[2];
        for(int i=0;i<A.length;i++){
           hm.put(A[i], i);
        }
        for(int i=0;i<A.length;i++){
            int k=A[i]-B;
            if(hm.containsKey(k) && hm.get(k)>i){
                if(index1==-1 && index2==-1){
                    index1=i;
                    index2=hm.get(k);
                }else{
                    if(index2<hm.get(k)){
                        index1=i;
                        index2=hm.get(k);
                    }else if(index2==hm.get(k)){
                        if(i<index1){
                            index1=i;
                            index2=hm.get(k);
                        }
                    }
                }
            }

        }
        ans[0]=index1;
        ans[1]=index2;
        return ans;

    }
}
