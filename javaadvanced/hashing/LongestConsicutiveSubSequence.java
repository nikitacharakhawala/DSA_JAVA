package javaadvanced.hashing;

import java.util.HashSet;

public class LongestConsicutiveSubSequence {
    public static void main(String[] args) {
        int[] A={100,4,200,1,3,2};
        System.out.println(getLongestConsequtiveSubSeq(A));
    }

    public static int getLongestConsequtiveSubSeq(int[] A){
        HashSet<Integer> hs=new HashSet<>();
        int length=0;
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        for(int i=0;i<A.length;i++){
            if(hs.contains(A[i]-1)){
                continue;
            }else{
                int count=1, next=A[i]+1;
                while(hs.contains(next)){
                    count++;
                    next++;
                }
                length=Math.max(count, length);
            }
        }
        return length;
    }
}
