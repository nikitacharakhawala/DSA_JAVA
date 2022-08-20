package javaadvanced.twopointer;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] A={0,1,2,0,1,2};
        System.out.println(Arrays.toString(getSortColor(A)));
    }

    public static int[] getSortColor(int[] A){
       int l=0, r=A.length-1, cur=0;
       while(cur<=r){
           if(A[cur]==2){
               int temp=A[r];
               A[r]=A[cur];
               A[cur]=temp;
               r--;
           }else if(A[cur]==1){
               cur++;
           }else{
               int temp=A[l];
               A[l]=A[cur];
               A[cur]=temp;
               l++;
               cur++;
           }
       }
       return A;
    }


}
