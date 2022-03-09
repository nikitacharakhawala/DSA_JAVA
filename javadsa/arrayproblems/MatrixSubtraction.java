package javadsa.arrayproblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> columnList=new ArrayList<>();
            for(int j=0;j<cols;j++){
                columnList.add(j, sc.nextInt());
            }
            a.add(i, columnList);
        }
        ArrayList<ArrayList<Integer>> b=new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> columnList=new ArrayList<>();
            for(int j=0;j<cols;j++){
                columnList.add(j, sc.nextInt());
            }
            b.add(i, columnList);
        }
        MatrixSubtraction ms=new MatrixSubtraction();
        ArrayList<ArrayList<Integer>> c= ms.solve(a,b);
        for(int i=0;i<rows; i++){
            for(int j=0;j<cols;j++){
                System.out.print(c.get(i).get(j));
            }
            System.out.println();
        }

    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> c=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A.size();i++){
            ArrayList<Integer> cols=new ArrayList<>();
            for(int j=0;j<A.get(i).size();j++){
                cols.add(j, A.get(i).get(j)-B.get(i).get(j));
            }
            c.add(i, cols);
        }
        return c;
    }
}
