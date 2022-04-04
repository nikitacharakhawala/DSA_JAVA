package javadsaintermediate.arrayproblems;

import java.util.*;

public class LeaderInArray {
    public static void main(String[] args) {
        LeaderInArray leaderInArray=new LeaderInArray();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(16, 17, 4, 3, 5, 2));
        leaderInArray.getRightMaxArray(A);

    }

    public ArrayList<Integer> getRightMaxArray(ArrayList<Integer> A){
        ArrayList<Integer> uniqueRightMax=new ArrayList<>();
        ArrayList<Integer> rightMax=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            rightMax.add(0);
        }
        rightMax.set(A.size()-1, A.get(A.size()-1));
        uniqueRightMax.add(rightMax.get(A.size()-1));
        for(int i=A.size()-2;i>=0;i--){
            System.out.println("i:::"+i);
            if(rightMax.get(i+1)<A.get(i)){
                rightMax.set(i, A.get(i));
                if(!uniqueRightMax.contains(rightMax.get(i))) {
                    uniqueRightMax.add(rightMax.get(i));
                }
            }else{
                rightMax.set(i,rightMax.get(i+1));
                if(!uniqueRightMax.contains(rightMax.get(i))) {
                    uniqueRightMax.add(rightMax.get(i));
                }
            }
        }
        for(Integer ele: uniqueRightMax){
            System.out.print(ele+" ");
        }
        System.out.println();
        Collections.reverse(uniqueRightMax);
        for(Integer ele: uniqueRightMax){
            System.out.print(ele+" ");
        }
        System.out.println();
        return uniqueRightMax;
    }
}
