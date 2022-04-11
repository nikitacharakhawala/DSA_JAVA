package javadsaintermediate.arrayproblems;

public class AntiDiagonal {
    public static void main(String[] args) {
        int N=3, count=1;
        int[][] diagonal={{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                diagonal[i][j]=count;
                count++;
            }
        }
        printMatrix(findDiagonal(diagonal));
    }

    public static int[][] findDiagonal(int[][] A) {
        int[][] answer=new int[(2*A.length)-1][A.length];
        int a=0, b=0;
       for(int i=0;i<A[0].length;i++){
           int x=0;
           int y=i;
           while(x<A.length && y>=0) {
               System.out.println(a+"| "+b);
               answer[a][b] = A[x][y];
               x++;
               y--;
               b++;
           }
           a++;
           b=0;
       }

       for(int i=1;i<A[0].length;i++){
           int x=i;
           int y=A.length-1;

           while(x<A.length && y>=0){
               answer[a][b]=A[x][y];
               x++;
               y--;
               b++;
           }
           a++;
           b=0;

       }
       return answer;
    }

    public static void printMatrix(int[][] A){
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
