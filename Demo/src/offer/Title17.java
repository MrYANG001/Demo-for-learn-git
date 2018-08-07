package offer;

import java.util.Stack;

/*
���������Ķ�����������任ΪԴ�������ľ���
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class Title17 {
	public void Mirror(TreeNode root) {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if(node.left != null || node.right != null) {
				TreeNode nodeleft = node.left;
				TreeNode noderight = node.right;
				node.left = noderight;
				node.right = nodeleft;
			}
			if(node.left != null) stack.push(node.left);
			if(node.right != null) stack.push(node.right);
		}
	}
	
}
