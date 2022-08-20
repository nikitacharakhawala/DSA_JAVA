package javaadvanced.twopointer;

import java.util.Arrays;

public class PairWithGivenDiffDist {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 4, 5};
        int B=5;
        System.out.println(pairWithDiff(A,B));
    }

    public static int pairWithDiff(int[] A, int B){
        Arrays.sort(A);
        int count=0, i=0,j=1, p1=-1, p2=-1;
        while(j<A.length){
           int ans=Math.abs(A[i]-A[j]);
           if(ans==B){
               if(p1!=A[i] && p2!=A[j]){
                   p1=A[i];
                   p2=A[j];
                   count++;
                   j++;
               }else{
                   i++;
                   j++;
               }

           }else if(ans>B){
               i++;
               if(i==j){
                   j++;
               }
           }else{
               j++;
           }
        }
        return count;
    }
}
