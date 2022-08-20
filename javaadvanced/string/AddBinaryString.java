package javaadvanced.string;

public class AddBinaryString {
    public static void main(String[] args) {
        String a="100";
        String b="11";
        String ans="";
        int cary=0, i=Math.max(a.length(), b.length())-1, j=Math.min(a.length(), b.length())-1;
        while(cary>0 && i>=0){
            int add=Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(j)));


        }
    }
}
