package javaadvanced.bitmanipulation;

public class DifferentBitPairSumWise {
    public static void main(String[] args) {
        int[] A={1,3,5};
        System.out.println(getDifferentBitPairSum(A));
    }

    public static int getDifferentBitPairSum(int[] A){

        long mod=1000000007, total=0;
        for(int i=0;i<32;i++){
            int setBits=0;
            for(int j=0;j<A.length;j++){
                if((A[j]&(1<<i))>0){
                    setBits++;
                }
            }
            total+=(2*setBits)*(A.length-(long)setBits);
            total=total%mod;
        }
        return (int)total;
    }
}
