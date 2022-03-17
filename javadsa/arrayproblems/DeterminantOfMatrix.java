package javadsa.arrayproblems;

import java.util.Scanner;

public class DeterminantOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[][] matrix=new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(findDeterminant(matrix));
    }

    public static int findDeterminant(Integer[][] matrix){
        int row=0,col=matrix.length-1, d1=1, d2=1;
        for(int i=0;i<matrix.length;i++){
            d1=d1*matrix[i][i];
        }
        while(row<matrix.length && col>=0){
            d2=d2*matrix[row][col];
            row++;
            col--;
        }
        return d1-d2;

    }
}
