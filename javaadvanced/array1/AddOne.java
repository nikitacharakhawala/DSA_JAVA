package javaadvanced.array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddOne {
    public static void main(String[] args) {
        List<Integer> A=Arrays.asList(0, 3, 7, 6, 4, 0, 5, 5, 5);

        for(Integer i: getAddOne(A)){
            System.out.print(i);
        };
    }

   public static ArrayList<Integer> getAddOne(List<Integer> A){
        int carry=0;
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=A.size()-1;i>=0;i--){
             if(i==A.size()-1){
                 if(A.get(i)==9){
                     answer.add(0);
                     carry=1;
                 }else{
                     answer.add(A.get(i)+1);
                     carry=0;
                 }
             }
             else if(carry==1){
                 if(A.get(i)<9){
                     answer.add(A.get(i)+carry);
                     carry=0;
                 }else{
                     answer.add(0);
                     carry=1;
                 }
             }else{
                 answer.add(A.get(i));
             }
             System.out.println(Arrays.toString(answer.toArray()));
        }
        if(carry==1){
            answer.add(carry);
        }
        Collections.reverse(answer);
        int i=0;
        while(answer.get(i)==0){
            answer.remove(i);
        }
        return answer;
   }
}
