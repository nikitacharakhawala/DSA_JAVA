package javaadvanced.tries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class SumPair{
    Character ch;
    ArrayList<Integer> sumValues;
    HashMap<Character, SumPair> sumPairMap;
    Boolean isTerminal;

    SumPair(Character ch){
        this.ch=ch;
        sumValues=new ArrayList<>();
        sumPairMap=new HashMap<>();
        isTerminal=false;
    }
}

public class MapSumPairs {
    static SumPair root=new SumPair(null);

    public static void main(String[] args) {
        ArrayList<String> A=new ArrayList<>(Arrays.asList("aaac", "aaca", "babb", "ccca", "ccbc", "ccac", "bcbb", "abbb", "bbca", "cbba", "ccaa", "ccbb", "baac", "bbaa", "caaa", "aaca", "cbcb", "abaa", "accb", "abcb", "bb", "cb", "ab", "ba", "aa", "cc", "aa", "aa", "bc", "aa"));
        ArrayList<Integer> B=new ArrayList<>(Arrays.asList( 42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1));

        System.out.println(getSumPairs(A, B));
    }

    public static ArrayList<Integer> getSumPairs(ArrayList<String> A, ArrayList<Integer> B){
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            if(B.get(i)==-1){
                System.out.println(A.get(i)+"::"+B.get(i));
                answer.add(search(A.get(i)));
            }else{
                System.out.println(A.get(i)+"::INSERT::"+B.get(i));
                insert(A.get(i), B.get(i));
            }
        }
        return answer;
    }

    public static void insert(String word, int sumVal){
        SumPair temp=root;
        for(Character c: word.toCharArray()){
            if(!temp.sumPairMap.containsKey(c)){
                SumPair newNode=new SumPair(c);

                temp.sumPairMap.put(c, newNode);
            }

            temp=temp.sumPairMap.get(c);
            temp.sumValues.add(sumVal);
        }

        temp.isTerminal=true;
    }

    public static int search(String word){
        SumPair temp=root;
        for(Character c: word.toCharArray()){
            if(temp.sumPairMap.containsKey(c)){
                temp=temp.sumPairMap.get(c);
            }else{
                return 0;
            }
        }

        if(temp.ch!=null){
            int sum=0;
            System.out.println(temp.ch+":::::"+temp.sumValues);
            for(Integer val: temp.sumValues){
                sum+=val;
            }
            return sum;
        }
        return 0;
    }


}
