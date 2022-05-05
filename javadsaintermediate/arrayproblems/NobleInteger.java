package javadsaintermediate.arrayproblems;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
        int[] A={ -1, -2, 0, 0, 0, -3};
        System.out.println(countNobleInteger(A));
    }

    public static int countNobleInteger(int[] A){
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int less=A.length-1, ans=0;
        if(A[0]==A.length-1){
            ans++;
        }
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[i-1]){
                less=A.length-i-1;
            }
            if(A[i]==less){

                ans++;
            }
        }
        return ans;
    }
}
