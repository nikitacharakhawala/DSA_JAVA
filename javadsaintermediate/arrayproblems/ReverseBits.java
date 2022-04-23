package javadsaintermediate.arrayproblems;

/**
 * Reverse the bits of an 32 bit unsigned integer A.
 *
 *
 *
 * Problem Constraints
 *
 * 0 <= A <= 232
 *
 *
 *
 * Input Format
 *
 * First and only argument of input contains an integer A.
 *
 *
 *
 * Output Format
 *
 * Return a single unsigned integer denoting the decimal value of reversed bits.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  0
 *
 * Input 2:
 *
 *  3
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  0
 *
 * Output 2:
 *
 *  3221225472
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *         00000000000000000000000000000000
 * =>      00000000000000000000000000000000
 *
 * Explanation 2:
 *
 *         00000000000000000000000000000011
 * =>      11000000000000000000000000000000
 */

public class ReverseBits {
    public static void main(String[] args) {
        int n=3;
//        System.out.println(getReversedBit(n));
        int[] A=new int[Integer.MAX_VALUE+10];
        int x=A.length;
        System.out.println(x);
    }

    public static long getReversedBit(int a){
        int[] A=new int[3200000];
        int n=A.length;
        int p= Integer.SIZE-1;
        int answer=0;
        while(p>=0 && a>0){

            if((a&1)!=0){
                answer= answer | (1<<p);
            }
            p--;
            a=a>>1;
        }
        return (long) Integer.toUnsignedLong(answer);
    }



}
