package sort;

/*
 * 堆排序（大顶堆）： 
 *  1.初始化操作：将R[1..n]构造为初始堆； 
 *  2.每一趟排序的基本操作：将当前无序区的堆顶记录R[1]和该区间的最后一个记录交换，然后将新的无序区调整为堆(亦称重建堆)。
 * 注意： 
 *  1.只需做n-1趟排序，选出较大的n-1个关键字即可以使得文件递增有序。 
 *  2.用小根堆排序与利用大根堆类似，只不过其排序结果是递减有序的。
 *  堆排序和直接选择排序相反：在任何时刻堆排序中无序区总是在有序区之前，且有序区是在原向量的尾部由后往前逐步扩大至整个向量为止。
 *  
 *  
 *  堆排序平均时间复杂度O(nlogn), 空间复杂度O(1), 不稳定
 */

public class HeapSort extends SortDemo{
/*
 * 大顶堆
 */
	public static void adjustHeap(int[] a, int i, int len) {
		int temp, j;
		temp = a[i];
		for(j=2*i; j<len; j*=2) { // 沿关键字较大的孩子节点向下筛选
			if(a[j]<a[j+1]) {
				++j; // j为关键字中较大记录的下标
			}
			if(temp >= a[j]) {
				break;
			}
			a[i] = a[j];
			i = j;
		}
		a[i] = temp;
	}

	@Override
	public int[] sort(int[] a) {
		int i;
		for(i = a.length/2-1; i>=0; i--) { // 构建一个大顶堆
			adjustHeap(a, i, a.length-1);
			print("step", a);
		}
		for(i=a.length-1; i>=0; i--) {  // 将堆顶记录和当前未经排序子序列的最后一个记录交换
			swap(a, 0, i);
			print("step", a);
			adjustHeap(a, 0, i-1); // 将a中前i-1个记录重新调整为大顶堆
			print("step", a);
		}	
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {51, 46, 20, 18, 65, 97, 82, 30, 77, 50, 10};
		print("initial",a);
		print("heapsort", new HeapSort().sort(a));
	}
}
