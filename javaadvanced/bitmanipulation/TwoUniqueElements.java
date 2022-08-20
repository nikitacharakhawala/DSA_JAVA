package javaadvanced.bitmanipulation;

import java.util.Arrays;

/**
 * Q1. Single Number III
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
 * Find the two integers that appear only once.
 *
 *
 *
 * Problem Constraints
 * 2 <= |A| <= 100000
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * The first argument is an array of integers of size N.
 *
 *
 *
 * Output Format
 * Return an array of two integers that appear only once.
 *
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 1, 2, 4]
 * Input 2:
 *
 * A = [1, 2]
 *
 *
 * Example Output
 * Output 1:
 * [3, 4]
 * Output 2:
 *
 * [1, 2]
 *
 *
 * Example Explanation
 * Explanation 1:
 * 3 and 4 appear only once.
 * Explanation 2:
 *
 * 1 and 2 appear only once.
 */
public class TwoUniqueElements {
    public static void main(String[] args) {
        int[] A={1,2,3,1,2,4};
        System.out.println(Arrays.toString(findTwoNumbers(A)));

    }

    public static int[] findTwoNumbers(int[] A){
        int xOr=0;
        for(int i=0;i<A.length;i++){
            xOr^=A[i];
        }
        int index=0;
        for(int i=0;i<32;i++){
            if(checkBit(xOr, i)){
                index=i;
                break;
            }
        }
        int set=0, unSet=0;
        for(int i=0;i<A.length;i++){
            if(checkBit(A[i], index)){
                set^=A[i];
            }else{
                unSet^=A[i];
            }
        }
        int[] ans=new int[2];
        ans[0]=set;
        ans[1]=unSet;
        Arrays.sort(ans);
        return ans;

    }

    public static boolean checkBit(int num, int pos){
        if((num & (1<<pos))!=0){
            return true;
        }
        return false;
    }


}
