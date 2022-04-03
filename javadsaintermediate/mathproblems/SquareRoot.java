package javadsaintermediate.mathproblems;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        solve1(n);
    }

    public static int solve(int A) {
        long start=1, end=A, mid=0, ans=0;

        while(start<=end){
            mid=(start+end)/2;
            if(mid*mid==A){
                return (int)mid;
            }

            if((mid*mid)<=A){
                start=mid+1;
                ans=mid;
            }else{
                end=mid-1;
            }
        }
        return (int)ans;
    }

    public static double squareRootUsingLog(int n){

        return Math.pow(2, 0.5*Math.log(n)/Math.log(2));
    }

   public static void solve1(int n){
        int c=0, k=0;
       for(int i=3;i<n/3;i+=3){
           c++;
           for(int j=2; j<n/2;j+=2){
               k++;
           }
       }
       System.out.println("c::"+c);
       System.out.println("k::"+k);
   }
}
