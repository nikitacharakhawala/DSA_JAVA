package javadsaintermediate.arrayproblems;

import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>(Arrays.asList( 0, 0, 0, 0, 0 ));
        System.out.println(largestNumber(A));
    }

    public static String largestNumber(final List<Integer> A) {
        List<String> sl=new ArrayList<>();
        String ans="";
        for(Integer ele: A){
            sl.add(String.valueOf(ele));
        }
        Collections.sort(sl, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1) > 0 ? -1 : 1;
            }
        });
        boolean isZero=false;
        for(String s: sl){
            if(s.equals("0")){
                isZero=true;
            }else{
                isZero=false;
            }
            ans+=s;
        }
        if(isZero){
            ans="0";
        }
        return ans;
    }

}
