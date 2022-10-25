package javaadvanced.queue;

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        int A=9;
        System.out.println(getPerfectNumber(A));
    }

    public static int getPerfectNumber(int A){
        Queue<String> q=new LinkedList<>();
        q.add("11");
        q.add("22");

        int count=0;
        while(count<A-1){
            String t=q.remove();
            q.add(t.substring(0,t.length()/2)+"11"+t.substring(t.length()/2, t.length()));
            q.add(t.substring(0,t.length()/2)+"22"+t.substring(t.length()/2,t.length()));
            count++;
        }
        return Integer.valueOf(q.remove());
    }
}
