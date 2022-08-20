package javaadvanced.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {
        int[] A={3,30,34,5,9};
        System.out.println(getLargestNumber(A));
    }

    public static int getLargestNumber(int[] A){
        String[] strLen=new String[A.length];
        for(int i=0;i<A.length;i++){
            strLen[i]=String.valueOf(A[i]);
        }
        Arrays.sort(strLen, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String x=o1+o2;
                String y=o2+o1;
                return y.compareTo(x);
            }
        });
        String ans="";
        boolean isZero=true;
        for(String s : strLen){
           if(!s.equals("0"))
               isZero=false;
            ans+=s;
        }
        return isZero ? 0 :Integer.parseInt(ans);
    }
}
