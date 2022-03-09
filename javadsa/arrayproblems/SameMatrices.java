package javadsa.arrayproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SameMatrices {
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
        SameMatrices sm=new SameMatrices();
        System.out.println(sm.checkSameMatrices(a, b));
    }

    public int checkSameMatrices(ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b){
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++){
                if(a.get(i).get(j)!=b.get(i).get(j)){
                    return 0;
                }
            }
        }
        return 1;
    }

}
