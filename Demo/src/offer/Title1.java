package offer;
/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Title1 {
	public boolean Find(int target, int [][] array) {
		int m = array.length;
		int n = array[0].length;
		int i = 0;
		while(m>=0 && i<n) {
			if(target > array[m-1][i]) {
				i++;
			} else if(target <array[m-1][i]) {
				m--;
			}else {
				return true;
			}
		}
		return false;	
    }
	
	public static void main(String[] args) {
		int[][] in = {{1,2,8,9},{2,4,9,12}, {4,7,10,13},{6,8,11,15}};
		int target = 7;
		Title1 tit = new Title1();
		System.out.println(tit.Find(target,in));
	}
}
