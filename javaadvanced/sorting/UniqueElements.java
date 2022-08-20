package javaadvanced.sorting;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] A={1, 1, 3};
        System.out.println(getUniqueElements(A));
    }

    public static int getUniqueElements(int[] A){
        int count=0;
        Arrays.sort(A);
        for(int i=1;i<A.length;i++){
           if(A[i]<=A[i-1]){
               int difference=A[i-1]+1-A[i];
               A[i]=A[i]+difference;
               count+=difference;
           }
        }
        return count;
    }
}
