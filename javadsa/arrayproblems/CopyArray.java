package javadsa.arrayproblems;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CopyArray ca=new CopyArray();
        ArrayList<Integer> newArray=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            newArray.add(sc.nextInt());
        }
        int b=sc.nextInt();
        ArrayList<Integer> calculatedArray=ca.solve(newArray, b);
        for(Integer element : calculatedArray){
            System.out.print(element+" ");
        }



    }
    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> newArray=new ArrayList<>();
        for(Integer ele: A){
            newArray.add(ele+B);
        }
        return newArray;
    }
}
