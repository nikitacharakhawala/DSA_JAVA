package javaadvanced.modulararithmatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Q4. Powers of 3
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 *
 * Problem Description
 *
 * Given a positive integer A. Return an array of minimum length whose elements represent the powers of 3, and the sum of all the elements is equal to A.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= A <= 109
 *
 *
 *
 * Input Format
 *
 * Single argument is an integer A.
 *
 *
 *
 * Output Format
 *
 * Return an array of minimum length of powers of 3 whose elements sums to A.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  13
 *
 * Input 2:
 *
 *  3
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [1, 3, 9]
 *
 * Output 2:
 *
 *  [3]
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  30 = 1, 31 = 3, 32 = 9.
 *  Also, 1 + 3 + 9 = 13. Here A = 13 which can be represented as the sum of 1, 3 and 9.
 */
public class PowerOfThree {
    public static void main(String[] args) {
        int A=411;

        for(Integer ele:getPowerOfThree(A)){
            System.out.print(ele+" ");
        }
    }

    public static ArrayList<Integer> getPowerOfThree(int A){
        ArrayList<Integer> answer=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int n=A;
        while(n>0){
            answer.add(n%3);
            n/=3;
        }
       // Collections.reverse(answer);
        for(int j=0;j<answer.size();j++){
            System.out.print(answer.get(j)+" ");
            for(int i=0;i<answer.get(j);i++){
                ans.add((int)Math.pow(3,j));
            }
        }
        System.out.println();


        return ans;
    }
}
