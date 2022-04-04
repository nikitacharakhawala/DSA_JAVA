package javadsaintermediate.arrayproblems;


/**
 * You are given a string S, and you have to find all the amazing substrings of S.
 *
 * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 *
 * Input
 *
 * Only argument given is string S.
 *
 * Output
 *
 * Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
 *
 * Constraints
 *
 * 1 <= length(S) <= 1e6
 * S can have special characters
 *
 * Example
 *
 * Input
 *     ABEC
 *
 * Output
 *     6
 *
 * Explanation
 *     Amazing substrings of given string are :
 *     1. A
 *     2. AB
 *     3. ABE
 *     4. ABEC
 *     5. E
 *     6. EC
 *     here number of substrings are 6 and 6 % 10003 = 6.
 */
public class AmazingSubArrays {
    public static void main(String[] args) {
        AmazingSubArrays amazingSubArrays=new AmazingSubArrays();
        System.out.println(amazingSubArrays.getAmazingString("ABEC"));
    }

    public int getAmazingString(String A){
        String v="aeiouAEIOU";
        int x=0;
        for(int i=0;i<A.length();i++){
            if(v.contains(String.valueOf(A.charAt(i)))){
                x=x+A.length()-i;
            }
        }
        return x % 10003;
    }
}
