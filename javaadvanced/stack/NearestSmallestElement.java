package javaadvanced.stack;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
        int[] A={ 39, 27, 11, 4, 24, 32, 32, 1};
        System.out.println(Arrays.toString(getNearestSmallestElement(A)));
    }

    public static int[] getNearestSmallestElement(int[] A){
        Stack<Integer> indexStack=new Stack<>();
        int[] answer=new int[A.length];
        indexStack.push(0);
        answer[0]=-1;
        for(int i=1;i<A.length;i++){
            if(!indexStack.isEmpty() && A[indexStack.peek()]<A[i]){
                answer[i]=A[indexStack.peek()];

            }else if(!indexStack.isEmpty() && A[indexStack.peek()]>=A[i]){
                while(!indexStack.isEmpty() && A[indexStack.peek()]>=A[i]){
                    indexStack.pop();
                }
                if(indexStack.isEmpty()){
                    answer[i]=-1;
                }else{
                    answer[i]=A[indexStack.peek()];
                }
            }
            else{
                answer[i]=-1;
            }
            indexStack.push(i);
            //System.out.println(indexStack);
        }
        return answer;
    }
}
