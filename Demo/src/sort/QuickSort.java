package sort;

/*
 * 快速排序：
 * 
 *   （1） 如果不多于1个数据，直接返回。 
 *   （2） 一般选择序列最左边的值作为支点数据。 
 *   （3） 将序列分成2部分，一部分都大于支点数据，另外一部分都小于支点数据。 
 *   （4） 对两边利用递归排序数列。
 *   
 *   
 *   平均时间复杂度O(nlogn), 空间复杂度O(logn), 不稳定
 */

public class QuickSort extends SortDemo{
	public static void quickSort(int[] a, int low, int high) {
		int i, j, index;
		if(low > high) {
			return;
		}
		
		i = low;
		j = high;
		index = a[i]; //用子表的第一个记录作基准
		// 从表的两端交替向中间扫描
		while(i < j){
			while(i<j && a[j] >= index) {
				j--;
			}
			if(i<j) {
				// 用比基准小的记录替换低位记录
				a[i++] = a[j];
			}
			while(i < j && a[i] < index) {
				i++;
			}
			if(i<j) {
				// 用比基准大的记录替换高位纪录
				a[j--] = a[i];
			}
		}		
		a[i] = index; // 将基准数值替换回 a[i]
		print("step",a);
		
		quickSort(a, low, i-1); // 对低子表进行递归排序
		quickSort(a, i+1, high); // 对高子表进行递归排序
	}
	
	@Override
	public int[] sort(int[] a) {
		quickSort(a, 0, a.length-1);
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {49, 38, 65, 97, 76, 13, 27, 49};
		print("initial", a);
		print("quicksort", new QuickSort().sort(a));
	}

	
}
