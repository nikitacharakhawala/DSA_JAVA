package javadsaintermediate.tree;

public class TotalNodesCount {
    public static void main(String[] args) {
        TreeNode tree1=new TreeNode(1);
        TreeNode tl1=new TreeNode(4);
        tree1.left=tl1;
        TreeNode tl11=new TreeNode(2);
        tl1.left=tl11;
        TreeNode tr1=new TreeNode(3);
        tree1.right=tr1;
        System.out.println(totalNodeCount(tree1));
    }

    public static int totalNodeCount(TreeNode A){
        if(A==null)
            return 0;
        int lr=totalNodeCount(A.left);
        int rl=totalNodeCount(A.right);
        return lr+rl+1;
    }
}
