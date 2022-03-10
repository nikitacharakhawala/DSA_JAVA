package javadsa.stringproblems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CountVowelConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(countVowelConsonants(s));
    }

    public static ArrayList<Integer> countVowelConsonants(String s){
        ArrayList<Integer> count=new ArrayList<>();
        count.add(0, 0);
        count.add(1, 0);
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='e' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='E' || s.charAt(i)=='U'){
                count.set(0, count.get(0)+1);
            }else{
                count.set(1, count.get(1)+1);
            }
            i++;
        }
        return count;
    }
}
