package javaadvanced.stringpatternmatching;

public class BoringSubstring {
    public static void main(String[] args) {
        String A="abcdA";
        //System.out.println(getBoringSubString(A));
        System.out.println(toggleCase(A));
    }

    public static String toggleCase(String A){
        String result="";
        for(int i=0;i<A.length();i++){

            if(A.charAt(i)>=97){
                result=result+(char)(A.charAt(i)-32);
            }else{
                result=result+(char)(A.charAt(i)+32);
            }
        }
        return result;
    }

    public static int getBoringSubString(String A){
        int[] freq=new int[26];
        for(int i=0;i<A.length();i++){
            freq[A.charAt(i)-'a']++;
        }
        int i=1;
        while(i<freq.length-1){
            if(freq[i-1]+freq[i]+freq[i+1]==A.length()){
                return 0;
            }
            i++;
        }
        return 1;
    }
}
