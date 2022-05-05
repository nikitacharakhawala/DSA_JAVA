package javadsaintermediate.mathproblems;

/**
 * Problem Description
 * You are given a number A in the form of a string. Check if the number is divisible by eight or not.
 *
 * Return 1 if it is divisible by eight else, return 0.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the String <= 100000
 * '0' <= A[i] <= '9'
 *
 *
 *
 * Input Format
 * The only argument given is a string A.
 *
 *
 *
 * Output Format
 * Return 1 if it is divisible by eight else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = "16"
 *
 * Input 2:
 *
 * A = "123"
 */
public class DivideByEight {
    public static void main(String[] args) {
        String A="9216";
        System.out.println(checkDivideByEight(A));

    }
    public static int checkDivideByEight(String A){
        int num=0;
//        System.out.println(A.substring(A.length()-3, A.length()));
        if(A.length()>=3){
            num=Integer.parseInt(A.substring(A.length()-3));
        }else{
            num=Integer.parseInt(A);
        }
        return num%8==0 ? 1 : 0;
    }
}
