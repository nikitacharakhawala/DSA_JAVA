package javadsaintermediate.patternproblems;

public class StartPattern {
    public static void main(String[] args) {
        int n=4;
        printStar(n);
    }

    public static void printStar(int n){
        int startCount=n;
        for(int i=0;i<n;i++){
            for(int j=startCount;j>0;j--){
                System.out.print("*");
            }
            for(int space=0;space<i*2;space++){
                System.out.print(" ");
            }
            for(int j=startCount;j>0;j--){
                System.out.print("*");
            }
            startCount--;
            System.out.println();
        }
        startCount=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int space=0;space<startCount*2;space++){
                System.out.print(" ");
            }
            startCount--;
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
