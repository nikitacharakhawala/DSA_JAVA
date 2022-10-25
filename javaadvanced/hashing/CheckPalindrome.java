package javaadvanced.hashing;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        String A="abbaee";
        System.out.println(checkPalindrome(A));
    }

    public static int checkPalindrome(String A){
        HashMap<String, Integer> frequenceMap=new HashMap<>();

        for(int i=0;i<A.length();i++){
            frequenceMap.put(A.charAt(i)+"", frequenceMap.getOrDefault(A.charAt(i)+"", 0)+1);
        }
        int flag=0;
        for(Map.Entry<String, Integer> k:frequenceMap.entrySet()){
            if(k.getValue()%2!=0){

                if(flag<2 && A.length()%2!=0){
                    flag++;
                }else{
                    return 0;
                }
            }
        }


        return 1;

    }
}
