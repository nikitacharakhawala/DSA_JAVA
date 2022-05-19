package javadsaintermediate.stringproblemsintermmediate;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ChangeCharacter {
    public static void main(String[] args) {
        String A="abcabbccd";
        int B=3;
        System.out.println(ChangeCharacter(A,B));
    }

    public static int ChangeCharacter(String A, int B){
        HashMap<Character, Integer> hm=new HashMap<>();

        for(int i=0;i<A.length();i++){
            if(!hm.containsKey(A.charAt(i))){
                hm.put(A.charAt(i), 1);

            }else{
                hm.put(A.charAt(i), hm.get(A.charAt(i))+1);

            }
        }

       int count=0;
        System.out.println(hm);
        for(Map.Entry<Character,Integer> entry: hm.entrySet()){
            if(B>= entry.getValue()){

            }
        }
        return count;
    }
}
