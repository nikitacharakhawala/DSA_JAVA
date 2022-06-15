package javadsaintermediate.stringproblemsintermmediate;

public class AGSubSequence {
    public static void main(String[] args) {
        String s="ABCGAG";
        System.out.println(findSubSequence(s));
    }

    public static int findSubSequence(String s){
        int total=0, aCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
                aCount+=1;
            if(s.charAt(i)=='G')
                total+=aCount;
        }
        return total;
    }
}
