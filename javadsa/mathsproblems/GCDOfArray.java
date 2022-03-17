package javadsa.mathsproblems;

import java.util.Scanner;

public class GCDOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] matrix=new Integer[n];
        for(int i=0;i<n;i++){
            matrix[i]=sc.nextInt();
        }
        System.out.println(findGCD(matrix));
    }

    public static int findGCD(Integer[] array){
        int result=array[0];
        for(int element : array){
            result=gcd(result, element);
            if(result==1){
                return 1;
            }
        }
        return result;
    }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
