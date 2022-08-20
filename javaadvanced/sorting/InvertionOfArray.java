package javaadvanced.sorting;

import java.util.Arrays;

/**
 * Q1. Inversion count in an array
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array <= 100000
 *
 * 1 <= A[i] <= 10^9
 *
 *
 *
 * Input Format
 * The only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return the number of inversions of A modulo (109 + 7).
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [3, 2, 1]
 * Input 2:
 *
 * A = [1, 2, 3]
 *
 *
 * Example Output
 * Output 1:
 *
 * 3
 * Output 2:
 *
 * 0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  All pairs are inversions.
 * Explanation 2:
 *
 *  No inversions.
 */
public class InvertionOfArray {
    static int mod = (int)Math.pow(10,9)+7;

    public static void main(String[] args) {
        int[] A={ 221, 117, 1783, 3698, 1922, 1554, 3672, 2598, 1286, 1367, 4283, 360, 1928, 1921, 2659, 2932, 1257, 3683, 656, 3966, 3619  };
        System.out.println(mergeSort(A, 0, A.length-1));

       // System.out.println(Arrays.toString(A));
    }

   public static int mergeSort(int[] A, int l, int r){


          if(l==r)
              return 0;
            int mid=(l+r)/2;
            //System.out.println(l+"::"+r);
            int x=mergeSort(A, l,mid);
            int y=mergeSort(A, mid+1, r);
            int z=merge(A, l, mid, r);
            return (x+y+z)%mod;




   }

   public static int merge(int[] A, int l, int mid, int r){
        int[] n1=new int[mid-l+1];
        int[] n2=new int[r-mid];
        int count=0;

        for(int i=0;i<n1.length;i++)
            n1[i]=A[l+i];
        for(int j=0;j<n2.length;j++)
            n2[j]=A[mid+1+j];

        int i=0,j=0,k=l;

        while(i<n1.length && j<n2.length){
            if(n1[i]<=n2[j]){
                A[k]=n1[i];

                i++;

            }else{
                A[k]=n2[j];
                j++;
                count=count+n1.length-i;
            }
            k++;
        }

        while(i<n1.length){
            A[k]=n1[i];
            i++;
            k++;
        }

        while(j<n2.length){
            A[k]=n2[j];
            j++;
            k++;
        }
        return count%mod;
   }
}
