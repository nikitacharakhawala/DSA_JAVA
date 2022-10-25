package javaadvanced.array3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] A={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(A));
    }

    public static int trap(int[] A){
        int[] leftMax=new int[A.length];
        int[] rightMax=new int[A.length];
        int sum=0;
        int rightMaxVal=Integer.MIN_VALUE, leftMaxVal=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
           if(A[i]>leftMaxVal){
               leftMaxVal=A[i];
           }
           leftMax[i]=leftMaxVal;

        }


        for(int i=A.length-1;i>=0;i--){
            if(A[i]>rightMaxVal){
                rightMaxVal=A[i];
            }
            rightMax[i]=rightMaxVal;
        }


        for(int i=0;i<A.length;i++){
            int diff=(Math.min(rightMax[i], leftMax[i])-A[i]);
            if(diff>0){
                sum+=diff;
            }
        }
        return sum;
    }
}
