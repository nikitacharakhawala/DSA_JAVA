package javadsa.mathsproblems;

import java.util.Scanner;

public class ArmstromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findArmstorme(n) ? "Yes" : "No");
    }

    public static boolean findArmstorme(int n){
        int num=n;
        int sum=0;
        while(num>0){
            sum+=pow(num%10, 3);
            num=num/10;
        }
        return n==sum ? true : false;
    }

    public static int pow(int n, int power){
        int answer=n;
        double p=power/2;

        for(int j=1;j<=p;j++){
                answer=answer*n;
        }

        if(power%2!=0){
            answer=answer*n;
        }
        return answer;
    }
}
