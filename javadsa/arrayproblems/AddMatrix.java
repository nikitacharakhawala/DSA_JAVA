package javadsa.arrayproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> columns=new ArrayList<>();
            for(int j=0;j<cols;j++){
                columns.add(j, sc.nextInt());
            }
            a.add(i, columns);
        }
        ArrayList<ArrayList<Integer>> b=new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> columns=new ArrayList<>();
            for(int j=0;j<cols;j++){
                columns.add(j, sc.nextInt());
            }
            b.add(i, columns);
        }
        AddMatrix am=new AddMatrix();
        ArrayList<ArrayList<Integer>> c=am.solve(a,b);
        for(int i=0;i<c.size();i++){
            for(int j=0;j<c.get(i).size();j++){
                System.out.print(c.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b){
        ArrayList<ArrayList<Integer>> c=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            ArrayList<Integer> columns=new ArrayList<>();
            for(int j=0;j<a.get(i).size();j++) {
                columns.add(j, a.get(i).get(j) + b.get(i).get(j));
            }
            c.add(i, columns);
        }
        return c;
    }
}
