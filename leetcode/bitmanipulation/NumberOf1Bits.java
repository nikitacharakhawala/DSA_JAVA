package leetcode.bitmanipulation;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(getNumberOfBits(n));
    }

    public static int getNumberOfBits(int n){
        int count=0;
        for(int i=31;i>=0;i--){
            System.out.println(n>>i);
            if((n<<i)>1){
                count++;
            }
        }
        return count;
    }
}
