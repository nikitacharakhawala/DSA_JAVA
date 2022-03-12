package javadsa.pattern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDiamondPattern(n);
    }

    public static void printDiamondPattern(int n){
        //First Half Diamond
        for(int i=1;i<=n;i++){
            for(int space=n-i-1; space>=0;space--) {
                System.out.print("S ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int space=1;
        for(int i=n-2;i>=0;i--){
            for(int x=0;x<space;x++){
                System.out.print("S ");
            }
            space++;
            for(int j=2*i+1;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
