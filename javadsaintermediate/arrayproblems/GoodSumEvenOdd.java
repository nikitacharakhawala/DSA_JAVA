package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 * Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
 * 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
 * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
 * Your task is to find the count of good subarrays in A.
 *
 *
 *
 * Problem Constraints
 * 1 <= len(A) <= 103
 * 1 <= A[i] <= 103
 * 1 <= B <= 107
 *
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is an integer B.
 *
 *
 *
 * Output Format
 * Return the count of good subarrays in A.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 2, 3, 4, 5]
 * B = 4
 *
 * Input 2:
 *
 * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
 * B = 65
 *
 *
 *
 * Example Output
 * Output 1:
 *
 * 6
 *
 * Output 2:
 *
 * 36
 *
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Even length good subarrays = {1, 2}
 * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
 */
public class GoodSumEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList( 1, 11, 2, 3, 15 ));
        ArrayList<Integer> prefixSum=getprefixSum(A);
        int B=10;
        System.out.println(getGoodCount(prefixSum, B));
    }

    public static int getGoodCount(ArrayList<Integer> A, int B) {
        ArrayList<Integer> prefixSum=getprefixSum(A);
        int sum=0, count=0;
        for(int s=0;s<A.size();s++){
            for(int e=s;e<A.size();e++){
                sum=0;
                if(s==0){
                    sum=prefixSum.get(e);
                }else{
                    sum=prefixSum.get(e)-prefixSum.get(s-1);
                }
                if((e-s+1)%2==0 && sum<B){
                    count++;
                }else if((e-s+1)%2!=0 && sum>B){
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<Integer> getprefixSum(ArrayList<Integer> A){
        ArrayList<Integer> prefixSum=new ArrayList<>();
        prefixSum.add(A.get(0));
        for(int i=1; i<A.size();i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i));
        }
        return prefixSum;
    }
}
