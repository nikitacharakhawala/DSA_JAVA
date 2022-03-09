package javadsa.arrayproblems;

import sun.awt.geom.AreaOp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MirrorMatrix {
    public static void main(String[] args) {
        MirrorMatrix mm=new MirrorMatrix();
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<n;i++) {
            ArrayList<Integer> cols = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                cols.add(j, sc.nextInt());
            }
            matrix.add(i, cols);
        }
        ArrayList<ArrayList<Integer>> mirrorMatrix=mm.convertMirrorMatrix(matrix);
        mm.printMatrix(mirrorMatrix);
    }

    public ArrayList<ArrayList<Integer>> convertMirrorMatrix(ArrayList<ArrayList<Integer>> a){
        ArrayList<ArrayList<Integer>> mirrorMatrix=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            int count=0;
            ArrayList<Integer> cols=new ArrayList<>();
            for(int j=a.get(i).size()-1;j>=0;j--){
                cols.add(count, a.get(i).get(j));
                count++;
            }
            mirrorMatrix.add(i, cols);
        }
        return mirrorMatrix;
    }

    public void printMatrix(ArrayList<ArrayList<Integer>> a){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                System.out.print(a.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
