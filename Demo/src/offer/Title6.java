package offer;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 *  NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0
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
