package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SubSets {
    public static void main(String[] args) {
        int[] A={15, 20, 12, 19, 4};
        ArrayList<ArrayList<Integer>> answer=printSubSet(A);
        for(ArrayList<Integer> eles : answer){
            for(Integer e: eles){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> printSubSet(int[] A){
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        int index=-1;
        for(int i=0;i<Math.pow(2, A.length);i++){
            ArrayList<Integer> eles=new ArrayList<>();
            for(int j=0;j<A.length;j++){
                if((i&(1<<j))!=0){
                    eles.add(A[j]);
                }
            }
           answer.add(eles);



        }
        Collections.sort(answer, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
               if(o1.size()>0 && o2.size()>0){
                   for(int i=0;i<Math.min(o1.size(), o2.size());i++){
                       if(o1.get(i)!=o2.get(i))
                           return o1.get(i)-o2.get(i);
                   }
               }
               return 0;
            }
        });


        return answer;
    }
}
