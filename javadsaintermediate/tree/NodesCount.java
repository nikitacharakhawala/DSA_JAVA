package javadsaintermediate.tree;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class NodesCount {
    static int count=0;
    public static void main(String[] args) {
        TreeNode tree1=new TreeNode(1);
        TreeNode tl1=new TreeNode(4);
        tree1.left=tl1;
        TreeNode tl11=new TreeNode(2);
        tl1.left=tl11;
        TreeNode tr1=new TreeNode(3);
        tree1.right=tr1;
        int max=Integer.MIN_VALUE;
        System.out.println(countingNodes(tree1, max));
    }

    public static int countingNodes(TreeNode tree, int max){
        if(tree==null)
            return 0;
        if(tree.val>max){
            max=tree.val;
            count++;
        }
        countingNodes(tree.left, max);
        countingNodes(tree.right, max);
        return count;
    }
}
