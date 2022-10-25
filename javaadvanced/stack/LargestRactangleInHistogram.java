package javaadvanced.stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestRactangleInHistogram {
    public static void main(String[] args) {
        int[] A={ 6, 57, 59, 57, 35, 36, 88, 28, 47, 77, 20, 97, 80, 90, 5, 49, 47 };
        System.out.println(largestRactangleInHistogram(A));
    }

    public static int largestRactangleInHistogram(int[] A) {
        Stack<Integer> histogramStack=new Stack<>();
        int[] p1=new int[A.length];
        int[] p2=new int[A.length];
        int largestHistogram=Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++){
           while(!histogramStack.isEmpty() && A[i]<=A[histogramStack.peek()]){
               histogramStack.pop();
           }
           if(!histogramStack.isEmpty()){
               p1[i]=histogramStack.peek();
           }else{
               p1[i]=-1;
           }
           histogramStack.push(i);
        }
       System.out.println(Arrays.toString(p1));

        histogramStack.clear();
        for(int i=A.length-1;i>=0;i--){
            while(!histogramStack.isEmpty() && A[i]<=A[histogramStack.peek()]){
                histogramStack.pop();
            }
            if(!histogramStack.isEmpty()){
                p2[i]=histogramStack.peek();
            }else{
                p2[i]=A.length;
            }
            histogramStack.push(i);
        }
        System.out.println(Arrays.toString(p2));
        for(int i=0;i<A.length;i++){
            largestHistogram=Math.max(largestHistogram, Math.abs(p2[i]-p1[i]-1)*A[i]);
        }
        return largestHistogram;
    }
}
