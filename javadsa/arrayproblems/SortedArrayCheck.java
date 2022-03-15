package javadsa.arrayproblems;

import java.util.Scanner;

public class SortedArrayCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] array=new Integer[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(checkSorted(array));
    }

    public static boolean checkSorted(Integer[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}
