package javadsaintermediate.tree;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import javadsaintermediate.tree.TreeNode;

public class postOrderTraversal {
    public static void main(String[] args) {

            TreeNode root=new TreeNode(1);
            TreeNode rl=new TreeNode(6);
            root.left=rl;
            TreeNode rr=new TreeNode(2);
            root.right=rr;
            TreeNode rrl=new TreeNode(3);
            rr.left=rrl;
            for(Integer ele: postOrderTraversal(root)){
                System.out.print(ele+" ");
            }
    }

    public static ArrayList<Integer> postOrderTraversal(TreeNode root){
       Stack s1=new Stack();
       s1.push(root);
       ArrayList<Integer> answer=new ArrayList<>();
       while(!s1.isEmpty()){
           TreeNode t=(TreeNode)s1.pop();
           answer.add(t.val);
           if(t.left!=null){
               s1.push(t.left);
           }
           if(t.right!=null){
               s1.push(t.right);
           }
       }
        Collections.reverse(answer);
       return answer;
    }
}
