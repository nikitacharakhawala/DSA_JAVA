package javadsaintermediate.mathproblems;

public class LargerDivideByTwo {

        String quotient;
        int remainder;
        public static void main(String args[]) {
            System.out.println(LargerDivideByTwo.power("168"));
        }
        public static int power(String A) {
            if(A.equals("0") || A.equals("1"))   return 0;
            while(!A.equals("1")){
                LargerDivideByTwo s=divideByTwo(A);
                if (s.remainder == 1)
                    return 0;
                A=s.quotient;
            }
            return 1;
        }
        public static LargerDivideByTwo divideByTwo(String num){
            StringBuilder sb=new StringBuilder();
            int c=0;
            for(int i=0;i<num.length();i++){
                int d=c*10+(num.charAt(i)-'0');
                c=d%2;
                sb.append(d/2);
            }
            LargerDivideByTwo s=new LargerDivideByTwo();
            s.quotient=sb.toString().replaceAll("^0+(?!$)", "");
            s.remainder=c;
            return s;
        }


}
