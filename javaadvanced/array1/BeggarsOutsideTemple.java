package javaadvanced.array1;

import java.util.Arrays;

public class BeggarsOutsideTemple {
    public static void main(String[] args) {
        int[][] B={{1,2,10}, {2,3,20}, {2,5,25}};
        int A=5;
        System.out.println(Arrays.toString(getBeggarsMoneyCount(A,B)));


    }

    public static int[] getBeggarsMoneyCount(int A,int[][] B){
        int[] answer=new int[A];

        for(int i=0;i<B.length;i++){
            answer[B[i][0]-1]=answer[B[i][0]-1]+B[i][2];
            if(B[i][1]<answer.length)
                answer[B[i][1]]=answer[B[i][1]]-B[i][2];
        }

        for(int i=0;i<answer.length;i++){
            if(i!=0){
                answer[i]=answer[i]+answer[i-1];
            }
        }
        return answer;
    }
}
