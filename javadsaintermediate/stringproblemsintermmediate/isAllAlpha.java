package javadsaintermediate.stringproblemsintermmediate;

public class isAllAlpha {
    public static void main(String[] args) {
        char[] A= {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        System.out.println(isAllAlphabets(A));

    }

    public static int isAllAlphabets(char[] A) {
        for(int i=0;i<A.length;i++){
            if(!((A[i]>=65 && A[i]<=90) || (A[i]>=97 && A[i]<=122))){
                return 0;
            }
        }
        return 1;
    }
}
