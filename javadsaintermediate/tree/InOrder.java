package javadsaintermediate.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrder {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode lr=new TreeNode(6);
        root.left=lr;
//        TreeNode lr1=new TreeNode(4);
//        lr.left=lr1;
//        TreeNode lr2=new TreeNode(5);
//        lr.right=lr2;
        TreeNode rl=new TreeNode(2);
        root.right=rl;
        TreeNode rl1=new TreeNode(3);
        rl.left=rl1;
//        TreeNode rl2=new TreeNode(7);
//        rl.right=rl2;
        ArrayList<Integer> ans=new ArrayList<>();
        ans=inOrderTraversalWithoutRecursion(root);
        for(Integer ele: ans){
            System.out.print(ele+" ");
        }
    }

    public static ArrayList<Integer> inOrderTraversalWithoutRecursion(TreeNode A){
        ArrayList<Integer> answer=new ArrayList<>();
        Stack s1=new Stack();

        while(A!=null || !s1.isEmpty()){
            if(A!=null){
                s1.push(A);

                A=A.left;
            }else{
                TreeNode t=(TreeNode)s1.pop();
                answer.add(t.val);
                A=t.right;
            }
        }
        return answer;
    }
}
