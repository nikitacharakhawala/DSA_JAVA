package javadsaintermediate.tree;

import sun.reflect.generics.tree.Tree;

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode tree1=new TreeNode(1);
        TreeNode tl1=new TreeNode(2);
        tree1.left=tl1;
        TreeNode tr1=new TreeNode(3);
        tree1.right=tr1;

        TreeNode tree2=new TreeNode(1);
        TreeNode tl2=new TreeNode(2);
        tree2.left=tl2;
        TreeNode tr2=new TreeNode(3);
        tree2.right=tr2;

        System.out.println(isSameTree(tree1, tree2));

    }

    public static int isSameTree(TreeNode tree1, TreeNode tree2){

       if(tree1==null && tree2==null)
           return 1;
       if(tree1==null || tree2==null)
           return 0;
        if(tree1.val!=tree2.val)
            return 0;
        return isSameTree(tree1.left, tree2.left);
    }
}
