package javadsaintermediate.mathproblems;

public class OverlapRactangle {
    public static void main(String[] args) {
        int A=0, B=0, E=2, F=2,C=4,D=4, G=6, H=6;
        System.out.println(checkOverlap(A, B,C,D,E,F,G,H));
    }

    public static int checkOverlap(int A, int B, int C, int D, int E, int F, int G, int H){
        if(F>=D || H<=B){
            return 0;
        }
        if(E>=C || G<=A)
            return 0;
        return 1;
    }
}
