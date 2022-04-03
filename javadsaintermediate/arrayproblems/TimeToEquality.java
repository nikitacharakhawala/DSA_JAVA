package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 *
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 * A = [2, 4, 1, 3, 2]
 * Output : 8
 *
 * Example Explanation
 *
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */

public class TimeToEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(2, 4, 1, 3, 2));
        TimeToEquality timeToEquality=new TimeToEquality();
        System.out.println(timeToEquality.noOfOperations(A));
    }

    public int noOfOperations(ArrayList<Integer> A){
        int sum=0, max=Integer.MIN_VALUE;
        for(Integer ele: A){
            sum+=ele;
            if(ele>max){
                max=ele;
            }
        }
        return A.size()*max-sum;
    }
}
