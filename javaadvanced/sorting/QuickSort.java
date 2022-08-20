package javaadvanced.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] A={1,4,10,2,1,5};
        quickSort(A, 0, A.length-1);
        System.out.println(Arrays.toString(A));
    }

    public static void quickSort(int[] A, int l, int r){
        if(l>=r){
            return;
        }
        int pivot=reArrange(A, l, r);
        quickSort(A, l, pivot-1);
        quickSort(A, pivot+1, r);
    }

    public static int reArrange(int[] A, int s, int e){
      int l=s+1, r=e;
      while(l<=r){
          if(A[l]<=A[s]){
              l++;
          }else if(A[r]>A[s]){
             r--;
          }else{
              int temp=A[l];
              A[l]=A[r];
              A[r]=temp;
              l++;
              r--;
          }
      }
      int temp=A[s];
      A[s]=A[l-1];
      A[l-1]=temp;
      return l-1;
    }
}
