package javadsaintermediate.arrayproblems;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.HashMap;

/**
 * Q1. Is Dictionary?
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 *
 * Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= N, length of each word <= 105
 *
 * Sum of the length of all words <= 2 * 106
 *
 *
 *
 * Input Format
 * The first argument is a string array A of size N.
 *
 * The second argument is a string B of size 26, denoting the order.
 *
 *
 *
 * Output Format
 * Return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = ["hello", "scaler", "interviewbit"]
 *  B = "adhbcfegskjlponmirqtxwuvzy"
 * Input 2:
 *
 *  A = ["fine", "none", "no"]
 *  B = "qwertyuiopasdfghjklzxcvbnm"
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
 *  The order shown in string B is: h < s < i for the given words. So return 1.
 * Explanation 2:
 *
 *  "none" should be present after "no". Return 0.
 */
public class IsDictionary {
    public static void main(String[] args) {
        String[] s={"fine", "none", "no"};
        String B="qwertyuiopasdfghjklzxcvbnm";
        System.out.println(getDictionary(s,B));
    }

    public static int getDictionary(String[] s, String B){
            HashMap<String, Integer> hm=new HashMap<>();
            for(int i=0;i<B.length();i++){
                hm.put(B.charAt(i)+"", i);
            }
            for(int i=0;i<s.length-1;i++){
                if(!isValidOrder(s[i], s[i+1], hm)){
                    return 0;
                }
            }
            return 1;
    }

    public static boolean isValidOrder(String s1, String s2, HashMap<String,Integer> hm){
       if(s1.length()>s2.length())
           return false;
       if(hm.get(s1.charAt(0)+"")>hm.get(s2.charAt(0)+"")){
           return false;
       }
       return true;
    }
}
