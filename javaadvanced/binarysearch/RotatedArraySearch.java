package javaadvanced.binarysearch;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] A={1, 7, 67, 133, 178};
        int B=1;
        System.out.println(getRotatedArraySearch(A, B));
    }

    public static int getRotatedArraySearch(int[] A, int B){
        int left=0, right=A.length-1, pivot=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(A[mid]>=A[0]){
                left=mid+1;
            }else{
                pivot=mid;
                right=mid-1;
            }
        }
       if(pivot==-1)
           pivot=A.length;
        left=0;
        right=pivot-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(A[mid]==B){
                return mid;
            }else if(A[mid]<B){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        left=pivot;
        right=A.length-1;
        System.out.println(pivot);
        while(left<=right){
            System.out.println(left+":::"+right);
            int mid=left+(right-left)/2;
            if(A[mid]==B){
                return mid;
            }else if(A[mid]<B){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;

    }
}
