package javadsaintermediate.arrayproblems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Q2. Product array puzzle
 *
 * Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.
 *
 * Input 1:
 *     A = [1, 2, 3, 4, 5]
 * Output 1:
 *     [120, 60, 40, 30, 24]
 *
 * Input 2:
 *     A = [5, 1, 10, 1]
 * Output 2:
 *     [10, 50, 5, 50]
 */

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ProductOfArray productOfArray=new ProductOfArray();
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> product=productOfArray.getProductOfArray(A);
        productOfArray.printArray(product);
    }

    public ArrayList<Integer> getProductOfArray(ArrayList<Integer> A){
        ArrayList<Integer> product=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            product.add(1);
        }
        int temp=1;
        for(int i=0;i<A.size();i++){
            product.set(i, temp);
            temp*=A.get(i);
        }
        temp=1;
        for(int i=A.size()-1;i>=0;i--){
            product.set(i, temp*product.get(i));
            temp*=A.get(i);
        }
        return product;
    }

    public void printArray(ArrayList<Integer> A){
        for(Integer ele: A){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
