package javadsaintermediate.mathproblems;

import java.util.HashSet;

public class ColorfulNumber {
    public static void main(String[] args) {
        int n=236;
        System.out.println(checkColorfullNumber(n));
    }

    public static int checkColorfullNumber(int n){
        int A=n, sum=1;
        HashSet<Integer> hs=new HashSet<>();
        while(n>0){
            int r=A%10;
            sum*=r;
            if(hs.contains(sum)){
                return 0;
            }else{
                hs.add(sum);
            }
            A=A/10;
            if(A==0){
                n=n/10;
                A=n;

                sum=1;
            }
        }
        return 1;
    }
}
