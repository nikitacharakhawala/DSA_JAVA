package javadsaintermediate.arrayproblems;

import java.util.HashSet;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s={"abcd", "abde", "abcf" };
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] s){
        HashSet<String> hs=new HashSet<>();
        String smallString="", ans="";
        int length=Integer.MAX_VALUE;
        for(String ele: s){
            if(ele.length()<length){
                length=ele.length();
                smallString=ele;
            }
        }
        for(int i=0;i<smallString.length();i++){
            hs.clear();
            for(String ele: s){
                hs.add((ele.charAt(i)+""));
            }
            if(hs.size()!=1){
                break;
            }
            if(hs.size()==1){
                ans+=smallString.charAt(i);
            }
        }
        return ans;
    }
}
