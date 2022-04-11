package javadsaintermediate.arrayproblems;

import java.util.HashSet;

public class RowsToColumnZero {
    public static void main(String[] args) {
        int A[][]={{1,2, 3, 4}, {5,6,7,0}, {9,2,0,4}};
        printMatrix(rowToColZero(A));
    }


    public static int[][] rowToColZero(int[][] A){
        int[][] answer=new int[A.length][A[0].length];
        HashSet<Integer> rowsZero=new HashSet();
        HashSet<Integer> colsZero=new HashSet<>();

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==0){
                    rowsZero.add(i);
                    colsZero.add(j);
                }
            }
        }

        for(Integer row: rowsZero){
            System.out.println(row);
        }

        for(Integer cols: colsZero){
            System.out.println(cols);
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(rowsZero.contains(i)){
                    answer[i][j]=0;
                }
                if(colsZero.contains(j)){
                    answer[i][j]=0;
                }
                if(!rowsZero.contains(i) && !colsZero.contains(j)){
                    answer[i][j]=A[i][j];
                }
            }
        }


        return answer;
    }

    public static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
