package javaadvanced.binarysearch;

public class SquareRoot {
    public static void main(String[] args) {
        int A=2147483647;
        System.out.println(findSquareRoot(A));
    }

    public static int findSquareRoot(int A){
        long left=0, right=A;
        long mid=0, ans=0;
        while(left<=right){
            mid=(left+right)/2;
            if(mid*mid==A){
                ans=mid;
               break;
            }else if(mid*mid<A){
                left=mid+1;
                ans=mid;
            }else{
                right=mid-1;
            }
        }
        return (int)ans;
    }


}
