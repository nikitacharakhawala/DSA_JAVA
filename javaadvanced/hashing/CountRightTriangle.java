package javaadvanced.hashing;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.HashMap;
import java.util.HashSet;

public class CountRightTriangle {
    public static void main(String[] args) {
        int[] A={1, 1, 2, 3, 3};
        int[] B={1, 2, 1, 2, 1};
        System.out.println(getRightAngleTriangle(A,B));
    }

    public static int getRightAngleTriangle(int[] A, int[] B){
        HashMap<Integer, Integer> xAxis=new HashMap<>();
        HashMap<Integer, Integer> yAxis=new HashMap<>();
        int mod=1000000007;
        for(int i=0;i<A.length;i++){
            xAxis.put(A[i], xAxis.getOrDefault(A[i], 0)+1);
            yAxis.put(B[i], yAxis.getOrDefault(B[i],0)+1);
        }
        System.out.println(xAxis);
        System.out.println(yAxis);
        long answer=0;
        for(int i=0;i<B.length;i++){
           int x=xAxis.get(A[i]);
           int y=yAxis.get(B[i]);
           answer=answer+((((x-1)%mod)*((y-1)%mod))%mod);
        }
        return (int)answer;
    }
}
