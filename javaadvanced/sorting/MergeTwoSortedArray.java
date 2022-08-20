package javaadvanced.sorting;

import java.util.Arrays;

/**
 * Q1. Merge Two Sorted Arrays
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 *
 *
 *
 * Problem Constraints
 * -1010 <= A[i], B[i] <= 1010
 *
 *
 *
 * Input Format
 * First Argument is a 1-D array representing A.
 *
 * Second Argument is also a 1-D array representing B.
 *
 *
 *
 * Output Format
 * Return a 1-D vector which you got after merging A and B.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [4, 7, 9 ]
 * B = [2, 11, 19 ]
 * Input 2:
 *
 * A = [1]
 * B = [2]
 *
 *
 * Example Output
 * Output 1:
 *
 * [2, 4, 7, 9, 11, 19]
 * Output 2:
 *
 * [1, 2]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Merging A and B produces the output as described above.
 * Explanation 2:
 *
 *  Merging A and B produces the output as described above.
 */
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] A={4,7,9};
        int[] B={2,11,19};
        System.out.println(Arrays.toString(getSortedArray(A,B)));
    }

    public static int[] getSortedArray(int[] A, int[] B){
        int[] ans=new int[A.length+B.length];
        int i=0,j=0, pointer=0;
        while(i<A.length || j<B.length){
            if(i<A.length && j<B.length){
                if(A[i]<B[j]){
                    ans[pointer]=A[i];
                    pointer++;
                    i++;
                }else{
                    ans[pointer]=B[j];
                    pointer++;
                    j++;
                }
            }else {
                if (i < A.length) {
                    ans[pointer] = A[i];
                    pointer++;
                    i++;
                }
                if (j < B.length) {
                    ans[pointer] = B[j];
                    pointer++;
                    j++;
                }
            }
        }
        return ans;
    }
}
