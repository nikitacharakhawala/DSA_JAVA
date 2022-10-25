package leetcode.binarysearch;

public class Sqrt {
    public static void main(String[] args) {
        int n=6;
        System.out.println(sqrt(n));
    }

    public static int sqrt(int n){
        int start=0, end=n;
        int mid=0, sqrt=0;
        if(n==1)
            return 1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid<n){
                if((mid*mid)>sqrt){
                    sqrt=mid;
                }
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return sqrt;
    }
}
