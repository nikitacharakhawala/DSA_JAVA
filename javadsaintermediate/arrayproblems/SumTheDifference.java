package javadsaintermediate.arrayproblems;

public class SumTheDifference {
    public static void main(String[] args) {
        int[] A={1,2};
        System.out.println(findSumTheDifference(A));
    }

    public static int findSumTheDifference(int[] A){
        int sum=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0;i<Math.pow(2, A.length);i++){
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            for(int j=0;j<A.length;j++){
                if((i&(1<<j))!=0){
                    if(A[j]>max){
                        max=A[j];
                    }
                    if(A[j]<min){
                        min=A[j];
                    }
                }
            }
            if(min!=Integer.MAX_VALUE && max!=Integer.MIN_VALUE){
                sum=sum+(max-min);
            }

        }
        return sum;
    }
}
