package javaadvanced.primenumbers;

import java.util.Arrays;

public class CountNoOfDivisors {
    public static void main(String[] args) {
        int[] A={8,9,10};
        System.out.println(Arrays.toString(getNoOfDivisor(A)));
    }

    public static int[] getNoOfDivisor(int[] A){
        int max=getMax(A);
        int[] spf=getSpf(max);
        for(int i=0;i<A.length;i++){
            int totalDivisor=1;
            int num=A[i];
            if(num==1){
                A[i]=1;
                continue;
            }
            while(num>1){
                int count=0, spfNum=spf[num];
                while(num%spfNum==0){
                    count++;
                    num=num/spfNum;
                }
                totalDivisor=totalDivisor*(count+1);

            }
            A[i]=totalDivisor;
        }
        return A;
    }

    public static int[] getSpf(int m){
        int[] spf=new int[m+1];
        for(int i=1;i<spf.length;i++){
            spf[i]=i;
        }
        for(int i=2;i*i<=m;i++){
            if(spf[i]==i){
                for(int j=i*i;j<=m;j+=i){
                    spf[j]=Math.min(spf[j],i);
                }
            }
        }
        return spf;

    }

    public static int getMax(int[] A){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
}
