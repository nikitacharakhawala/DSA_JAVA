package javaadvanced.modulararithmatic;

/**
 * Q1. Mod Sum
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an array of integers A, calculate the sum of A [ i ] % A [ j ] for all possible i, j pairs. Return sum % (109 + 7) as an output.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array A <= 105
 *
 * 1 <= A[i] <= 103
 *
 *
 *
 * Input Format
 * The only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return a single integer denoting sum % (109 + 7).
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3]
 * Input 2:
 *
 *  A = [17, 100, 11]
 *
 *
 * Example Output
 * Output 1:
 *
 *  5
 * Output 2:
 *
 *  61
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  (1 % 1) + (1 % 2) + (1 % 3) + (2 % 1) + (2 % 2) + (2 % 3) + (3 % 1) + (3 % 2) + (3 % 3) = 5
 */
public class ModSum {
    public static void main(String[] args) {
        int[] A={1,2,3};
        System.out.println(getModSum(A));
    }

    public static int getModSum(int[] A){
        int[] frequencyArray=new int[1001];
        long modSum=0, mod=100000007;
        for(int i=0;i<A.length;i++){
            frequencyArray[A[i]]++;
        }
        for(int i=1;i<=1000;i++){
            for(int j=1;j<=1000;j++){
                if(i!=j && frequencyArray[i]!=0 && frequencyArray[j]!=0){
                    int modValue=((i%j)*frequencyArray[i]*frequencyArray[j]);
                    modSum=((modSum%mod)+(modValue%mod))%mod;
                }
            }
        }
        return (int)(modSum%mod);

    }
}

