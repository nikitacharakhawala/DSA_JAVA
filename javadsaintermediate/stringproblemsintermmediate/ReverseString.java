package javadsaintermediate.stringproblemsintermmediate;

public class ReverseString {
    public static void main(String[] args) {
        String A="scaler";
        System.out.println(reverseString(A));
    }

    public static String reverseString(String A){
        StringBuilder sb=new StringBuilder(A);
        return sb.reverse().toString();
    }
}
