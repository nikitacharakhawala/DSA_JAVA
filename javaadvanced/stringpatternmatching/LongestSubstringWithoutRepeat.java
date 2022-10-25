package javaadvanced.stringpatternmatching;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String A="AaaA";
        System.out.println(getLongestSubString(A));
    }

    public static int getLongestSubString(String A){
        int j=0, i=0, len=Integer.MIN_VALUE;
        HashSet<Character> charSet=new HashSet<>();

        while(j<A.length()-1){
            if(!charSet.contains(A.charAt(j))){
                charSet.add(A.charAt(j));
                len= Math.max(charSet.size(), len);
                j++;
            }else{
                charSet.remove(A.charAt(j));
                i++;
            }
        }
        return len;
    }
}
