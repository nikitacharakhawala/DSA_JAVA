package javaadvanced.twopointer;

import java.util.Arrays;

public class SumClosestToB {
    public static void main(String[] args) {
        int[] A={-5, 1, -7, -1, -10, 7, -4, 1, -8, -1 };
        int B=4;
        System.out.println(closestSumToB(A,B));
    }

    public static int closestSumToB(int[] A, int B){
        Arrays.sort(A);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            int x=i+1, y=A.length-1;
            while(x<y){
                int sum=A[i]+A[x]+A[y];
                if(sum==B) {
                    return sum;
                }else if(Math.abs(B-sum)<Math.abs(B-ans)) {
                   ans=sum;
                }
                if(sum>B)
                    y--;
                else
                    x++;
            }
        }
        return ans;
    }
}
