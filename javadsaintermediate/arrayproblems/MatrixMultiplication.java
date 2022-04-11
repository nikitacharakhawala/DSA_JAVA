package javadsaintermediate.arrayproblems;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][]={{1,2,}, {3,4}};
        int B[][]={{1,2,3}, {4,5,6}};
        printMatrix(A);
        printMatrix(B);
        printMatrix(matrixMultiplication(A, B));
    }

    public static int[][] matrixMultiplication(int[][] A, int[][] B){
        int[][] answer=new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                for(int k=0;k<B.length;k++){
                    answer[i][j]+=A[i][k]*B[k][j];
                }
                System.out.println();
            }
            System.out.println();
        }
        return answer;
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
