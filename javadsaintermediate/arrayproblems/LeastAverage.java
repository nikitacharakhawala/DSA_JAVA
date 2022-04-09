package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 103
 * 1 <= B <= 109
 * 1 <= C[i] <= 106
 *
 *
 *
 * Input Format
 * The first argument is the integer A.
 * The second argument is the integer B.
 * The third argument is the integer array C.
 *
 *
 *
 * Output Format
 * Return a single integer which denotes the maximum sum.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = 5
 * B = 12
 * C = [2, 1, 3, 4, 5]
 *
 * Input 2:
 *
 * A = 3
 * B = 1
 * C = [2, 2, 2]
 *
 *
 *
 * Example Output
 * Output 1:
 *
 * 12
 *
 * Output 2:
 *
 * 0
 *
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
 *
 * Explanation 2:
 *
 * All elements are greater than B, which means we cannot select any subarray.
 * Hence, the answer is 0.
 */
public class LeastAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList( 15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18 ));
        int B=6;
        ArrayList<Integer> prefixSum=getprefixSum(A);
        printArray(A);
        printArray(prefixSum);
        System.out.println(getLeastAverage(prefixSum, B));
    }

    public static int getLeastAverage(ArrayList<Integer> prefixSum, int B){
        int index=0, leastSum=Integer.MAX_VALUE, sum=0,leastAvg=Integer.MAX_VALUE;
        for(int s=0;s<prefixSum.size()-B+1;s++){
            int e=s+B-1;
            System.out.print("["+s+","+e+"]:::");
           if(s==0){
               sum=prefixSum.get(e);
           }else{
               sum=prefixSum.get(e)-prefixSum.get(s-1);
           }
//            System.out.print("sum:::"+sum);
           //avg=(int)sum/B;
            System.out.print(":::avg:::"+sum);
           if(sum<=leastSum){
               leastSum=sum;
               index=s;
           }
            System.out.println();
        }
        return index;
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
