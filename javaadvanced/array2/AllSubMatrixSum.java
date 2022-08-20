package javaadvanced.array2;

public class AllSubMatrixSum {
    public static void main(String[] args) {
        int[][] A={{1,1},{1,1}};
        System.out.println(getSumOfAllSubMatrices(A));
    }

    public static int getSumOfAllSubMatrices(int[][] A){
        long sum=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                sum+=A[i][j]*((i+1)*(j+1)*(A.length-i)*(A[0].length-j));
            }
        }
        return (int)sum;
    }
}
