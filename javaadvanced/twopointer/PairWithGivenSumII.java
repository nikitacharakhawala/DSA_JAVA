package javaadvanced.twopointer;

public class PairWithGivenSumII {
    public static void main(String[] args) {
        int[] A={2, 2, 3, 4, 4, 5, 6, 7, 10};
        int B=8;
        System.out.println(getPairSumWith(A,B));
    }

    public static int getPairSumWith(int[] A, int B) {
        int r=A.length-1, l=0, answer=0;
        int mod=1000000007;
        while(l<r){
            int sum=A[l]+A[r];
            if(sum==B){
                int prev=r, count=0;
                while(prev>l && A[r]==A[prev]){
                    count++;
                    prev--;
                }
                answer=(answer+count)%mod;
                l++;
            }else if(sum<B){
                l++;
            }else{
                r--;
            }
        }
        return answer;
    }


}
