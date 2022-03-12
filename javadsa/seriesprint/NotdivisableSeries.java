package javadsa.seriesprint;

import java.util.Scanner;

public class NotdivisableSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        printSeries(n1, n2);
    }

    public static void printSeries(int n1, int n2){
        int num=0;
        int count=0, i=0;
        while(count<n1+1){
            num=3*i+2;
            if(num%n2!=0){
                System.out.print(num+" ");
                count++;
            }
            i++;
        }
    }
}
