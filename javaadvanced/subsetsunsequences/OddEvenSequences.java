package javaadvanced.subsetsunsequences;

public class OddEvenSequences {
    public static void main(String[] args) {
        int[] A={1,2,2,5,6};
        System.out.println(getMaxOddEvenSequences(A));
    }

    public static int getMaxOddEvenSequences(int[] A){
        int oddEvenSequenceCount=0;
        boolean even=true, odd=true;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                if(even){
                    oddEvenSequenceCount++;
                    odd=true;
                    even=false;
                }
            }else{
                if(odd){
                    oddEvenSequenceCount++;
                    odd=false;
                    even=true;
                }
            }
        }
        return oddEvenSequenceCount;
    }
}
