package javadsa.stringproblems;

import java.util.Scanner;

public class TrimFromEnds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        System.out.println(trimFromEnds(s1));
    }
    public static String trimFromEnds(String s1){
        StringBuilder sb=new StringBuilder(s1);
        int i=0, j;
        while(sb.length()>0 && sb.charAt(i)=='*')
        {
             sb.deleteCharAt(i);
        }
        j=sb.length()-1;
        while(sb.length()>0 && (sb.charAt(j)=='*')){
            sb.setLength(j);
            j--;
        }
        return sb.toString();
    }
}
