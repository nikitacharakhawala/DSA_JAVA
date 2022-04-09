package javadsaintermediate.arrayproblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 *
 * Given an array A of N non-negative numbers and a non-negative number B,
 * you need to find the number of subarrays in A with a sum less than B.
 * We may assume that there is no overflow.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 103
 *
 * 1 <= A[i] <= 1000
 *
 * 1 <= B <= 107
 *
 *
 *
 * Input Format
 *
 * First argument is an integer array A.
 *
 * Second argument is an integer B.
 *
 *
 *
 * Output Format
 *
 * Return an integer denoting the number of subarrays in A having sum less than B.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = [2, 5, 6]
 *  B = 10
 *
 * Input 2:
 *
 *  A = [1, 11, 2, 3, 15]
 *  B = 10
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  4
 *
 * Output 2:
 *
 *  4
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
 *
 * Explanation 2:
 *
 *  The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
 */
public class CountingSubArraySum {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList( 1, 11, 2, 3, 15 ));
        ArrayList<Integer> prefixSum=getprefixSum(A);
        int B=10;
        System.out.println(countArrays(A, prefixSum, B));
    }

    public static int countArrays(ArrayList<Integer> A, ArrayList<Integer> prefix, int B){
        int count=0, sum=0, lineCount=1;
        for(int s=0;s<A.size();s++){

            for(int e=s; e<A.size();e++){
                sum=0;
                if(s==0)
                    sum+=prefix.get(e);
                else
                    sum+=prefix.get(e)-prefix.get(s-1);

                if(sum<B)
                    count++;
                lineCount++;
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

    public static void printArray(ArrayList<Integer> A){
        for(Integer ele: A){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
