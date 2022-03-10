package javadsa.stringproblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(checkPalindrome(s) ? 1 : 0);
    }

    public static boolean checkPalindrome(String s){
        int i=0, j=s.length()-1;
        while(j>i){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
