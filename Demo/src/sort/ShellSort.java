package sort;
/*
 *shell排序
 *  1、先取一个小于n的整数d1作为第一个增量，把文件的全部记录分成d1个组。
 *  2、所有距离为d1的倍数的记录放在同一个组中，在各组内进行直接插入排序。
 *  3、取第二个增量d2<d1重复上述的分组和排序，
 *  4、直至所取的增量dt=1(dt<dt-l<…<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。
 *
 *
 *  最坏情况时间复杂度为：O(n^1.5)???? O(n^2),平均时间复杂度为O(nlogn)?? 空间复杂度O(1)，不稳定
 */
public class ShellSort extends SortDemo{

	@Override
	public int[] sort(int[] m) {
		print("initial", m);
		int j = 0;
		int temp = 0;
		for (int increment = m.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < m.length; i++) {
				// System.out.println("i:" + i);
				temp = m[i];
				for (j = i - increment; j >= 0; j -= increment) {
					// System.out.println("j:" + j);
					// System.out.println("temp:" + temp);
					// System.out.println("data[" + j + "]:" + data[j]);
					if (temp < m[j]) {
						m[j + increment] = m[j];
					} else {
						break;
					}
				}
				m[j + increment] = temp;
			}
			print("increment" + increment, m);
		}
		return m;
	}
	public static void main(String[] args){
		int[] data =new int[]{1,3,2,8,4,5,9,6,7,10,0};
		print("shell", new ShellSort().sort(data));
		
	}
}
