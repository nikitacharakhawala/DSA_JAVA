package javadsa.mathsproblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //printPerfectNumber(n);
        System.out.println(solve(n));
    }

    public static int solve(int A) {
        return 0;
    }

    public static void printPerfectNumber(int n){
        for(int i=2;i<n;i++){
            int sum=1;
           for(int num=2;num*num<=i;num++){
               if(i%num==0){
                   if(num*num!=i){
                       sum=sum+num+i/num;
                   }else{
                       sum=sum+num;
                   }
               }
           }
           if(sum==i && i!=1){
               System.out.println(i);
           }

        }
    }
}
