package javaadvanced.twopointer;

import java.util.Arrays;

public class ClosestPairSortedArray {
    public static void main(String[] args) {
      int[] A={1, 3, 5, 7, 9 };
      int[] B={2, 4, 6, 8, 10 };
      int C=10;
      System.out.println(Arrays.toString(getClosestPair(A,B,C)));
    }

    public static int[] getClosestPair(int[] A, int[] B, int C){
        int i=0,j=B.length-1, min_diff=Integer.MAX_VALUE;
        int[] ans=new int[2];
        while(i<A.length && j>=0){
            int sum=A[i]+B[j];
            System.out.println(sum+":::"+A[i]+"::"+B[j]);
            if(Math.abs(sum-C)==0){
                ans[0]=A[i];
                ans[1]=B[j];
                return ans;
            }else if(sum<C){
                if(Math.abs(sum-C)==min_diff && i < ans[0] || (i ==ans[0] && j < ans[1])) {
                    ans[0]=Math.min(i,ans[0]);
                    ans[1]=Math.min(j, ans[1]);
                    System.out.println("min:same::"+min_diff);
                }
                else if(Math.abs(sum-C)<min_diff){
                    ans[0]=i;
                    ans[1]=j;
                    min_diff=Math.abs(sum-C);
                    System.out.println("min:::"+min_diff);
                }
                i++;
            }else{
                if(Math.abs(sum-C)==min_diff && i < ans[0] || (i ==ans[0] && j < ans[1])) {
                    ans[0]=Math.min(i,ans[0]);
                    ans[1]=Math.min(j, ans[1]);

                }
                else if(Math.abs(sum-C)<min_diff){
                    ans[0]=i;
                    ans[1]=j;
                    min_diff=Math.abs(sum-C);
                    System.out.println("max:::"+min_diff);
                }
                j--;
            }
        }
        ans[0]=A[ans[0]];
        ans[1]=B[ans[1]];
        return ans;
    }
}
