package offer;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж���������
 */
public class Title8 {
	public int JumpFloor(int target) {
		if(target <=0) {
			return target;
		}		
		int one = 1;
		int two = 2;
		int temp = 0;
		for(int i=3; i<= target; i++) {
			temp = one + two;
			one = two;
			two = temp;
		}
		return temp;
	}
	public static void main(String[] args) {
		Title8 tit = new Title8();
		System.out.println(tit.JumpFloor(10));
	}
}
