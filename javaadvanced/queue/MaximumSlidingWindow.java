package javaadvanced.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumSlidingWindow {
    public static void main(String[] args) {
        int[] A={10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int B=2;
        System.out.println(Arrays.toString(getMaximumWindow(A,B)));
        ArrayList<Integer> l=new ArrayList<>();

    }

    public static int[] getMaximumWindow(int[] A, int B){
        Deque<Integer> q=new LinkedList<>();
        int[] maxWindow=new int[A.length-B+1];
        int index=0;
        for(int i=0;i<B;i++){
            while(!q.isEmpty() && A[i]>=A[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
       // System.out.println(Arrays.toString(maxWindow)+":::"+q);

        for(int i=B;i<A.length;i++){
            maxWindow[index]=A[q.peekFirst()];
            index++;
            while(!q.isEmpty() && q.peekFirst()<=i-B){
                q.removeFirst();
            }
            while(!q.isEmpty() && A[q.peekLast()]<=A[i]){
                q.removeLast();
            }
            q.addLast(i);
        }
        maxWindow[index]=A[q.removeFirst()];
        return maxWindow;
    }
}
