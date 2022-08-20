package javaadvanced.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumZero {
    public static void main(String[] args) {
        List<Integer> A=Arrays.asList(-1,0,1,2,-1,4);
        ArrayList<ArrayList<Integer>> answer=threeSum(A);
        for(ArrayList<Integer> ele: answer){
            for(Integer i:ele){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> threeSum(List<Integer> A){
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int x=i+1,y=A.size()-1;
            while(x<y){
                int sum=A.get(i)+A.get(x)+A.get(y);
                if(sum==0){
                    System.out.println(sum);
                    ArrayList<Integer> ele=new ArrayList<>();
                    ele.add(A.get(i));
                    ele.add(A.get(x));
                    ele.add(A.get(y));
                    Collections.sort(ele);
                    if(!answer.contains(ele)){
                        answer.add(ele);
                    }
                    x++;
                }else if(sum<0)
                    x++;
                else
                    y--;
            }
        }
        return answer;
    }
}
