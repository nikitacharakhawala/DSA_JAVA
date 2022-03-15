package javadsa.arrayproblems;

import java.util.Scanner;

public class LinearSearchSecondPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] array=new Integer[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        System.out.println(linearSearch(array, element));
    }

    public static int linearSearch(Integer[] array, int element){
        int occ=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                occ++;
            }
            if(occ==2){
                return i;
            }
        }
        return -1;
    }
}
