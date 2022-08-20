package javaadvanced.bitmanipulation;

public class NumberOfOneBit {
    public static void main(String[] args) {
        int A=11;
        System.out.println(findNumberOfOneBits(A));
    }

    public static int findNumberOfOneBits(int A){
        int count=0;
        for(int i=0;i<32;i++){
            if(isSetBit(A, i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isSetBit(int num, int position){
        if((num & (1<<position))!=0){
            return true;
        }
        return false;
    }
}
