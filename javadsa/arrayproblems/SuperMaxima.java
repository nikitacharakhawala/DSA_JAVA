package javadsa.arrayproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMaxima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] array=new Integer[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(superMaxima(array));
    }

    public static int superMaxima(Integer[] array){
        int count=0;
        for(int i=0;i<array.length-1;i++){
            if(i!=0){
                if(array[i-1]<array[i]  && array[i]>array[i+1] && array[i-1]+array[i+1]<array[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
