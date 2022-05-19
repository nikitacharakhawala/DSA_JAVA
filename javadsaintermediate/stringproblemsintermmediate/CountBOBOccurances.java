package javadsaintermediate.stringproblemsintermmediate;

public class CountBOBOccurances {
    public static void main(String[] args) {
        String s="bobob";
        System.out.println(countBOB(s));
    }

    public static int countBOB(String s){
        int ans=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length-2;i++){
            if(c[i]=='b' && c[i+1]=='o' && c[i+2]=='b'){
                ans++;
            }
        }
        return ans;
    }
}
