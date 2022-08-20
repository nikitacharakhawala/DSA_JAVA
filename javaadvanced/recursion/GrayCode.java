package javaadvanced.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q2. Gray Code
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 *
 * Given a non-negative integer A representing the total number of bits in the code, print the sequence of gray code.
 *
 * A gray code sequence must begin with 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 16
 *
 *
 *
 * Input Format
 * The first argument is an integer A.
 *
 *
 *
 * Output Format
 * Return an array of integers representing the gray code sequence.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = 2
 * Input 1:
 *
 * A = 1
 *
 *
 * Example Output
 * output 1:
 *
 * [0, 1, 3, 2]
 * output 2:
 *
 * [0, 1]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * for A = 2 the gray code sequence is:
 *     00 - 0
 *     01 - 1
 *     11 - 3
 *     10 - 2
 * So, return [0,1,3,2].
 * Explanation 1:
 *
 * for A = 1 the gray code sequence is:
 *     00 - 0
 *     01 - 1
 * So, return [0, 1].
 */
public class GrayCode {
    public static void main(String[] args) {
        int A=2;
        ArrayList<Integer> grayCodes=getGrayCode(A);
        for(Integer grayCodeVal:grayCodes){
            System.out.println(grayCodeVal);
        }
    }

    public static ArrayList<Integer> getGrayCode(int A){
        if(A==1){
            return new ArrayList<Integer>(Arrays.asList(0,1));
        }
        ArrayList<Integer> halfList=getGrayCode(A-1);
        ArrayList<Integer> grayCodes=new ArrayList<>();
        for(Integer ele: halfList){
            grayCodes.add(ele);
        }
        for(int i=grayCodes.size()-1;i>=0;i--){
            grayCodes.add(grayCodes.get(i)+(1<<(A-1)));
        }
        return grayCodes;


    }
}
