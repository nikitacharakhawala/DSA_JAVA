package javadsa.pattern;

import java.util.Scanner;

public class HourGlassPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printHourGlassPattern(n);
    }

    public static void printHourGlassPattern(int n){
        //Upper part
        for(int i=0;i<=n;i++){
            for(int space=0;space<i;space++){
                System.out.print(" ");
            }
            int count=n-i;
            for(int j=0;j<n-i;j++){
                System.out.print(count);
                count--;
            }

            System.out.print(count);
            count++;
            for(int j=0;j<n-i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        //lower part
        int num=0;
        for(int i=0;i<n;i++){
            for(int space=0;space<n-i-1;space++){
                System.out.print(" ");
            }
            num=i+1;
            for(int x=0;x<=i;x++){
                System.out.print(num);
                num--;
            }
            System.out.print(num);
            num++;
            for(int x=0;x<=i;x++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
