package javaadvanced.array1;

import java.util.Arrays;

public class AddOne {
    public static void main(String[] args) {
        int[] A={1,2,9};
        System.out.println(Arrays.toString(getAddOne(A)));
    }

   public static int[] getAddOne(int[] A){

        int i=A.length-1;
       int carry=A[i]+1;
        while(carry>0){

            if(carry>9){
                A[i]=carry%10;
                carry=carry/10;
            }else{
                A[i]=carry;
            }
        }
        return A;
   }
}
