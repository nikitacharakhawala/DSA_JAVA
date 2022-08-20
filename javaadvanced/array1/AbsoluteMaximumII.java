package javaadvanced.array1;


/**
 * Q2. Absolute maximum
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given 4 array of integers A, B, C and D of same size, find and return the maximum value of | A [ i ] - A [ j ] | + | B [ i ] - B [ j ] | + | C [ i ] - C [ j ] | + | D [ i ] - D [ j ] | + | i - j| where i != j and |x| denotes the absolute value of x.
 *
 *
 *
 * Problem Constraints
 * 2 <= length of the array A, B, C, D <= 100000
 * -106 <= A[i] <= 106
 *
 *
 *
 * Input Format
 * The arguments given are the integer arrays A, B, C, D.
 *
 *
 *
 * Output Format
 * Return the maximum value of | A [ i ] - A [ j ] | + | B [ i ] - B [ j ] | + | C [ i ] - C [ j ] | + | D [ i ] - D [ j ] | + | i - j|
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4]
 *  B = [-1, 4, 5, 6]
 *  C = [-10, 5, 3, -8]
 *  D = [-1, -9, -6, -10]
 * Input 2:
 *
 *  A = [1, 2]
 *  B = [3, 6]
 *  C = [10, 11]
 *  D = [1, 6]
 *
 *
 * Example Output
 * Output 1:
 *
 *  30
 * Output 2:
 *
 *  11
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Maximum value occurs for i = 0 and j = 1.
 * Explanation 2:
 *
 * There is only one possibility for i, j as there are only two elements in the array.
 */
public class AbsoluteMaximumII {
    public static void main(String[] args) {
        int[] A={1, 2, 3, 4};
        int[] B={-1, 4, 5, 6};
        int[] C={-10, 5, 3, -8};
        int[] D={-1, -9, -6, -10};
        System.out.println(getAbsoluteMaximum(A,B,C,D));
    }

    public static int getAbsoluteMaximum(int[] A, int[] B, int[] C, int[] D){
        int res=0, curr=0;
        for(int i=0;i<16;i++){
            int maximum=Integer.MIN_VALUE;
            int minimum=Integer.MAX_VALUE;
            for(int j=0;j<A.length;j++){
                curr=A[j];
                for(int k=0;k<4;k++){
                    int temp=0;
                    if(k==0)
                        temp=B[j];
                    else if(k==1)
                        temp=C[j];
                    else if(k==2)
                        temp=D[j];
                    else
                        temp=j;
                    if((i & (1<<k))>0){
                        curr+=temp;
                    }else{
                        curr-=temp;
                    }
                }
                maximum=Math.max(maximum, curr);
                minimum=Math.min(minimum, curr);
            }
            res=Math.max(res, (maximum-minimum));
        }
        return res;
    }
}
