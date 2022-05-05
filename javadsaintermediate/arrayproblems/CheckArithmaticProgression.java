package javadsaintermediate.arrayproblems;

import java.util.Arrays;

public class CheckArithmaticProgression {
    public static void main(String[] args) {
        int[] A={2,4,1};
        System.out.println(checkArithmaticProgression(A));
    }

    public static int checkArithmaticProgression(int[] A){
        if(A.length>=2){
            int d=0;
            Arrays.sort(A);
            d=A[1]-A[0];

            for(int i=1; i<=A.length-2;i++){

                if((A[i+1]-A[i])!=d){
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }
}
