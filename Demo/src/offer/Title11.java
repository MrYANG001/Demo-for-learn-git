package offer;
/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class Title11 {
	public int NumberOf1(int n) {
		int count =0;
		while(n!=0) {
			count++;
			n= (n-1) & n;
		}
		return count;
    }
	public static void main(String[] args) {
		Title11 tit = new Title11();
		System.out.println(tit.NumberOf1(5));
	}
}
