package javaadvanced.array1;

public class AbsoluteMaximum {
    public static void main(String[] args) {
        int[] A={1,3,-1};
        System.out.println(maximumAbsoluteSum(A));
    }

    public static int maximumAbsoluteSum(int[] A){
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            int val1=A[i]+(i+1);
            max1=Math.max(max1, val1);
            min1=Math.min(min1, val1);
            int val2=A[i]-(i+1);
            max2=Math.max(val2, max2);
            min2=Math.min(val2, min2);
        }

        return Math.max(max1-min1, max2-min2);

    }
}
