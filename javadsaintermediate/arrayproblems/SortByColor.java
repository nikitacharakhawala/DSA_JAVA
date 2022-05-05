package javadsaintermediate.arrayproblems;

public class SortByColor {
    public static void main(String[] args) {
        int[] A={0,1,2,0,1,2};
        sortColor(A);
    }

    public static void sortColor(int[] A){
        int start=0, end=A.length-1, index=0;
        while(index <= end && start<end){
            if(A[index]==0){
                A[index]=A[start];
                A[start]=0;
                start++;
                index++;
            }else if(A[index]==2){
                A[index]=A[end];
                A[end]=2;
                end--;
            }else{
                index++;
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
