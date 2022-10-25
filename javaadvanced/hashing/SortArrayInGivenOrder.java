package javaadvanced.hashing;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Q1. Sort Array in given Order
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Given two arrays of integers A and B, Sort A in such a way that the relative order among the elements will be the same as those are in B.
 * For the elements not present in B, append them at last in sorted order.
 *
 * Return the array A after sorting from the above method.
 *
 * NOTE: Elements of B are unique.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array A <= 100000
 *
 * 1 <= length of the array B <= 100000
 *
 * -10^9 <= A[i] <= 10^9
 *
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 *
 * The second argument given is the integer array B.
 *
 *
 *
 * Output Format
 * Return the array A after sorting as described.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 2, 3, 4, 5]
 * B = [5, 4, 2]
 * Input 2:
 *
 * A = [5, 17, 100, 11]
 * B = [1, 100]
 *
 *
 * Example Output
 * Output 1:
 *
 * [5, 4, 2, 1, 3]
 * Output 2:
 *
 * [100, 5, 11, 17]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Simply sort as described.
 * Explanation 2:
 *
 *  Simply sort as described.
 */
public class SortArrayInGivenOrder {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> B=new ArrayList<>(Arrays.asList(5,4,2));

        System.out.println(getSortInGivenOrder(A,B));
    }

    public static ArrayList<Integer> getSortInGivenOrder(ArrayList<Integer> A, ArrayList<Integer> B){
        HashMap<Integer, Integer> frequencyMap=new HashMap<>();
        ArrayList<Integer> answer=new ArrayList<>();
        Collections.sort(A);
        for(int i=0;i<A.size();i++){
            frequencyMap.put(A.get(i),frequencyMap.getOrDefault(A.get(i),0)+1);
        }
        for(int i=0;i<B.size();i++){
           if(frequencyMap.containsKey(B.get(i))){
             //  frequencyMap.put(B.get(i), frequencyMap.get(B.get(i))+1);
               for(int j=0;j<frequencyMap.get(B.get(i));j++){
                   answer.add(B.get(i));
               }
               frequencyMap.remove(B.get(i));
           }
        }
        System.out.println(frequencyMap);
        for(int i=0;i<A.size();i++){
            if(frequencyMap.containsKey(A.get(i))){
                for(int j=0;j<frequencyMap.get(A.get(i));j++){
                    answer.add(A.get(i));
                }
                frequencyMap.remove(A.get(i));
            }
        }
        //System.out.println(frequencyMap);
        return answer;
    }
}
