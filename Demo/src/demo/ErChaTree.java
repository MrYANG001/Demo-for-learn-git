package demo;
/*
 * �ö������ķ���Ѱ�Ҷ�ά�������Ƿ�����Ŀ��ֵ��ͬ��ֵ
 * 
 * �ö�ά����ÿ�д����ң�ÿ�д��ϵ��½���
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
