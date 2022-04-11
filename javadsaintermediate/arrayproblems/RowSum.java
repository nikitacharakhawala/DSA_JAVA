package javadsaintermediate.arrayproblems;

public class RowSum {
    public static void main(String[] args) {
        int N=3, count=1;
        int[][] diagonal=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                diagonal[i][j]=count;
                count++;
            }
        }
       int[] ans=getRowSum(diagonal);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }

    public static int[] getRowSum(final int[][] A) {
        int[] ans=new int[A.length];
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum=0;
            for(int j=0; j<A[0].length;j++){
                sum+=A[i][j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}
