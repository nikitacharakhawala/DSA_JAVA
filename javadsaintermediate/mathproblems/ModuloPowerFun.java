package javadsaintermediate.mathproblems;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Q1. Implement Power Function
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Implement pow(A, B) % C.
 * In other words, given A, B and C, Find (AB % C).
 *
 * Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
 *
 *
 *
 * Problem Constraints
 * -109 <= A <= 109
 * 0 <= B <= 109
 * 1 <= C <= 109
 *
 *
 * Input Format
 * Given three integers A, B, C.
 *
 *
 * Output Format
 * Return an integer.
 *
 *
 * Example Input
 * A = 2, B = 3, C = 3
 *
 *
 * Example Output
 * 2
 *
 *
 * Example Explanation
 * 23 % 3 = 8 % 3 = 2
 */
public class ModuloPowerFun {
    public static void main(String[] args) {

//        System.out.println((A%C)+C);
//        System.out.println((-1%20)+20);

      String a="z";
      System.out.println(a.charAt(0)-96);
    }

    public static int pow(int A, int B, int C){
      if(A==0)
          return 0;
      if(B==0)
          return 1;
      long p=(long)(pow(A, B/2,C))%C;
      long halfPow=((p%C)*(p%C))%C;
      if(B%2==0){
          return (int)halfPow;
      }else{
          return (int)((halfPow*(A%C)+C)%C)%C;
      }

    }

}
