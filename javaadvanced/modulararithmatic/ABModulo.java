package javaadvanced.modulararithmatic;

/**
 * Q1. A, B and Modulo
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
 *
 *
 *
 * Problem Constraints
 * 1 <= A, B <= 109
 * A != B
 *
 *
 *
 * Input Format
 * The first argument is an integer A.
 * The second argument is an integer B.
 *
 *
 *
 * Output Format
 * Return an integer denoting the greatest possible positive M.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = 1
 * B = 2
 * Input 2:
 *
 * A = 5
 * B = 10
 *
 *
 * Example Output
 * Output 1:
 *
 * 1
 * Output 2:
 *
 * 5
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * 1 is the largest value of M such that A % M == B % M.
 * Explanation 2:
 *
 * For M = 5, A % M = 0 and B % M = 0.
 *
 * No value greater than M = 5, satisfies the condition.
 *
 *
 *
 * A%B==B%M
 * A%M-B%M=0
 * (A%M-B%M)%M=M%M
 * (A-B)%M=M%M
 * A-B=M
 */
public class ABModulo {
    public static void main(String[] args) {
        int A=5, B=10;
        System.out.println(solve(A,B));
    }

    public static int solve(int A, int B) {
        return A>B ? A-B : B-A;
    }
}
