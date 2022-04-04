package javadsaintermediate.arrayproblems;


import java.util.*;


/**
 * Problem Description
 *
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 *
 * and at least one occurrence of the minimum value of the array.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= |A| <= 2000
 *
 *
 *
 * Input Format
 *
 * First and only argument is vector A
 *
 *
 *
 * Output Format
 *
 * Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 * A = [1, 3]
 *
 * Input 2:
 *
 * A = [2]
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  2
 *
 * Output 2:
 *
 *  1
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Only choice is to take both elements.
 *
 * Explanation 2:
 *
 *  Take the whole array.
 */
public class ClosetMinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1, 3));
        ClosetMinMax closetMinMax=new ClosetMinMax();
        System.out.println(closetMinMax.findClosestMinMax(A));

    }

    public int findClosestMinMax(ArrayList<Integer> A){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, lat_min=-1, lat_max=-1,ans=Integer.MAX_VALUE;
        for(Integer ele: A){
            if(ele<min){
                min=ele;
            }
            if(ele>max){
                max=ele;
            }
        }
        System.out.println("min:::"+min+"  max::"+max);
        for(int i=0;i<A.size();i++){
            if(A.get(i)==min){
                lat_min=i;

            }
            if(A.get(i)==max){
                lat_max=i;


            }
            if(lat_max!=-1 && lat_min!=-1){
                ans=Math.min(ans, Math.abs(lat_min-lat_max)+1);
            }

        }
        return ans;
    }
}
