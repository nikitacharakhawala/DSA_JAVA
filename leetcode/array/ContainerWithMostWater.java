package leetcode.array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] A={1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(A));
    }

    public static int containerWithMostWater(int[] height){
        int i=0,j=height.length-1, maxArea=Integer.MIN_VALUE;
        while(i<j && j<height.length){
            int area=Math.min(height[i], height[j])*(j-i);
            System.out.println(area);
            if(area>maxArea){
                maxArea=area;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
