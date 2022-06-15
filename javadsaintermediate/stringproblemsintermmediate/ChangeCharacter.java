package javadsaintermediate.stringproblemsintermmediate;

import java.util.*;

public class ChangeCharacter {
    public static void main(String[] args) {
        String A="umeaylnlfd";
        int B=1;
        System.out.println(ChangeCharacter(A,B));
    }

    public static int ChangeCharacter(String A, int B){
       int[] charArry=new int[26];
       int count=0, dist=0;
       if(B==0)
           return A.length();
       for(int i=0;i<A.length();i++){
           charArry[A.charAt(i)-'a']++;
           if(charArry[A.charAt(i)-'a']==1)
               dist++;

       }
        Arrays.sort(charArry);

       for(int i=0;i<charArry.length;i++){
           if(charArry[i]==0)
               continue;
           if(charArry[i]>B)
               break;
           dist--;
           B=B-charArry[i];

       }
       return dist;

    }
}
