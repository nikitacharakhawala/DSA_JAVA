package javadsa.arrayproblems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public int a=10;
    public static void main(String[] args) {
        Test test=new Test();
        ArrayList<ArrayList<Integer>> b=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(sc.nextInt());
            }
            b.add(row);
        }
        test.printMatrix(b);
        System.out.println(test.transposeCheck(b));

    }

    public int transposeCheck(ArrayList<ArrayList<Integer>> B){
        ArrayList<Integer> A= (ArrayList<Integer>) B.clone();
        for(int i=0;i<B.size();i++){
            for(int j=0;j<B.get(0).size();j++){
                if(i==j && B.get(i).get(j)!=1){
                    return 0;
                }else if(i!=j && B.get(i).get(j)!=0){
                    return 0;
                }
            }
        }
        return 1;
    }

    public void printMatrix(ArrayList<ArrayList<Integer>> b){
        for(ArrayList<Integer> rows : b){
            for(Integer ele: rows){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }




}
