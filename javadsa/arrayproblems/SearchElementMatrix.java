package javadsa.arrayproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementMatrix {
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
        SearchElementMatrix sem=new SearchElementMatrix();
        System.out.println("Please Enter Search Key:");
        int key=sc.nextInt();
        System.out.println(sem.searchElement(matrix, key));
    }

    public String searchElement(ArrayList<ArrayList<Integer>> m, int key){
        for(int i=0;i<m.size();i++){
            for(int j=0;j<m.get(i).size();j++){
                if(m.get(i).get(j)==key){
                    return i+","+j;
                }
            }
        }
        return "-1";
    }
}
