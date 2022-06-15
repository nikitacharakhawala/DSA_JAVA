package javadsaintermediate.tree;

import sun.reflect.generics.tree.Tree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(1);
        TreeNode rLeft=new TreeNode(2);
        A.left=rLeft;

        TreeNode rLeft1=new TreeNode(4);
        rLeft.left=rLeft1;

        TreeNode rLeftR1=new TreeNode(5);
        rLeft.right =rLeftR1;

//        TreeNode rLeft11=new TreeNode(8);
//        rLeft1.left=rLeft11;

        TreeNode rRight=new TreeNode(3);
        A.right=rRight;

        TreeNode rRightL1=new TreeNode(6);
        rRight.left=rRightL1;

        TreeNode rRightR1=new TreeNode(7);
        rRightL1.right=rRightR1;


       invertBinaryTree(A);


    }

    public static TreeNode invertBinaryTree(TreeNode A){
        if(A==null)
            return A;
        TreeNode left=invertBinaryTree(A.left);
        TreeNode right=invertBinaryTree(A.right);
        A.left=right;
        A.right=left;
        return A;
    }
}
