package javadsaintermediate.arrayproblems;

import java.lang.reflect.Array;
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer>  A=new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer>  B = new ArrayList<>(Arrays.asList(2, 3, 1, 2));
        System.out.println(Arrays.toString(findCommonElements(A, B).toArray()));
    }

    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> A, ArrayList<Integer> B){
        HashMap<Integer, Integer> hm1=new HashMap<>();
        HashMap<Integer, Integer> hm2=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(Integer i: A){
            if(hm1.containsKey(i)){
                hm1.put(i, hm1.get(i)+1);
            }else{
                hm1.put(i,1);
            }
        }

        for(Integer i: B){
            if(hm2.containsKey(i)){
                hm2.put(i, hm2.get(i)+1);
            }else{
                hm2.put(i, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : hm1.entrySet()){
            if(hm2.containsKey(entry.getKey())){
                int i=Math.min(entry.getValue(), hm2.get(entry.getKey()));
                for(int j=0;j<i;j++){
                    ans.add(entry.getKey());
                }
            }
        }
        return ans;
    }


}
