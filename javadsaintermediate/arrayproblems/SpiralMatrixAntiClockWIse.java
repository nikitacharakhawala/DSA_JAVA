package javadsaintermediate.arrayproblems;

public class SpiralMatrixAntiClockWIse {
    public static void main(String[] args) {
        int A=8;
        //printMatrix(findSpiral(A));
    }

    public static Integer[][] findSpiral(int A) {
        return null;
    }

    public static void printMatrix(Integer[][] A) {
        for(int i=0;i<A[0].length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
