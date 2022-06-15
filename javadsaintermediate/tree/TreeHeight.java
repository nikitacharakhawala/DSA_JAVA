package javadsaintermediate.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;

public class TreeHeight {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode lr = new TreeNode(4);
        root.left = lr;
        TreeNode lr1 = new TreeNode(2);
        lr.left = lr1;
        TreeNode lr2 = new TreeNode(3);
        root.right = lr2;
//        TreeNode rl = new TreeNode(3);
//        root.right = rl;
//        TreeNode rl1 = new TreeNode(6);
//        rl.left = rl1;
//        TreeNode rl2 = new TreeNode(7);
//        rl.right = rl2;
        System.out.println(treeHeight(root));
    }

    public static int treeHeight(TreeNode root){
        if(root==null)
            return 0;
        int lr=treeHeight(root.left);
        int rl=treeHeight(root.right);
        return Math.max(lr,rl)+1;
    }
}
