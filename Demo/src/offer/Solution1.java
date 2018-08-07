package offer;

import java.util.Stack;

/*
 * ¶þ²æÊ÷µÄ¾µÏñ
 */


class TreeNode1 {
    int val = 0;
    TreeNode1 left = null;
    TreeNode1 right = null;

    public TreeNode1(int val) {
        this.val = val;

    }

}

public class Solution1 {
	public void Mirror(TreeNode1 root) {
		if(root == null) {
			return;
		}
		if(root.left == null && root.right==null) {
			return;
		}
		TreeNode1 treenode = root.left;
		root.left = root.right;
		root.right = treenode;
		
		if(root.left != null) {
			Mirror(root.left);
		}
		if(root.right != null) {
			Mirror(root.right);
		}
	}
	
	public void Mirror2(TreeNode1 root) {
		if(root== null) {
			return;
		}
		Stack<TreeNode1> stack = new Stack<TreeNode1>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode1 treenode = stack.pop();
			if(treenode.left != null || treenode.right != null ) {
				TreeNode1 temp = treenode.left;
				treenode.left = treenode.right;
				treenode.right = temp;				
			}
			if(treenode.left != null) stack.push(treenode.left);
            if(treenode.right != null) stack.push(treenode.right);
		}
		
		
	}
}
