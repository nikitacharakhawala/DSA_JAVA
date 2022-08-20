package javaadvanced.modulararithmatic;

/**
 * Q5. Trailing Zeros in Factorial
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an integer A, return the number of trailing zeroes in A! i.e., factorial of A.
 *
 * Note: Your solution should run in logarithmic time complexity.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 109
 *
 *
 *
 * Input Format
 * First and only argument is a single integer A.
 *
 *
 *
 * Output Format
 * Return a single integer denoting number of zeroes.
 *
 *
 *
 * Example Input
 * Input 1
 *
 *  A = 5
 * Input 2:
 *
 *  A = 6
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  A! = 120.
 *  Number of trailing zeros = 1. So, return 1.
 * Explanation 2:
 *
 *  A! = 720
 *  Number of trailing zeros = 1. So, return 1.
 */
public class TraillingZeroInFactorial {
    public static void main(String[] args) {
        int A=5;
        System.out.println(getTraillingZeroCount(A));
    }

    public static int getTraillingZeroCount(int A){
        int count=0;
        while(A>0){
            A=A/5;
            count+=A;
        }
        return count;
    }
}
