package javadsaintermediate.stringproblemsintermmediate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheckPossiblePalindrome {
    public static void main(String[] args) {
        String A="dcnzutptzzilbtihpgtyegycjysfxlasllvjqatoznaxftxrxjlyoxqnkcalaunxuyokvnkcnouhhxrabcxdaezxakxhjoyco";



        System.out.println(checkPosiblePalindrome(A));
    }

    public static int checkPosiblePalindrome(String A) {
        if(A.length()==1){
            return 1;
        }
        HashMap<String, Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++){
            if(!hm.containsKey(A.charAt(i)+"")){
                hm.put(A.charAt(i)+"",1);
            }else{
                hm.put(A.charAt(i)+"", hm.get(A.charAt(i)+"")+1);
            }
        }

        int len=A.length();
        int oddCount=0;

        for(Map.Entry<String,Integer> entry:hm.entrySet()){
           if(len%2==0){
               if(entry.getValue()%2!=0)
                   return 0;
           }else{

               if(entry.getValue()%2!=0){
                   oddCount++;
               }
               if(oddCount>1){
                   return 0;
               }
           }
        }

        return 1;


    }
}
