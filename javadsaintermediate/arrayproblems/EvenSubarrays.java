package javadsaintermediate.arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenSubarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(2, 4, 8, 6));
        EvenSubarrays evenSubarrays=new EvenSubarrays();
        System.out.println(evenSubarrays.getEvenSubArrays(A));
    }

    public String getEvenSubArrays(ArrayList<Integer> A) {
        if(A.size()%2!=0 || A.get(0)%2!=0 || A.get(A.size()-1)%2!=0){
            return "NO";
        }
        return "YES";
    }
}
