package javadsa.stringproblems;

import java.util.Scanner;

public class FirstOccuranceOfWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(checkFIrstOccurance(s1,s2));

    }

    public static int checkFIrstOccurance(String A, String B){
        int index=A.indexOf(B);
        if(index==-1){
            return index;
        }else{
            return index+1;
        }
    }
}
