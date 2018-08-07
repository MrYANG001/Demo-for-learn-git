package sort;
/*
 * 1.找到数组中最小的那个元素
 * 2.将最小的这个元素和数组中第一个元素交换位置
 * 3.在剩下的元素中找到最小的的元素，与数组第二个元素交换位置
 * 
 * 
 * 效率：对于长度为N的数组，选择排序需要大约N²/2次比较和N次交换。
 *       也即最好、最差、平均时间效率均为O（n²），只需要一个辅助变量帮助交换元素。空间复杂度O(1), 不稳定
 */
public class SelectSort extends SortDemo{
	@Override
	public int[] sort(int[] m) {

		print("initial", m);
		
		for(int i=0; i<m.length-1; i++){
			int min = i;
			for(int j=i+1; j<m.length; j++){
				if(m[min]>m[j]){
					min = j;
				}
			}
			swap(m,i,min);
			print("step"+i,m);
		}
		
		return m;	
	}
	
	
	public static void main(String[] args){
		int[] data = new int[]{1,3,2,8,4,5,9,6,7,10,0};
		print("select", new SelectSort().sort(data));
	}
	
}
