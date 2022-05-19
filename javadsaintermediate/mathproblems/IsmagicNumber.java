package javadsaintermediate.mathproblems;

/**
 * Q3. Is magic?
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given a number A, check if it is a magic number or not.
 *
 * A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.
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
 * Return an 1 if the given number is magic else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 83557
 * Input 2:
 *
 *  A = 1291
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Sum of digits of (83557) = 28
 *  Sum of digits of (28) = 10
 *  Sum of digits of (10) = 1.
 *  Single digit is 1, so it's a magic number. Return 1.
 * Explanation 2:
 *
 *  Sum of digits of (1291) = 13
 *  Sum of digits of (13) = 4
 *  Single digit is not 1, so it's not a magic number. Return 0.
 */
public class IsmagicNumber {
    public static void main(String[] args) {
        int A=83557;
        System.out.println(findMagicNum(A));
    }

    public static int findMagicNum(int A){
        int ans=isMagicNumber(A);

       while(ans>9){
           ans=isMagicNumber(ans);
       }

        if(ans==1){
            return 1;
        }
        return 0;

    }

    public static int isMagicNumber(int A){

        if(A==0)
            return 0;
        return (A%10)+isMagicNumber(A/10);
    }
}
