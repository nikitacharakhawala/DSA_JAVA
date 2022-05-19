package javadsaintermediate.mathproblems;

/**
 * Q2. Sum of Digits!
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given a number A, we need to find the sum of its digits using recursion.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 109
 *
 *
 *
 * Input Format
 * The first and only argument is an integer A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the sum of digits of the number A.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 46
 * Input 2:
 *
 *  A = 11
 *
 *
 * Example Output
 * Output 1:
 *
 *  10
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Sum of digits of 46 = 4 + 6 = 10
 * Explanation 2:
 *
 *  Sum of digits of 11 = 1 + 1 = 2
 */
public class SumOfDigitsRec {
    public static void main(String[] args) {
        int n=46;
        System.out.println(getSumOfDigits(n));
    }

    public static int getSumOfDigits(int n){
        if(n==0)
            return 0;
        return (n%10)+getSumOfDigits(n/10);
    }
}
