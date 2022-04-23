package javadsaintermediate.arrayproblems;

public class InterestingArray {
    public static void main(String[] args) {
        int A[]={9, 1};
        System.out.println(getInterestingArray(A));
    }

    public static String getInterestingArray(int[] A){
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                count++;
            }
        }
        if(count%2==0){
            return "Yes";
        }else{
            return "No";
        }
    }
}
