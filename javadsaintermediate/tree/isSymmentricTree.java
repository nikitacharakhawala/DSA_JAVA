package javadsaintermediate.tree;

public class isSymmentricTree {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(1);
        TreeNode rLeft=new TreeNode(2);
        A.left=rLeft;

        TreeNode rLeft1=new TreeNode(3);
        rLeft.left=rLeft1;

        TreeNode rLeftR1=new TreeNode(4);
        rLeft.right =rLeftR1;

//        TreeNode rLeft11=new TreeNode(8);
//        rLeft1.left=rLeft11;

        TreeNode rRight=new TreeNode(2);
        A.right=rRight;

        TreeNode rRightL1=new TreeNode(4);
        rRight.left=rRightL1;

        TreeNode rRightR1=new TreeNode(4);
        rRightL1.right=rRightR1;


       System.out.println(symmentricTree(A));


    }

    public static int symmentricTree(TreeNode A){
        if(A==null){
            return 1;
        }
       if(A.left==null && A.right==null)
           return 1;
       if(A.left==null || A.right==null)
           return 0;
       if(A.left.val==A.right.val)
           return 1;

       return (symmentricTree(A.left)==1 && symmentricTree(A.right)==1) ? 1 : 0;

    }
}
