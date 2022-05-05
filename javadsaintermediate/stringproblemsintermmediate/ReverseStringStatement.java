package javadsaintermediate.stringproblemsintermmediate;

import java.util.Locale;

public class ReverseStringStatement {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(solve(s));
    }

    public static String solve(String A) {
        String[] s=A.split(" ");
        String answer="";
        if(s.length>0){
            for(int i=s.length-1;i>=0;i--){
                answer+=s[i]+" ";
            }
        }
        return answer.trim();
    }
}
