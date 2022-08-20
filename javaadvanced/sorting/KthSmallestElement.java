package javaadvanced.sorting;

import java.util.Arrays;

/**
 * Q2. Kth Smallest Element
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Find the Bth smallest element in given array A .
 *
 * NOTE: Users should try to solve it in less than equal to B swaps.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 *
 * 1 <= B <= min(|A|, 500)
 *
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * The first argument is an integer array A.
 *
 * The second argument is integer B.
 *
 *
 *
 * Output Format
 * Return the Bth smallest element in given array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [2, 1, 4, 3, 2]
 * B = 3
 * Input 2:
 *
 * A = [1, 2]
 * B = 2
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  3rd element after sorting is 2.
 * Explanation 2:
 *
 *  2nd element after sorting is 2.
 */
public class KthSmallestElement {
    public static void main(String[] args) {
        int[] A={8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
        int B=9;
        System.out.println(getKthSmallestElement(A, B));
    }

    public static int getKthSmallestElement(int[] A, int B){
        for(int i=0;i<B;i++){
            int min=A[i], index=i;
            for(int j=i;j<A.length;j++){
                if(A[j]<min){
                    min=A[j];
                    index=j;
                }
            }
            int temp=A[i];
            A[i]=min;
            A[index]=temp;
            System.out.println(Arrays.toString(A));
        }
        return A[B-1];
    }
}
