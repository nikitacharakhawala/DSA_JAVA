package javadsaintermediate.tree;

import sun.reflect.generics.tree.Tree;

public class BSTInRanges {

    public static void main(String[] args) {
        TreeNode A=new TreeNode(15);
        TreeNode rLeft=new TreeNode(12);
        A.left=rLeft;

        TreeNode rLeft1=new TreeNode(10);
        rLeft.left=rLeft1;

        TreeNode rLeftR1=new TreeNode(14);
        rLeft.right =rLeftR1;

        TreeNode rLeft11=new TreeNode(8);
        rLeft1.left=rLeft11;

        TreeNode rRight=new TreeNode(20);
        A.right=rRight;

        TreeNode rRightL1=new TreeNode(16);
        rRight.left=rRightL1;

        TreeNode rRightR1=new TreeNode(27);
        rRightL1.right=rRightR1;

        int B=12;
        int C=20;

        System.out.println(nodeCountInRange(A, B, C));


    }


    public static int nodeCountInRange(TreeNode A, int B, int C){
        int count=0;
        if(A==null)
            return 0;
        int left=nodeCountInRange(A.left, B,C);

        int right=nodeCountInRange(A.right,B,C);

        if(A.val>=B && A.val<=C){
            count=1;
        }

        return left+right+count;

    }
}
