package sort;
/*
 * 插入排序
 * 从第一个元素开始，该元素可以认为已被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素大于已经排序的元素，则继续向后移动到下一位置，直到找到已排序的元素大于或等于该元素的位置，将新元素插入到该位置中。
 * 
 * 
 * 平均来说插入排序算法的时间复杂度为O(n^2)，空间复杂度O(1), 稳定型
 */
public class InsertSort extends SortDemo{
	
	@Override
	public int[] sort(int[] m) {

		print("initial", m);
		
		for(int i=1; i<m.length; i++){
			for(int j=i; j>0; j--){
				if(m[j-1]>m[j]){
					swap(m,j-1,j);
				}
			}
			print("step"+i,m);
		}
		
		return m;
	}
	
	public static void main(String[] args){
		int[] data =new int[]{1,3,2,8,4,5,9,6,7,10,0};
		print("charu",new InsertSort().sort(data));
	}
	
}
