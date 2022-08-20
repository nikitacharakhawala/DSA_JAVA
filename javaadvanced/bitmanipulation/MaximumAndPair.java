package javaadvanced.bitmanipulation;

public class MaximumAndPair {
    public static void main(String[] args) {
        int[] A={53, 39, 88};
        System.out.println(findMaxAnd(A));
    }

    public static int findMaxAnd(int[] A){
        int ans=0;
        for(int i=30;i>=0;i--){
           int count=0;
           for(int j=0;j<A.length;j++){
               if(checkSetBit(A[j],i))
                   count++;
           }
           if(count>=2){
               for(int k=0;k<A.length;k++){
                   if(!checkSetBit(A[k], i))
                       A[k]=0;
               }
               ans=ans|(1<<i);
           }
        }
        return ans;
    }

    public static boolean checkSetBit(int num, int position){
        if((num & (1<<position))>0) {
            return true;
        }
        return false;
    }
}
