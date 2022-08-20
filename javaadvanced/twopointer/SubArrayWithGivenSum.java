package javaadvanced.twopointer;

import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] A={42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37};
        int B=100;
        System.out.println(Arrays.toString(getSumArrayWithGivenSum(A, B)));
    }

    public static int[] getSumArrayWithGivenSum(int[] A, int B){
        int i=0, j=1, sum=0;
        sum=A[i]+A[j];
        int[] ans;
        while(j<A.length){
            if(sum==B)
                break;
            else if(sum<B){
                j++;
                if(j<A.length)
                    sum+=A[j];
            }else{
                sum-=A[i];
                i++;
            }
        }

        if(sum==B){
            ans=new int[j-i+1];
            int index=0;
            for(int k=i;k<=j;k++){
                ans[index]=A[k];
                index++;
            }
        }else{
            ans=new int[1];
            ans[0]=-1;
        }
        return ans;
    }
}
