package javadsaintermediate.mathproblems;

/**
 * Q5. Find nth Magic Number
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved..
 * Get help from TA.
 * Problem Description
 * Given an integer A, find and return the Ath magic number.
 *
 * A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
 *
 * First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 5000
 *
 *
 *
 * Input Format
 * The only argument given is integer A.
 *
 *
 *
 * Output Format
 * Return the Ath magic number.
 *
 *
 *
 * Example Input
 * Example Input 1:
 *
 *  A = 3
 * Example Input 2:
 *
 *  A = 10
 *
 *
 * Example Output
 * Example Output 1:
 *
 *  30
 * Example Output 2:
 *
 *  650
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 *  3rd element in this is 30
 * Explanation 2:
 *
 *  In the sequence shown in explanation 1, 10th element will be 650.
 */
public class MagicNumber {
    public static void main(String[] args) {
        int n=2;
        System.out.println(getMagicNumber(n));
    }

    public static int getMagicNumber(int n){
        int ans=0, power=1;
        while(n!=0){
            power*=5;
            if(((int)n&1)==1){
                ans+=power;
            }

            n>>=1;
        }
        return ans;
    }
}
