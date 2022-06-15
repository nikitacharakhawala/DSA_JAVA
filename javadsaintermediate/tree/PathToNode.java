package javadsaintermediate.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Q2. Path to Given Node
 * Unsolved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 *
 * Problem Description
 *
 * Given a Binary Tree A containing N nodes, you need to find the path from Root to a given node B.
 *
 * NOTE:
 *
 *     No two nodes in the tree have the same data values.
 *     You can assume that B is present in tree A and a path always exists.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 105
 *
 * 1 <= Data Values of Each Node <= N
 *
 * 1 <= B <= N
 *
 *
 *
 * Input Format
 *
 * First Argument represents pointer to the root of binary tree A.
 *
 * Second Argument is an integer B denoting the node number.
 *
 *
 *
 * Output Format
 *
 * Return an one-dimensional array denoting the path from Root to the node B in order.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A =
 *            1
 *          /   \
 *         2     3
 *        / \   / \
 *       4   5 6   7
 *
 *  B = 5
 *
 * Input 2:
 *
 *  A =
 *             1
 *           /   \
 *          2     3
 *         / \ .   \
 *        4   5 .   6
 *
 *  B = 1
 *
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  [1, 2, 5]
 *
 * Output 2:
 *
 *  [1]
 *
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  We need to find the path from root node to node with data value 5.
 *  So the path is 1 -> 2 -> 5 so we will return [1, 2, 5]
 *
 * Explanation 2:
 *
 *  We need to find the path from root node to node with data value 1.
 *  As node with data value 1 is the root so there is only one node in the path.
 *  So we will return [1]
 */
public class PathToNode {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        root.left=left;
        TreeNode right=new TreeNode(3);
        root.right=right;
        TreeNode left1=new TreeNode(4);
        left.left=left1;
        TreeNode leftr1=new TreeNode(3);
        left.right=leftr1;
        TreeNode right1=new TreeNode(6);
        right.left=right1;
        TreeNode rightr1=new TreeNode(7);
        right.right=rightr1;
        int x=4;
        ArrayList<Integer> answer=new ArrayList<>();
        getNodePath(root, answer, x);
        for(Integer ele: answer){
            System.out.print(ele+" ");
        }
    }

    public static boolean getNodePath(TreeNode root, ArrayList<Integer> answer, int B){
        if(root==null){
            return false;
        }
        answer.add(root.val);
        if(root.val==B){
            return true;
        }
        if(getNodePath(root.left, answer, B) || getNodePath(root.right, answer, B)){
            return true;
        }
        answer.remove(answer.size()-1);
        return false;


    }
}
