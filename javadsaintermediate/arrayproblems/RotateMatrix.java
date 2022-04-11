package javadsaintermediate.arrayproblems;

public class RotateMatrix {
    public static void main(String[] args) {
        int A[][]={{1,2}, {3,4}};
        int B[]=new int[A[0].length];
        int j, k, temp;
        printMatrix(A);
        A=inplaceArrayRowReverse(A);
        printMatrix(A);

        printMatrix(inplaceTranspose(A));
    }

  public static int[][] inplaceTranspose(int[][] A){
        int temp;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A[0].length;j++){
               temp=A[i][j];
               A[i][j]=A[j][i];
               A[j][i]=temp;
            }
        }
        return A;
  }

    public static int[][] inplaceArrayRowReverse(int[][] A){
        int j, k, temp;
        for(int i=0;i<A.length;i++){
            j=A.length-1;
            k=0;
            while(k<=j){
                temp=A[k][i];
                A[k][i]=A[j][i];
                A[j][i]=temp;
                j--;
                k++;
            }
        }
        return A;
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
