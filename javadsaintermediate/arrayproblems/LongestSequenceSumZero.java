package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSequenceSumZero {
    public static void main(String[] args) {
        int[] A={ 10, -3, -9, -10, 9, -26, 7, -2, -20, -19, -9, 7, 13, -5, -8, -24, -11, 28, 28, 24 };
        System.out.println(Arrays.toString(lsZero(A)));
    }

    public static int[] lsZero(int[] A){
            int[] prefix=prefixArray(A);
            HashMap<Integer, Integer> hm=new HashMap<>();
            int ans=Integer.MIN_VALUE, start=-1, end=-1;
            System.out.println(Arrays.toString(prefix));
            for(int i=0;i<prefix.length;i++){
                if(hm.containsKey(prefix[i])){
                    if(i-hm.get(prefix[i])>ans) {
                        ans = Math.max(ans, i - hm.get(prefix[i]));
                        start = hm.get(prefix[i])+1;
                        end = i;
                    }

                }else if(prefix[i]==0){
                    if((i+1)>ans) {
                        ans = Math.max(ans, i + 1);
                        start = 0;
                        end = i;
                    }

                }else{
                    hm.put(prefix[i], i);
                }
            }
        int[] answer;
            int index=0;
            if(ans>0){
               answer=new int[ans];
            }else{
                answer=new int[0];
            }


            if(start!=-1 && end!=-1) {
                for (int i = start; i <=end; i++) {

                    answer[index] = A[i];
                    index++;
                }
            }
            return answer;

    }

    public static int[] prefixArray(int[] A){
        int[] prefix=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(i==0){
                prefix[i]=A[i];
            }else{
                prefix[i]=prefix[i-1]+A[i];
            }
        }
        return prefix;
    }
}
