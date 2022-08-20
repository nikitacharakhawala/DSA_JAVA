package javaadvanced.binarysearch;

public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] A={1,3,5,6};
        int B=4;
        System.out.println(getSortedInsertPosition(A, B));
    }

    public static int getSortedInsertPosition(int[] A, int B){
            int i=0,j=A.length-1;
            while(i<=j){
                int mid=(i+j)/2;
                if(A[mid]==B){
                    return mid;
                }
                else if(A[mid]<B){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
            return j+1;
    }
}
