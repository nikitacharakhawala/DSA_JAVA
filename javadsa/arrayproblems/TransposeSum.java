package javadsa.arrayproblems;

import java.util.Scanner;

public class TransposeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[][] m1=new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        findTransposeSum(m1);

    }

    public static void findTransposeSum(Integer[][] m){
        Integer[][] transpose=new Integer[m.length][m.length];
        Integer[][] sum=new Integer[m.length][m.length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                transpose[i][j]=m[j][i];
            }
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                sum[i][j]=m[i][j]+transpose[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void printMatrix(Integer[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
