package sort;
/* 冒泡排序
 *   1、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *   2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 *   3、针对所有的元素重复以上的步骤，除了最后一个。
 *   4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *   
 *   
 *   最差时间复杂度O(n^2),最优时间复杂度O(n),平均时间复杂度O(n^2)，空间复杂度O(1), 稳定
 * */
public class BubbleSort extends SortDemo{
	
	@Override
	public int[] sort(int[] m) {
		
		print("initial", m);
		
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m.length-i-1; j++){
				if(m[j]>m[j+1]){
					swap(m,j,j+1);
				}
			} 			
			print("step"+i, m);
		}
		return m;
	}
	
	public static void main(String[] args){
		int[] data = new int[]{1,3,2,8,4,5,9,6,7,10,0};
		print("maopao",new BubbleSort().sort(data));
	}	
}
