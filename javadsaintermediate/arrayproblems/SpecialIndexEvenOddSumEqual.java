package javadsaintermediate.arrayproblems;
/**
 * Count ways to make sum of odd and even indexed elements equal by removing an array element
 *
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpecialIndexEvenOddSumEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SpecialIndexEvenOddSumEqual specialIndexEvenOddSumEqual=new SpecialIndexEvenOddSumEqual();
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1, 1, 1));
        System.out.println(specialIndexEvenOddSumEqual.getSpecialIndex(A));
    }

    public int getSpecialIndex(ArrayList<Integer> A){
        ArrayList<Integer> psOdd=getOddPrefixSum(A);
        ArrayList<Integer> psEven=getEvenPrefixSum(A);
        int count=0, sumE=0, sumO=0, n=A.size();
        for(int i=0;i<A.size();i++){
            if(i==0){
                sumE=psOdd.get(n-1)-psOdd.get(i);
                sumO=psEven.get(n-1)-psEven.get(i);
            }else{
                sumE=psEven.get(i-1)+psOdd.get(n-1)-psOdd.get(i);
                sumO=psOdd.get(i-1)+psEven.get(n-1)-psEven.get(i);
            }
            if(sumE==sumO){
                count++;
            }
        }
        return count;
    }

    public ArrayList<Integer> getOddPrefixSum(ArrayList<Integer> A){
        ArrayList<Integer> psOdd=new ArrayList<>();
        psOdd.add(0);
        for(int i=1;i<A.size();i++){
            if(i%2!=0){
                psOdd.add(psOdd.get(i-1)+A.get(i));
            }else{
                psOdd.add(psOdd.get(i-1));
            }
        }
        return psOdd;
    }

    public ArrayList<Integer> getEvenPrefixSum(ArrayList<Integer> A){
        ArrayList<Integer> psEven=new ArrayList<>();
        psEven.add(A.get(0));
        for(int i=1;i<A.size();i++){
            if(i%2==0){
                psEven.add(psEven.get(i-1)+A.get(i));
            }else{
                psEven.add(psEven.get(i-1));
            }
        }
        return psEven;
    }

    public void printArray(ArrayList<Integer> A){
        for(Integer ele: A){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
