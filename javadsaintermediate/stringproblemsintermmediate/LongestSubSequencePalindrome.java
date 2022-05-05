package javadsaintermediate.stringproblemsintermmediate;

public class LongestSubSequencePalindrome {
    public static void main(String[] args) {
        String A="abb";
        System.out.println(longestPalindrome(A));
    }

    public static String longestPalindrome(String A) {
        String s="";
        int startIndex=Integer.MAX_VALUE, ans=0;
        for(int i=0;i<A.length();i++){
            for(int j=i;j<A.length();j++){
                if(isPalindrome(A, i,j)){
                   if(ans==(j-i+1)){
                       startIndex=Math.min(startIndex, i);
                   }else{
                       if((j-i+1)>ans){
                           s=A.substring(i,j+1);
                           startIndex=i;
                           ans=j-i+1;
                       }
                   }

                }
            }
        }

        return s;
    }

    public static boolean isPalindrome(String s, int start, int end){
        int i=start;
        int j=end;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}
