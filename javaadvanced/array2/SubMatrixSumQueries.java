package javaadvanced.array2;

import java.util.Arrays;

public class SubMatrixSumQueries {
    public static void main(String[] args) {
        int[][] A={{5, 17, 100, 11}, {0, 0, 2, 8}};
        int[] B={1, 1};
        int[] C={1, 4};
        int[] D={2, 2};
        int[] E={2, 4};
        System.out.println(Arrays.toString(getSumMatrixQueries(A,B,C,D,E)));
    }

    public static int[] getSumMatrixQueries(int[][] A, int[] B, int[] C, int[] D, int[] E){
        long[][] prefixMatrix=getPrefixSumMatrix(A);
        int[] answer=new int[B.length];
        //printMatrix(prefixMatrix);
        long sum=0;
        for(int i=0;i<B.length;i++){
            int r1=B[i]-1, c1=C[i]-1, r2=D[i]-1, c2=E[i]-1;
            System.out.println(r1+" "+c1);
            System.out.println(r2+" "+c2);
            if(r1==0 && c1==0){
                sum=prefixMatrix[r2][c2];
            }else if(r1==0 && c1!=0){
                sum=prefixMatrix[r2][c2]-prefixMatrix[r2][c1-1];
            }else if(r1!=0 && c1==0){
                sum=prefixMatrix[r2][c2]-prefixMatrix[r1-1][c2];
            }
            else{
                sum=prefixMatrix[r2][c2]-prefixMatrix[r1-1][c2]-prefixMatrix[r2][c1-1]+prefixMatrix[r1-1][c1-1];
            }
            int mod=1000000007;
            while(sum<0){
                sum+=mod;
            }
            sum=(long)(sum%(Math.pow(10,9)+7));
            answer[i]=(int)sum;
        }
        return answer;

    }

    public static long[][] getPrefixSumMatrix(int[][] A){
        long[][] prefixMatrix=new long[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(j==0){
                    prefixMatrix[i][j]=A[i][j];
                }else{
                    prefixMatrix[i][j]=prefixMatrix[i][j-1]+A[i][j];
                }
            }
        }

        for(int i=0;i<prefixMatrix[0].length;i++){
            for(int j=0;j<prefixMatrix.length;j++){
                if(j!=0){
                    prefixMatrix[j][i]=prefixMatrix[j-1][i]+prefixMatrix[j][i];
                }

            }
        }
        return prefixMatrix;
    }

    public static void printMatrix(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
