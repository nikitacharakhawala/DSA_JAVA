package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        EquilibriumIndex equilibriumIndex=new EquilibriumIndex();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList( 9444, -2556, 7937, 8560, -8622, 1440, -1076, 5987, 1419, 996, -6530, 4583, 8890, -9127, 8801, 9034, -1579, -4395, 1050, 6527, 5959, -1281, -8832, 1363, -9296, -3791, -1316, 4780, 5836, -706, 4650, -3278, 8168, 1329, -3756, 7923, 7291, -6320, -5414, -136, -9627, 4609, -4626, -4655, -7457, -6424, -3573, -970, -5699, 6139, -6334, 2140, -3101, 8478, 1816, -4737, -8118, 9277, 8167, -4375, 9711, -7224, -7777, 2887, -9884, 1275, -1116, -7240, 5451, -3481, 9449, 5439, -9104, 3421, 6344, 6995, 7847, 5166, 2801, 2217, 1640, -8209, -8756, 1586, 121, -908, 276, -8674, 6499, 818, 6184, -5044, 1257, -5923, 7377, 9104, 1040, 2587, -2676, -1172, -4221, -78, 3611, 4554, -4625, 7293, -8077, 1468, 7559, 9935, -7793, -1770, -9166, 3555, 3671, -7560, 9206, -4264, -3848, 2776, 3998, -5961, -8423, -1288, -527, 9968, 1847, -6388, 5042, 8210, -4318, 9107, 525, -278, -7763, 681, -9369, 7563, 5352, 7773, -8169, 3940, 7088, -1872, -5870, 7555, -3032, -2497, 4134, -2995, 3942, 9092, -7739, 6576, 3955, -5175, -9007, 5402, -6827, -3777, 6057, -150, -4567, -94, 5921, -9395, -6154, 6385, -8445, 8889, 921, -7543, -4650, 6461, -7468, -8693, 328, 1855, 7683, 495, -195, 2554, 7950, -1983, -5252, -5584, -9061, -5734, 5425, -7041, 9495, 4647, 1810, -5899, -1038, -5730, -6674, 3818, -2146, -7694, -9968, -5853, 9552, -164, 7672, 9711, -1281, 1151, -1314, -9926, 2948, -1280, 686, 1711, -624, -5462, -8864, 2365, 7361, -4694, 2877, -339, -1560, -2100, -2342));
        ArrayList<Integer> prefixSum=equilibriumIndex.getPrefixSum(A);
        System.out.println(equilibriumIndex.getEquilibriumIndex(prefixSum));

    }

    public int getEquilibriumIndex(ArrayList<Integer> prefixSumArray){
        int sl=0, sr=0, index=0;
        for(int i=0;i<=prefixSumArray.size()-1;i++){
            if(i==0){
                sl=0;
            }else{
                sl=prefixSumArray.get(i - 1);
            }
            sr=prefixSumArray.get(prefixSumArray.size() - 1) - prefixSumArray.get(i);
            if(sr==sl && index>0){
                index=Math.min(i, index);
            }else if(sl==sr){
                index=i;
            }
            System.out.println("---------------i-------------"+i);
            System.out.println("sr:::"+sr);
            System.out.println("sl::::"+sl);
        }
        return index;
    }

    public ArrayList<Integer> getPrefixSum(ArrayList<Integer> A){
        ArrayList<Integer> prefixSum=new ArrayList<>();
        prefixSum.add(A.get(0));
        for(int i=1;i<A.size();i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i));
        }
        return prefixSum;
    }

    public void printArray(ArrayList<Integer> A){
        for(Integer ele: A){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
}