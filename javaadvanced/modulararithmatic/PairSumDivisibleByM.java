package javaadvanced.modulararithmatic;

import java.util.HashMap;

/**
 * Q3. Pair Sum divisible by M
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
 *
 * Since the answer may be large, return the answer modulo (109 + 7).
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 109
 * 1 <= B <= 106
 *
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 *
 *
 *
 * Output Format
 * Return the total number of pairs for which the sum is divisible by B modulo (109 + 7).
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5]
 *  B = 2
 * Input 2:
 *
 *  A = [5, 17, 100, 11]
 *  B = 28
 *
 *
 * Example Output
 * Output 1:
 *
 *  4
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5).
 *  So total 4 pairs.
 */
public class PairSumDivisibleByM {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int B=2;
        System.out.println(countPairSumDivisible(A,B));
    }

    public static int countPairSumDivisible(int[] A, int B){
        HashMap<Integer, Integer> reminderCount=new HashMap<>();
        long pairCount=0, mod=(long)(Math.pow(10,9)+7);
        for(int i=0;i<A.length;i++){
            if(reminderCount.containsKey(A[i]%B)){
                reminderCount.put(A[i]%B, reminderCount.get(A[i]%B)+1);
            }else{
                reminderCount.put(A[i]%B,1);
            }
        }
        if(reminderCount.containsKey(0)) {
            pairCount = pairCount + countPairs(reminderCount.get(0));
        }
        int i=1, j=B-1;
        while(i<j){
            if(reminderCount.containsKey(i) && reminderCount.containsKey(j))
                pairCount=pairCount+(long)(reminderCount.get(i)*reminderCount.get(j));
            i++;
            j--;
        }
        if(B%2==0 && reminderCount.containsKey(B/2)){
            pairCount=pairCount+countPairs(reminderCount.get(B/2));
        }
        return (int)(pairCount%mod);

    }

    public static long countPairs(long a){
        long p=a*(a-1)/2;
        return p;
    }
}
