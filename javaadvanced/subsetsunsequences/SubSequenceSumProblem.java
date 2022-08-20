package javaadvanced.subsetsunsequences;

/**
 * Q4. Subsequence-Sum Problem
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 *
 * You are given an array of integers of N size.
 *
 * You have to find that there is any subsequence exists or not whose sum is equal to B.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 20
 * 1 <= A[i] <= 100000
 * 0 <= B <= 1e9
 *
 *
 * Input Format
 *
 * First Argument is array of integers A
 * Second Argument is B
 *
 *
 *
 * Output Format
 *
 * Return 1 if any subsequence sum is equal to B otherwise return 0.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * A=[1,20,13,4,5]
 * B=18
 * Input 2:
 *
 *
 * A=[2,2,2,2]
 * B=5
 *
 *
 * Example Output
 *
 * 1
 * Output 1:
 *
 *
 * 1
 * Output 2:
 *
 *
 * 0
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *  There is as subsequence present at indexes 1,3,4 whose sum is 18
 * Explanation 2:
 *
 *
 * There is no possible subsequence whose sum is 5
 * NOTE: Array is considered 1 based indexing for the above explanation.
 */
public class SubSequenceSumProblem {
    public static void main(String[] args) {
        int[] A={1,20,13,4,5};
        int B=18;
        System.out.println(getIsSubSequencePresent(A,B));
    }
    public static int getIsSubSequencePresent(int[] A, int B){
        int sum=0;
        for(int i=0;i<(1<<A.length);i++){
            sum=0;
           for(int j=0;j<31;j++){
               if((i&(1<<j))>0){
                    sum+=A[j];
               }
           }
           if(sum==B)
               return 1;
        }
        return 0;
    }
}
