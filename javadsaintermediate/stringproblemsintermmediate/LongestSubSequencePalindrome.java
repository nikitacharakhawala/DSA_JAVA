package javadsaintermediate.stringproblemsintermmediate;

import java.util.regex.Matcher;

/**
 * Q7. Longest Palindromic Substring
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 *
 * Problem Description
 *
 * Given a string A of size N, find and return the longest palindromic substring in A.
 *
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 *
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 *
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 10000
 *
 *
 *
 * Input Format
 *
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 *
 * Return a string denoting the longest palindromic substring of string A.
 *
 *
 *
 * Example Input
 *
 * A = "aaaabaaa"
 *
 *
 *
 * Example Output
 *
 * "aaabaaa"
 *
 *
 *
 * Example Explanation
 *
 * We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
 * We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
 */
public class LongestSubSequencePalindrome {
    public static void main(String[] args) {
        String A="abb";
        System.out.println(longestPalindrome(A));
    }

    public static String longestPalindrome(String A) {

        int ans=Integer.MIN_VALUE, startIndex=0, endIndex=0;
        for(int i=0;i<A.length();i++){
            int length=expand(A.toCharArray(),i,i);

            if(length>ans){
                startIndex=i-length/2;
                endIndex=startIndex+length;
            }
            ans=Math.max(ans,length);
        }

        for(int i=0;i<A.length()-1;i++){
            int length=expand(A.toCharArray(),i, i+1);
            if(length>ans){
                startIndex=i-length/2+1;
                endIndex=i+length/2+1;
            }
            ans=Math.max(ans, length);
        }


        return A.substring(startIndex,endIndex);
    }

    public static int expand(char[] array, int leftIndex, int rightIndex){

        while (leftIndex>=0 && rightIndex<array.length){

            if(array[leftIndex]==array[rightIndex]){

                leftIndex--;
                rightIndex++;

            }else{

                return rightIndex-leftIndex-1;
            }
        }
        return rightIndex-leftIndex-1;
    }


}
