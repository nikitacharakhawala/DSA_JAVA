package javaadvanced.modulararithmatic;

/**
 * Q1. Compute nCr % m
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.
 *
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 *
 *
 *
 * Problem Constraints
 * 1 <= A * B <= 106
 *
 * 1 <= B <= A
 *
 * 1 <= C <= 106
 *
 *
 *
 * Input Format
 * The first argument given is integer A ( = n).
 * The second argument given is integer B ( = r).
 * The third argument given is integer C ( = m).
 *
 *
 * Output Format
 * Return the value of nCr % m.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 5
 *  B = 2
 *  C = 13
 * Input 2:
 *
 *  A = 6
 *  B = 2
 *  C = 13
 *
 *
 * Example Output
 * Output 1:
 *
 *  10
 * Output 2:
 *
 *  2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The value of 5C2 % 11 is 10.
 * Explanation 2:
 *
 *  The value of 6C2 % 13 is 2.
 */
public class NCRMod {
    public static void main(String[] args) {
        int A=5, B=2, C=13;
        System.out.println(getNCRMod(A, B,C));
    }

    public static int getNCRMod(int A, int B, int C){
        int[][] D=new int[A+1][B+1];
        for(int i=0;i<=A;i++){
            for(int j=0;j<=Math.min(i,B);j++){
                if(j==0 || i==j){

                    D[i][j]=1;
                }else{

                    D[i][j]=((D[i-1][j-1]%C)+(D[i-1][j]%C))%C;
                }
            }
        }
        return D[A][B];
    }


}
