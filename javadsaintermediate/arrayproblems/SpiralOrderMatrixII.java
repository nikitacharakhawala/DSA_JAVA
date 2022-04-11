package javadsaintermediate.arrayproblems;

import java.util.ArrayList;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        int A=8;
        printMatrix(findSpiral(A));
    }

    public static Integer[][] findSpiral(int A) {

        double n=Math.pow(A, 2)/A;
        Integer[][] spiral=new Integer[(int)n][(int)n];
        //For print the Numbers
        int count=1, top=0, right= (int) (n-1), left=0, bottom=(int)n-1, dir=1;
        while(top<=bottom && left<=right){
            if (dir == 1) {
                for(int i=left ;i<=right;i++){
                    spiral[top][i]=count;
                    count++;
                }
                top++;
                dir=2;

            }
            if(dir==2){
                for(int i=top; i<=bottom;i++){
                    spiral[i][right]=count;
                    count++;
                }
                right--;
                dir=3;

            }
            if(dir==3){
                for(int i=right; i>=left;i--){
                    spiral[bottom][i]=count;
                    count++;
                }
                bottom--;
                dir=4;

            }
            if(dir==4){
                for(int i=bottom; i>=top;i--){
                    spiral[i][left]=count;
                    count++;
                }
                left++;
                dir=1;
            }
        }
        return spiral;


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
