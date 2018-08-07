package offer;
/*
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *  NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
 */
public class Title6 {
//	public int minNumberInRotateArray(int [] array) {
//		int len = array.length;
//		if(len == 0) {
//			return 0;
//		}
//		
//		for(int i=0; i<len-1; i++) {
//			if(array[i] >array[i+1]) {
//				return array[i+1];
//			}
//		}
//		return array[0];	    
//    }
	
	public int minNumberInRotateArray(int [] array) {
		int len = array.length;
		int start = 0;
		int end = len-1;
		int mid=0;
		if(len==0) {
			return 0;
		}
		
		while(array[start] >= array[end]) {
			if(end - start == 1) {
				mid = end;
				break;
			}
			
			mid = (start + end)/2;
//			mid = start+ (end-start)/2;
			
			if (array[start] == array[mid] && array[start] == array[end]) {
				for (int i = 0; i < len - 1; i++) {
					if (array[i] > array[i + 1]) {
						return array[i + 1];
					}
				}
			}
			if(array[start] > array[mid]) {
				end = mid;
			}else {
				start = mid;
			}
		}
		return array[mid];		
	}
	
	public static void main(String[] args) {
		Title6 tit = new Title6();
		int[] in = {3,4,5,1,2};
//		int[] in = {1,1,1,0,1};
		System.out.println(tit.minNumberInRotateArray(in));
	}
}
