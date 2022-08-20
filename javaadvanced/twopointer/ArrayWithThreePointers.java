package javaadvanced.twopointer;

public class ArrayWithThreePointers {
    public static void main(String[] args) {
        int[] A={1,4,10};
        int[] B={2,15,20};
        int[] C={10,12};
        System.out.println(getMinimimDiff(A,B,C));
    }

    public static int getMinimimDiff(int[] A, int[] B, int[] C){
        //Declared i,j,k pointers for respective A,B & C Array.
        int aPointer=0,bPointer=0,cPointer=0, absoluteMaximum=Integer.MAX_VALUE;
        while(aPointer<A.length && bPointer<B.length && cPointer<C.length){
            int diffOfThree= Math.abs(Math.max(A[aPointer], Math.max(B[bPointer], C[cPointer]))-Math.min(Math.min(A[aPointer], B[bPointer]), C[cPointer]));
            absoluteMaximum=Math.min(diffOfThree, absoluteMaximum);
            //Check the minimum value of three to increment the respective pointers.
            int min_Value=Math.min(Math.min(A[aPointer], B[bPointer]), C[cPointer]);
            if(min_Value==A[aPointer]){
                aPointer++;
            }else if(min_Value==B[bPointer]){
                bPointer++;
            }else{
                cPointer++;
            }
        }
        //return final absoluteMaximum Value.
        return absoluteMaximum;
    }
}
