package javadsaintermediate.mathproblems;

public class FindLCM {
    public static void main(String[] args) {
        int A=6;
        int B=4;
        System.out.println(findLCM(A,B));
    }

    public static int findLCM(int A, int B){

        int ans=(A*B)/findGCD(B>A ? B : A, B<A ? B : A);
        return ans;
    }

    public static int findGCD(int A, int B){
        if(B==0)
            return A;
        return findGCD(B,A%B);
    }
}
