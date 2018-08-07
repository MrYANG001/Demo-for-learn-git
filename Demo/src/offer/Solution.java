package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



/*
 * 从上往下，从左往右打印二叉树
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class Solution {
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	if(root == null) {
        		return list;
        	}
        	Queue<TreeNode> queue = new LinkedList<TreeNode>();
        	queue.offer(root);
        	while(!queue.isEmpty()) {
        		TreeNode treenode = queue.poll();
        		if(treenode.left != null) {
        			queue.offer(treenode.left);
        		}
        		if(treenode.right != null) {
        			queue.offer(treenode.right);
        		}
        		list.add(treenode.val);
        	}
        	
			return list;
            
        }
 }
