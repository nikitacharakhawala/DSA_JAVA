package javadsaintermediate.arrayproblems;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {

        System.out.println("gcd::"+gcd(6, 2));
        ArrayLeftRotation alr=new ArrayLeftRotation();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47));
        ArrayList<Integer> B=new ArrayList<>(Arrays.asList(88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59));
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        for(int i=1;i<=5;i++){
            A.add(i);
        }
        B.add(2);
        B.add(3);
        answer=alr.solve(A,B);
        for(ArrayList<Integer> list : answer){
            for(Integer ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        for(Integer rotationNum : B){
            answer.add(leftRotate(A, rotationNum));
        }
        return answer;
    }

    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static ArrayList<Integer> leftRotate(ArrayList<Integer> B, int k){
        //k : Number of Left Rotations
        //B : Source Array
        ArrayList<Integer> A= (ArrayList<Integer>) B.clone();
        int gcd=gcd(A.size(), k), temp=0, j, d, n=A.size();
        boolean isContinue=false;
        for(int i=0;i<gcd;i++){
            temp=A.get(i);
            j=i;
            isContinue=true;
            while(isContinue){
                d=j+k;

                while(d>=n) {
                    d = d - n;
                }
                if(d==i){
                    isContinue=false;
                    break;
                }
                A.set(j, A.get(d));
                j=d;
            }
            A.set(j, temp);
        }
        return A;
    }
}
