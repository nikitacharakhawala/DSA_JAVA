package javadsaintermediate.arrayproblems;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        int A[][]={{1,-2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        System.out.println(MinorDiagonalSum(A));

    }

    public static int MinorDiagonalSum(int[][] A){
        int sum=0, i=0, j=A[0].length-1;
        while(i<A.length && j>=0){
            System.out.println(i+" "+j);
            sum+=A[i][j];
            i++;
            j--;
        }
        return sum;
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
