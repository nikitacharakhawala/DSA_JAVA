package javaadvanced.bitmanipulation;

public class DivideIntegers {
    public static void main(String[] args) {
        int A=-2147483648;
        int B=1;
        System.out.println(getAnswer(A,B));
    }

    public static int getAnswer(int A, int B){

        int sign=1;
        if(A<0){
            sign=-sign;

        }
        if(B<0){
            sign=-sign;

        }
       long answer=0;
       long a=Math.abs(A*1L);
       long b=Math.abs(B*1L);
       for(int i=31;i>=0;i--){
           if((b<<i)<=a){
              // System.out.println(a+":::::"+answer);
               a-=(b<<i);
               answer=answer+(1L<<i);
           }
       }
       //System.out.println(answer*sign);
       if(answer>Integer.MAX_VALUE){
           return sign==-1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
       }
       return (int)(answer*sign);
    }
}
