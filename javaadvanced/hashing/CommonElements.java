package javaadvanced.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1, 2, 2, 1));
        ArrayList<Integer> B=new ArrayList<>(Arrays.asList(2, 3, 1, 2));
        System.out.println(getCommonElements(A,B));
    }

    public static ArrayList<Integer> getCommonElements(ArrayList<Integer> A, ArrayList<Integer> B){
        HashMap<Integer, Integer> frequencyMapA=new HashMap<>();
        ArrayList<Integer> answerList=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            frequencyMapA.put(A.get(i), frequencyMapA.getOrDefault(A.get(i), 0)+1);
        }

        for(int i=0;i<B.size();i++){
            if(frequencyMapA.containsKey(B.get(i))){
                if(frequencyMapA.get(B.get(i))>1){
                    frequencyMapA.put(B.get(i), frequencyMapA.get(B.get(i))-1);
                }else{
                    frequencyMapA.remove(B.get(i));
                }
                answerList.add(B.get(i));
            }
        }

        return answerList;
    }
}
