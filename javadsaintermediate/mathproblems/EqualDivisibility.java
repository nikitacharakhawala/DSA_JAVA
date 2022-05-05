package javadsaintermediate.mathproblems;

public class EqualDivisibility {
    public static void main(String[] args) {
        int A=5;
        int B=10;
        System.out.println(checkEqualDivisibility(A,B));

    }
    public static int checkEqualDivisibility(int A, int B){
        if(A>B){
            return (A-B);
        }else{
            return (B-A);
        }
    }
}
