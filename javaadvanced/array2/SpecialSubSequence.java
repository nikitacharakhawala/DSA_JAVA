package javaadvanced.array2;

public class SpecialSubSequence {
    public static void main(String[] args) {
        String s="ABCGAG";
        System.out.println(getSubSequenceCount(s));
    }

    public static int getSubSequenceCount(String A){
        long a_count=0, ans=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='A'){
                a_count++;
            }
            if(A.charAt(i)=='G'){
                ans=ans+a_count;
            }
        }
        return (int)(ans%(Math.pow(10,9)+7));
    }
}
