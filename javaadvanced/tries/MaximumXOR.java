package javaadvanced.tries;

import sun.font.BidiUtils;

import java.util.ArrayList;
import java.util.HashMap;

class BitNode{
    Integer num;
    BitNode left;
    BitNode right;

    boolean isTerminal;

    BitNode(Integer num){
        this.num=num;
        isTerminal=false;
        left=null;
        right=null;

    }
}
public class MaximumXOR {
    static BitNode root=new BitNode(null);

    public static void main(String[] args) {
        int[] A={1, 2, 3, 4, 5};
        System.out.println(getMaximumXOR(A));
    }

    public static int getMaximumXOR(int[] A){
        int maxXOR=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            insertInTries(A[i]);
        }
        for(int i=0;i<A.length;i++){
            maxXOR=Math.max(maxXOR, getMaxXOR(A[i]));
        }
        return maxXOR;
    }

    public static int getMaxXOR(int A){
        int bestNum=0;
        BitNode temp=root;
        for(int i=31;i>=0;i--){
            int num=(A>>i)&1;
            if(num!=0){
                if(temp.right!=null){
                    bestNum=bestNum | (1<<i);
                    temp=temp.right;
                }else{
                    temp=temp.left;
                }
            }else{
                if(temp.left!=null){
                    bestNum=bestNum | (1<<i);
                    temp=temp.left;
                }else{
                    temp=temp.right;
                }
            }
        }
        return bestNum;
    }

    public static void insertInTries(int A){
        BitNode temp=root;
        for(int i=31;i>=0;i--){
            int num=(((A>>i)&1));
            if(num!=0){
                if(temp.left==null){
                    BitNode newNode=new BitNode(1);
                    temp.left=newNode;
                }
                temp=temp.left;
                System.out.print(1);
            }else{
                if(temp.right==null){
                    BitNode newNode=new BitNode(0);
                    temp.right=newNode;
                }
                temp=temp.right;
                System.out.print(0);
            }

        }
        System.out.println();
        temp.isTerminal=true;
    }
}
