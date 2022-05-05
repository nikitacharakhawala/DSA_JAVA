package javadsaintermediate.stringproblemsintermmediate;

public class StringOperations {
    public static void main(String[] args) {
        String A="AbcaZeoB";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        String ans=A+A;
        ans=ans.replaceAll("[A-Z]" , "");
        ans=ans.replaceAll("[a|e|i|o|u]", "#");
        return ans;
    }
}
