package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.List;

public class NByThreeElements {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(1);
        A.add(1);
        System.out.println(repeatedNumber(A));
    }

    public static int repeatedNumber(final List<Integer> a) {
        int c1=0, c2=0, f=Integer.MIN_VALUE, s=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            if(f==a.get(i)){
                c1++;
            }else if(s==a.get(i)){
                c2++;
            }else if(c1==0){
                f=a.get(i);
                c1++;
            }else if(c2==0){
                s=a.get(i);
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1=0;
        c2=0;
        for(int i=0;i<a.size();i++){
            if(f==a.get(i))
                c1++;
            else if(s==a.get(i))
                c2++;
        }

       if(c1>c2 && c1>a.size()/3){
           return f;
       }else if(c2>c1 && c2>a.size()/3){
           return s;
       }else{
           return -1;
       }
    }
}
