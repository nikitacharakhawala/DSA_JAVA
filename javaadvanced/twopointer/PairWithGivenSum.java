package javaadvanced.twopointer;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int B=5;
        System.out.println(countPairWithGivenSum(A,B));
    }

    public static int countPairWithGivenSum(int[] A, int B){
        int i=0, j=A.length-1, count=0;
        while(i<j){
            int ans=A[i]+A[j];
            if(ans==B){
                count++;
                j--;
            }else if(ans<B){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}
