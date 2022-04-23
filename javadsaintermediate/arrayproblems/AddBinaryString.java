package javadsaintermediate.arrayproblems;

/**
 * Problem Description
 * Given two binary strings, return their sum (also a binary string).
 *
 * Example:
 *
 * a = "100"
 *
 * b = "11"
 * Return a + b = "111".
 */

public class AddBinaryString {
    public static void main(String[] args) {
        String A="1011";
        String B="1111";
        System.out.println(addBinaryString(A, B));
    }

    public static String addBinaryString(String A, String B){
        StringBuilder sb=new StringBuilder();
        int i=A.length()-1, j=B.length()-1, s=0;
        while(i>=0 || j>=0 || s==1){
            if(i>=0){
                s+=A.charAt(i)-'0';
            }else{
                s+=0;
            }
            if(j>=0){
                s+=B.charAt(j)-'0';
            }else{
                s+=0;
            }
            sb.append((char)(s%2+'0'));
            s/=2;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
