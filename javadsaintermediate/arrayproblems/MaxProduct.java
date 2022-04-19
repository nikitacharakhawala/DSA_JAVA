package javadsaintermediate.arrayproblems;

public class MaxProduct {
    public static void main(String[] args) {
        int[] A={2,3,-2,4};
        System.out.println(findMaxProduct(A));
    }

    public static int findMaxProduct(int[] nums){
        int max_product=Integer.MIN_VALUE, product=1;
        for(int s=0;s<nums.length;s++){
            for(int e=s;e<nums.length;e++){
                for(int k=s;k<=e;k++){
                   product*=nums[k];
                }
                if(product>max_product){
                    max_product=product;
                }
                product=1;

            }
        }
        return max_product;
    }
}
