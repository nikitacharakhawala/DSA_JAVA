package javadsaintermediate;

public class stringproblems {
    public static class LongestSubSequentOne {
        public static void main(String[] args) {
            String s="11011";
            System.out.println(getLongestSequenceString(s));
        }

        public static int getLongestSequenceString(String A){
                int ans=Integer.MIN_VALUE, leftOnes=0, rightOnes=0, totalOnes=0;
                for(int i=0;i<A.length();i++){
                    if(A.charAt(i)=='1')
                        totalOnes++;
                }
                if(totalOnes==A.length())
                    return totalOnes;

                for(int i=0;i<A.length();i++){
                    if(A.charAt(i)=='0'){
                        if(i==0){
                            leftOnes=0;
                        }else {
                            for (int x = i - 1; x >= 0; x--) {
                                if (A.charAt(x) == '0')
                                    break;
                                leftOnes++;
                            }
                        }
                            for(int j=i+1;j<A.length();j++){
                                if(A.charAt(j)=='0')
                                    break;
                                rightOnes++;
                            }
                            if(totalOnes>(rightOnes+leftOnes)){
                                ans=Math.max(ans, rightOnes+leftOnes+1);
                            }else{
                                ans=Math.max(ans, rightOnes+leftOnes);
                            }

                            leftOnes=0;
                            rightOnes=0;
                        }

                }
                return ans;
        }
    }
}
