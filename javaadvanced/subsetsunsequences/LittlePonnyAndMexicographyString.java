package javaadvanced.subsetsunsequences;

public class LittlePonnyAndMexicographyString {
    public static void main(String[] args) {
        String A="abcdsfhjagj";
        System.out.println(getLexicographySmallString(A));
    }

    public static String getLexicographySmallString(String A){
        if(A.length()<=2){
            return A;
        }
        char a=A.charAt(0), b=A.charAt(1);
        int i=2;
        while(i<A.length()){
            if(b<a){
                a=b;
                b=A.charAt(i);
            }else if(A.charAt(i)<b){
                b=A.charAt(i);
            }
            i++;
        }
        return String.valueOf(a)+String.valueOf(b);

    }
}
