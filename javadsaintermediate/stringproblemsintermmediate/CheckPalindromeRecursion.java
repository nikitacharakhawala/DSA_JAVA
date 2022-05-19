package javadsaintermediate.stringproblemsintermmediate;

public class CheckPalindromeRecursion {
    public static void main(String[] args) {
        String s="strings";
        if(s.length()==0){

        }
        System.out.println(checkPalindrome(s));
    }

    public static int checkPalindrome(String s){
        if(s.length()==0)
            return 0;
        return checkPalindromeRec(s, 0, s.length()-1);
    }

    public static int checkPalindromeRec(String s, int st, int e){
       if(st==e)
           return 1;
       if(s.charAt(st)!=s.charAt(e))
           return 0;
       if(st<e+1)
           return checkPalindromeRec(s, st+1, e-1);
       return 1;


    }
}
