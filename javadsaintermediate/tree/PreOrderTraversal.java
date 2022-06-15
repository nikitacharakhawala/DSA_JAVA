package javadsaintermediate.tree;
/**
 * Q2. Preorder Traversal
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 *
 * Problem Description
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.
 *
 * NOTE: Using recursion is not allowed.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= number of nodes <= 105
 *
 *
 *
 * Input Format
 *
 * First and only argument is root node of the binary tree, A.
 *
 *
 *
 * Output Format
 *
 * Return an integer array denoting the preorder traversal of the given binary tree.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Input 2:
 *
 *    1
 *   / \
 *  6   2
 *     /
 *    3
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [1, 2, 3]
 *
 * Output 2:
 *
 *  [1, 6, 2, 3]
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  The Preoder Traversal of the given tree is [1, 2, 3].
 *
 * Explanation 2:
 *
 *  The Preoder Traversal of the given tree is [1, 6, 2, 3].
 */

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left=null;
        right=null;
    }
}

public class PreOrderTraversal {
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
        ans=preOrderTraversalWithoutRecursion(root);
        for(Integer ele: ans){
            System.out.print(ele+" ");
        }
    }

    public static ArrayList<Integer> preOrderTraversal(TreeNode root, ArrayList<Integer> A){
           if(root==null)
               return A;
           A.add(root.val);
           preOrderTraversal(root.left, A);
           preOrderTraversal(root.right, A);
           return A;
    }

    public static ArrayList<Integer> preOrderTraversalWithoutRecursion(TreeNode root){
        Stack s1=new Stack();
        s1.push(root);
        ArrayList<Integer> answer=new ArrayList<>();
        while(!s1.isEmpty()){
            TreeNode t=(TreeNode) s1.pop();
            answer.add(t.val);
            if(t.right!=null){
                s1.push(t.right);
            }
            if(t.left!=null){
                s1.push(t.left);
            }
        }
        return answer;
    }
}
