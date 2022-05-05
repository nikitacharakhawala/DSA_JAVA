package javadsaintermediate.arrayproblems;

import java.util.Arrays;

public class SumClosetWithTarget {
    public static void main(String[] args) {
        int[] A={1,1,-1,-1,3};
        int target=3;
        System.out.println(getClosestSum((A), target));
    }

    public static int getClosestSum(int[] num, int target){
        int result=num[0]+num[1]+num[num.length-1];
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            int a_pointer=i+1;
            int b_pointer=num.length-1;
            while(a_pointer<b_pointer){
                int current_sum=num[i]+num[a_pointer]+num[b_pointer];
                if(current_sum>target){
                    b_pointer--;
                }else{
                    a_pointer++;
                }
                if(Math.abs(current_sum-target)<Math.abs(result-target)){
                    result=current_sum;
                }
            }
        }
        return result;
    }
}
