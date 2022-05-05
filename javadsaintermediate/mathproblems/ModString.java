package javadsaintermediate.mathproblems;

public class ModString {
    public static void main(String[] args) {
        String A="43535321";
        int B=47;
        System.out.println(findMod(A, B));
    }

    public static int findMod(String A, int B){
        int ans=0, r=1;
       for(int i=A.length()-1; i>=0;i--){
           int n=A.charAt(i)-'0';
           ans=(ans+((n%B)*r))%B;
           r=(r*10)%B;
       }
        return ans;
    }
}
