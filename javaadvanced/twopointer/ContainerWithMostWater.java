package javaadvanced.twopointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] A={1,5,4,3};
        System.out.println(getMostArea(A));
    }

    public static int getMostArea(int[] A){
        if(A.length==1)
            return 0;
        int i=0,j=A.length-1, ans=Integer.MIN_VALUE;
        while(i<j && j<A.length){
            int area=Math.min(A[i], A[j])*(j-i);
            ans=Math.max(ans,area);
            if(A[i]<A[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
