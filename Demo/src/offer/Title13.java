package offer;

import java.util.ArrayList;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Title13 {
	public void reOrderArray(int[] array) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0) {
				list2.add(array[i]);
			}else {
				list1.add(array[i]);
			}
		}
		for(int i=0; i<array.length; i++) {
			if(i<list1.size()) {
				array[i] = list1.get(i);
			}else {
				array[i] = list2.get(i);
			}
		}
	}
}
