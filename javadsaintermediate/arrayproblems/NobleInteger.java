package javadsaintermediate.arrayproblems;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
        int[] A={  -5, -2, -3, 0, -6, 8, -10, -6, -8, -1, 6, -9, 0, -6, 2, 2, 2, 0, -5, -5, -8, 9, -10, -8, 8, 3, 8, 0, -6, 0, -1, -9, 9, 6, 2, 5, 4, -6, 9, -1, 3, 6, 0, 5, -10, -8, 9, -6, 3, -5, -9, -3, -6, 3, -9, 4, -4, 9, -6, -8, -8, -4, -6, -9, -8, -2, -2, -1 };
        System.out.println(countNobleInteger(A));
    }

    public static int countNobleInteger(int[] A){
       Arrays.sort(A);
       int less=A.length-1, ans=0;


       for(int i=0;i<A.length-1;i++){
           if(A[i]!=A[i+1]){
               less=A.length-i-1;
           }else{
               continue;
           }

           if(A[i]==less){
               ans++;
           }
       }

       if(A[A.length-1]==0){
           ans++;
       }
       return ans>0 ? 1 : -1;
    }
}
