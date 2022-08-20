package javaadvanced.bitmanipulation;

import java.util.Arrays;

public class ThriceSingleNumber {
    public static void main(String[] args) {
        int[] A={1,2,4,3,3,2,2,3,1,1};
        System.out.println(findUniqueNumbers(A));
    }

    public static int findUniqueNumbers(int[] A){
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<A.length;j++){
                if(checkSetBit(A[j], i)){
                    count++;
                }
            }
            if(count%3!=0){
                ans=ans|(1<<i);
            }
        }
        return ans;
    }

    public static boolean checkSetBit(int num, int position){
        if((num & (1<<position))!=0){
            return true;
        }
        return false;
    }
}
