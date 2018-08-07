package offer;
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ�������������
 */


// Definition for binary tree
class TreeNode2 {
	int val;
	TreeNode2 left;
	TreeNode2 right;

	TreeNode2(int x) {
		val = x;
	}
}
 

public class Title4 {
	public TreeNode2 reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode2 root = reConstructBinaryTree(pre,0, pre.length-1, in, 0, in.length-1);
		return root;
	}
	public TreeNode2 reConstructBinaryTree(int[] pre, int startpre, int endpre, int[] in, int startin, int endin) {
		if(startpre > endpre || startin > endpre) {
			return null;
		}
		
		TreeNode2 root = new TreeNode2(pre[startpre]);
		for(int i=0; i<endpre; i++) {
			if(in[i] == pre[startpre]) {
				root.left = reConstructBinaryTree(pre, startpre+1, startpre + i-startin, in, startin, i-1);
				root.right = reConstructBinaryTree(pre, startpre+i-startin+1, endpre, in, i+1,endin);
			}
		}
		
		return root;
	}
}
