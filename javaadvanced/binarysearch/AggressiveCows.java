package javaadvanced.binarysearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] A={5, 17, 100, 11};
        int B=2;
        System.out.println(getAggressiveCows(A,B));
    }

    public static int getAggressiveCows(int[] A, int B){
        Arrays.sort(A);
        int l=Integer.MAX_VALUE, ans=0;
        for(int i=0;i<A.length-1;i++){
            l=Math.min(A[i+1]-A[i], l);
        }
        int h=A[A.length-1]-A[0];
        while(l<=h){
            int mid=(l+h)/2;
            if(checkIfPossible(A,B,mid)){
                l=mid+1;
                ans=mid;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }

    public static boolean checkIfPossible(int[] A, int B, int dist){
        int count=1, last=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]-last>=dist){
                count++;
                last=A[i];
            }
        }

        return (count>=B);
    }
}
