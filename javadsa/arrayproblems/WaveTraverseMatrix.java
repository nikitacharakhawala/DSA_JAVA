package javadsa.arrayproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class WaveTraverseMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> cols=new ArrayList<>();
            for(int j=0;j<n;j++){
                cols.add(j, sc.nextInt());
            }
            matrix.add(i, cols);
        }
        WaveTraverseMatrix wtm=new WaveTraverseMatrix();
        printMatrix(matrix);
        System.out.println("---------------");
        wtm.printWaveForm(matrix);

    }

    public void printWaveForm(ArrayList<ArrayList<Integer>> m){
        for(int i=0;i<m.get(0).size();i++){
            if(i%2==0){
                for(int j=0;j<m.size();j++){
                    System.out.print(m.get(j).get(i)+" ");
                }
            }else {
                for (int j = m.size() - 1; j >= 0; j--) {
                    System.out.print(m.get(j).get(i) + " ");
                }
            }
        }
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> m){
        for(int i=0;i<m.size();i++){
            for(int j=0;j<m.get(i).size();j++){
                System.out.print(m.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
