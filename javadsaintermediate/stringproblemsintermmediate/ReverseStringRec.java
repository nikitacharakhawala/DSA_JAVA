package javadsaintermediate.stringproblemsintermmediate;

public class ReverseStringRec {
    public static void main(String[] args) {
        String s="scaleracademy";
        char[] c=s.toCharArray();
        reverseString(c,0, s.length()-1);
        System.out.println(c);
    }

    public static void reverseString(char[] c, int i, int j){
        if(i==c.length/2)
            return;
        swap(c, i,j);
        reverseString(c, i+1, j-1);

    }

    public static char[] swap(char[] s, int i, int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        return s;
    }
}
