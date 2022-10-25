package javaadvanced.stringpatternmatching;

import java.util.Arrays;

public class CyclicPermutations {
    public static void main(String[] args) {
        String A="1101111111";
        String B="1101111111";
        System.out.println(cyclicPermutations(A,B));
    }

    public static int cyclicPermutations(String A, String B){
        String mergedString=A+"$"+B+B.substring(0, B.length()-1);
        //System.out.println(mergedString);
        int n=mergedString.length(), count=0;
        int[] LPS=new int[n];
        LPS[0]=0;
        for(int i=1;i<n;i++){
            int x=LPS[i-1];
            while(mergedString.charAt(i)!=mergedString.charAt(x)){
                if(x==0){
                    x=-1;
                    break;
                }
                x=LPS[x-1];
            }
            LPS[i]=x+1;
        }
        for(int i=0;i<LPS.length;i++){
            if(LPS[i]==A.length()){
                count++;
            }
        }
        return count;
    }


}
