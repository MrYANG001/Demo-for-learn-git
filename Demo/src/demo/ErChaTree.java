package demo;
/*
 * 用二叉树的方法寻找二维数组中是否有与目标值相同的值
 * 
 * 该二维数组每行从左到右，每列从上到下渐增
 */
public class ErChaTree {
	public boolean Find(int target , int[][] array){
//		for(int i=0; i<array.length; i++){
//			for(int j=0; j<array[0].length; j++){
//				if(array[i][j] == target){
//					return true;
//				}
//			}
//		}
		int len = array.length;
		int i =0;
		while ((len>=0) && (i<array[0].length)) {
			if (array[len][i]>target) {
				len--;
			} else  if (array[len][i]<target) {
				i++;
			} else {
					return true;
			}
		}
		return false;		
	}
}
