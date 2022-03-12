package javadsa.mathsproblems;

import java.util.Scanner;

public class ReverseNumberSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverseSum(n));
    }
    public static int reverseSum(int n){
        int reverse=0, rem=0, num=n;
        while(num>0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse+n;
    }
}
