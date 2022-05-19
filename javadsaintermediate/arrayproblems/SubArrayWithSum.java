package javadsaintermediate.arrayproblems;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Q1. Subarray with given sum
 * Attempted
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 *
 * Problem Description
 *
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 *
 * If the answer does not exist return an array with a single element "-1".
 *
 * First sub-array means the sub-array for which starting index in minimum.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 109
 * 1 <= B <= 109
 *
 *
 *
 * Input Format
 *
 * The first argument given is the integer array A.
 *
 * The second argument given is integer B.
 *
 *
 *
 * Output Format
 *
 * Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [1, 2, 3, 4, 5]
 *  B = 5
 *
 * Input 2:
 *
 *  A = [5, 10, 20, 100, 105]
 *  B = 110
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [2, 3]
 *
 * Output 2:
 *
 *  -1
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  [2, 3] sums up to 5.
 *
 * Explanation 2:
 *
 *  No subarray sums up to required number.
 */
public class SubArrayWithSum {
    public static void main(String[] args) {
        int[] A={5, 10, 20, 100, 105};
        int B=110;
        System.out.println(Arrays.toString(getSubarrayWithSum(A,B)));
    }

    public static int[] getSubarrayWithSum(int[] A, int B){
        long[] prefixSum=getPrefixSum(A);
        HashMap<Long, Integer> hm=new HashMap<>();
        int start=-1, end=-1;

        for(int i=0;i<prefixSum.length;i++){

            if(prefixSum[i]==B){
                start=0;
                end=i;
                break;
            }
            else if(hm.containsKey(prefixSum[i]-B)){
                start=hm.get(prefixSum[i]-B)+1;
                end=i;
                break;
            }else{
                hm.put(prefixSum[i], i);
            }
        }
        if(start==-1 && end==-1){
           int[] ans={-1};
           return ans;
        }else{
            int[] ans=new int[end-start+1];
            int index=0;

            for(int i=start;i<=end;i++){
                ans[index]=A[i];
                index++;
            }
            return ans;
        }

    }

    public static long[] getPrefixSum(int[] A){
        long[] prefix=new long[A.length];
        prefix[0]=A[0];
        for(int i=1;i<A.length;i++){
            prefix[i]=prefix[i-1]+A[i];
        }
        return prefix;
    }
}
