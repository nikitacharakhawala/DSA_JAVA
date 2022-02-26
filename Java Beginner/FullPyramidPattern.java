import java.lang.*;
import java.util.*;

public class FullPyramidPattern {

    public static void main(String[] args) {
//        0 0 0 0 1 0 0 0 0
//        0 0 0 2 3 2 0 0 0
//        0 0 3 4 5 4 3 0 0
//        0 4 5 6 7 6 5 4 0
//        5 6 7 8 9 8 7 6 5
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=1;
        for(int i=1;i<=n;i++){
            value=i;
            //Initial 0's loop
            for(int count=1;count<=n-i; count++){
                System.out.print("0 ");
            }
            //Middle part Number
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value++;

            }
            //Right part where numbers are decreasing
            value=value-2;
            for(int j=1;j<i;j++){
                System.out.print(value+" ");
                value--;
            }
            //Last part 0's
            for(int count=n-i;count>=1;count--){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}