package javadsaintermediate.arrayproblems;

public class NumberOfOneBit {
    public static void main(String[] args) {
        int n=11;
        System.out.println(getNumberBit(n));
    }

    public static int getNumberBit(int n){
        int count=0, x=1, num=n;
        while(num>0){
            if((n & x)!=0){
                count++;
            }
            x=x<<1;
            num=num>>1;
        }
        return count;
    }
}
