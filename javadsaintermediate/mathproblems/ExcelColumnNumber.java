package javadsaintermediate.mathproblems;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        String A="ABCD";
        System.out.println(getExcelColumnNumber(A));

    }

    public static int getExcelColumnNumber(String A){
        int ans=A.charAt(0)-64;
        for(int i=1;i<A.length();i++){
            ans=(ans*26)+A.charAt(i)-64;
        }
        return ans;
    }
}
