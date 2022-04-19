package javadsaintermediate.arrayproblems;

import java.util.Arrays;

public class ChristmasTree {
    public static void main(String[] args) {
        int[] A={5, 9, 10, 4, 7, 8};
        int[] B={5, 6, 4, 7, 2, 5};

        System.out.println(christmasTree(A, B));
    }

    public static int christmasTree(int[] A, int[] B){
       int answer=Integer.MAX_VALUE, minBi=0, maxBj=0, cost=0;
        for(int j=1;j<A.length-1;j++) {
            cost=0;
            minBi=Integer.MAX_VALUE;
            maxBj=Integer.MAX_VALUE;
            for (int i = 0; i < j; i++) {
                if (A[i] < A[j])
                    minBi = Math.min(minBi, B[i]);
            }
            for (int k = j + 1; k < A.length; k++) {
                if (A[j] < A[k])
                    maxBj = Math.min(maxBj, B[k]);
            }
            System.out.println(minBi+" ::: "+B[j]+" ::: "+maxBj);
            if(minBi!=Integer.MAX_VALUE && maxBj!=Integer.MAX_VALUE){
                cost=minBi+B[j]+maxBj;
                answer=Math.min(answer, cost);
            }
        }
        return answer!=Integer.MAX_VALUE ? answer : -1;
    }


}
