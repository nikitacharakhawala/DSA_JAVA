package javadsaintermediate.mathproblems;

public class SumOfDigitRec {
    public static void main(String[] args) {
        int N=46;
//        System.out.println(getSum(N));

        int ans=foo(3 ,5);
        System.out.println(ans);
    }

   public static int foo(int x, int y){
        if(y==0)
            return 1;
        return bar(x, foo(x,y-1));
   }

   public static int bar(int x, int y){
        if(y==0)
            return 0;
        return (x+bar(x, y-1));
   }
//    public static int getSum(int N){
//        if(N==0)
//            return 0;
//        return (N%10)+getSum(N/10);
//    }
}
