package javadsa.stringproblems;

import java.util.Scanner;

public class StringAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(stringAddition(sc.next()));
        }
    }

    public static String stringAddition(String s){
        int i=0, j=s.length()-1;
        String add="";
       while(i<s.length() && j>=0){
           int diff=(s.charAt(i)-96)+(s.charAt(j)-96);
           if(diff>26) {
               diff = diff - 26;
           }
           add+=(char)(diff+96);
           i++;
           j--;
       }
        return add;
    }
}
