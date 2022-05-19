package javadsaintermediate.arrayproblems;

public class RepeatingAndMissingElement {
    public static void main(String[] args) {
        int[] A={3,1,2,5,3};
        int[] ans= findRepeatAndMissing(A);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] findRepeatAndMissing(int[] A){
        int[] ans=new int[2];
        for(int i=0;i<A.length;i++){
            int abs=Math.abs(A[i]);
            if(A[abs-1]>0){
                A[abs-1]=-A[abs-1];
            }else{
                ans[0]=abs;
            }
        }

        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}
