package javaadvanced.array2;

public class SpiralMatrix {
    public static void main(String[] args) {
        int A=3;
        int[][] spiralMatrix=getSpiralMatrix(A);
        printMatrix(spiralMatrix);
    }

    public static int[][] getSpiralMatrix(int A){
        int[][] spiralMatrix=new int[A][A];
        int s=0, e=0, N=A, count=1;
        if(A==1){
            spiralMatrix[0][0]=1;
            return spiralMatrix;
        }
        while(N>0){
            for(int k=0;k<N-1;k++){
                spiralMatrix[s][e]=count;
                count++;
                e++;
            }
            for(int k=0;k<N-1;k++){
                spiralMatrix[s][e]=count;
                count++;
                s++;
            }
            for(int k=0;k<N-1;k++){
                spiralMatrix[s][e]=count;
                count++;
                e--;
            }
            for(int k=0;k<N-1;k++){
                spiralMatrix[s][e]=count;
                count++;
                s--;
            }
            s++;
            e++;
            N=N-2;
        }
        if(A%2!=0){
            spiralMatrix[A/2][A/2]=count;
        }
        return spiralMatrix;
    }

    public static void printMatrix(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
