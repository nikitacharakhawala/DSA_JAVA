package javadsa.arrayproblems;

public class LongestSubSeqOne {
    public static void main(String[] args) {
        int[] A={0,1,1,1,0,1,1,0,1,1,0};
        int left=0, right=0, ans=Integer.MIN_VALUE;
        for(int j=1;j<A.length-1;j++){
            left=0;
            right=0;
            if(A[j]==0){
                for(int i=j-1;i>=0;i--){
                    if(A[i]==1){
                        left++;
                    }else{
                        break;
                    }
                }
                for(int k=j+1;k<A.length;k++){
                    if(A[k]==1){
                        right++;
                    }else{
                        break;
                    }
                }
                ans=Math.max(ans, left+right+1);
            }
        }
        System.out.println(ans);
    }
}
