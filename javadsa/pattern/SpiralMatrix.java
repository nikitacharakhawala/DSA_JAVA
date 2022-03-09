package javadsa.pattern;

import java.util.Scanner;

class SpiralMatrix{
//            1  2  3  4  5
//            14 15 16 17 6
//            13 20 19 18 7
//            12 11 10 9  8
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int t=0, r=n-1, l=0, b=m-1, count=1, dir=1;
        Integer[][] spiralMatrix=new Integer[m][n];
        while(t<=b && l<=r){
            if(dir==1){
                for(int i=l; i<=r;i++){
                    spiralMatrix[t][i]=count;
                    count++;
                }
                dir=2;
                t++;
            }
            if(dir==2){
                for(int i=t; i<=b;i++){
                    spiralMatrix[i][r]=count;
                    count++;
                }
                r--;
                dir=3;
            }
            if(dir==3){
                for(int i=r;i>=l;i--){
                    spiralMatrix[b][i]=count;
                    count++;
                }
                b--;
                dir=4;
            }
            if(dir==4){
                for(int i=b;i>=t;i--){
                    spiralMatrix[i][l]=count;
                    count++;
                }
                l++;
                dir=1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(spiralMatrix[i][j]<=9) {
                    System.out.print(spiralMatrix[i][j] + "  ");
                }else{
                    System.out.print(spiralMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}