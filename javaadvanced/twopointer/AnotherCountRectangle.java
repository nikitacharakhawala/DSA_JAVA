package javaadvanced.twopointer;

public class AnotherCountRectangle {
    public static void main(String[] args) {
        int[] A={1,2};
        int B=5;
        System.out.println(getRectangleCount(A,B));
    }

    public static int getRectangleCount(int[] A, int B){
        int left=0,right=A.length-1;
        int count=0;
        while(left<A.length && right>=0){
            long area=(long)A[left]*(long)A[right];
            if(area<B){
                count=(int)((count+right+1)%(Math.pow(10,9)+7));
                left++;
            }else{
                right--;
            }
        }
        return (int)(count%(Math.pow(10,9)+7));
    }
}
