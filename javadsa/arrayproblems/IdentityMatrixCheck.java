package javadsa.arrayproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentityMatrixCheck {
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
        IdentityMatrixCheck imc=new IdentityMatrixCheck();
        System.out.println(imc.solve(a));
    }

    public int solve(final List<ArrayList<Integer>> A) {
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(i).size();j++){
                if(i==j && A.get(i).get(j)!=1){
                    return 0;
                }else if(i!=j && A.get(i).get(j)!=0){
                    return 0;
                }
            }
        }
        return 1;
    }
}
