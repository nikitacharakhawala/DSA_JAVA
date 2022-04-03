package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5));
        ArrayList<ArrayList<Integer>> B=new ArrayList<>();
        ArrayList<Integer> bSub=new ArrayList<Integer>(Arrays.asList(7,10));
        B.add(bSub);
        ArrayList<Integer> prefixSum=getPrefixSumArray(A);
        ArrayList<Long> answer=new ArrayList<>();
        for(Integer ans: prefixSum){
            System.out.print(ans+" ");
        }
        System.out.println();
        System.out.println("------------------------------");
        for(ArrayList<Integer> range : B){
            if(range.size()==2){
                int s=range.get(0);
                int e=range.get(1);
                System.out.println(prefixSum.get(e)-prefixSum.get(s-1));
                answer.add((long)prefixSum.get(e)-prefixSum.get(s-1));
            }
        }
        for(Long ans: answer){
            System.out.print(ans+" ");
        }

    }
    public static ArrayList<Integer> getPrefixSumArray(ArrayList<Integer> A){
        ArrayList<Integer> prefixSum=new ArrayList<>();
        prefixSum.add(0);
        prefixSum.add(A.get(0));
        for(int i=1;i<A.size();i++){
            prefixSum.add(prefixSum.get(i)+A.get(i));
        }
        return prefixSum;
    }
}
