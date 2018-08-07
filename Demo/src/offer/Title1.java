package offer;
/*
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
 * ����������һ����ά�����һ���������ж��������Ƿ��и�������
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
