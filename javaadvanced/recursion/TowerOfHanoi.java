package javaadvanced.recursion;



public class TowerOfHanoi {
    static int[][] ans;
    static int rowIndex=0;
    public static void main(String[] args) {
        int A=2;
        int[][] x=solveTOH(A);
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] solveTOH(int A){
        int moves=(1<<A)-1;
        System.out.println(moves);
        ans=new int[moves][3];
        TOH(A, 1, 2, 3);
        return ans;
    }
    public static void TOH(int A, int from, int to, int temp){
        if(A==0){
            return;
        }
        TOH(A-1, from, temp, to);
        ans[rowIndex][0]=A;
        ans[rowIndex][1]=from;
        ans[rowIndex][2]=to;
        rowIndex++;
        TOH(A-1, temp,to,from);
    }
}
