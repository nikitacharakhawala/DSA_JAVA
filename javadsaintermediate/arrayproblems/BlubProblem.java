package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
Problem Description

        N light bulbs are connected by a wire.

        Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

        Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

        You can press the same switch multiple times.

        Note: 0 represents the bulb is off and 1 represents the bulb is on.



        Problem Constraints

        1 <= N <= 5*105
        0 <= A[i] <= 1


        Input Format

        The first and the only argument contains an integer array A, of size N.


        Output Format

        Return an integer representing the minimum number of switches required.


        Example Input

        Input 1:

        A = [0, 1, 0, 1]

        Input 2:

        A = [1, 1, 1, 1]



        Example Output

        Output 1:

        4

        Output 2:

        0



        Example Explanation

        Explanation 1:

        press switch 0 : [1 0 1 0]
        press switch 1 : [1 1 0 1]
        press switch 2 : [1 1 1 0]
        press switch 3 : [1 1 1 1]

        Explanation 2:

        There is no need to turn any switches as all the bulbs are already on.
**/
public class BlubProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> blub=new ArrayList<>(Arrays.asList(0, 1, 0, 1));
        BlubProblem blubProblem=new BlubProblem();
        System.out.println(blubProblem.blubCount(blub));

    }

    public int blubCount(ArrayList<Integer> A){
        int count=0, press=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==1 && count%2==0){
                continue;
            }
            else if(A.get(i)==0 && count%2!=0){
                continue;
            }
            else if(A.get(i)==1 && count%2!=0){
                press++;
                count++;
            }else if(A.get(i)==0 && count%2==0){
                press++;
                count++;
            }
        }
        return press;
    }
}
