package leetcode.array;

public class RainWaterTrap {
    public static void main(String[] args) {
        int[] A={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getTrappedRainWater(A));
    }

    public static int getTrappedRainWater(int[] height){
        int leftMax=Integer.MIN_VALUE, rightMax=Integer.MIN_VALUE, sum=0;
        int[] leftMaxArray=new int[height.length];
        int[] rightMaxArray=new int[height.length];

        for(int i=0;i<height.length;i++){
            if(height[i]>leftMax){
                leftMax=height[i];
            }
            leftMaxArray[i]=leftMax;
        }

        for(int i=height.length-1;i>=0;i--){
            if(height[i]>rightMax){
                rightMax=height[i];
            }
            rightMaxArray[i]=rightMax;
        }

        for(int i=0;i<height.length;i++){
            int diff=Math.min(leftMaxArray[i], rightMaxArray[i]);
            if(diff>0){
                sum=sum+diff-height[i];
            }
        }
        return sum;
    }
}
