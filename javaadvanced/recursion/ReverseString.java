package javaadvanced.recursion;

public class ReverseString {
    public static void main(String[] args) {
            String s="abc";
            System.out.println(reverseString(s,s.length()-1));
    }

    public static String reverseString(String s, int index){
        if(index==-1)
            return "";
        String rev=s.charAt(index)+"";
        return rev+reverseString(s,index-1);

    }
}
