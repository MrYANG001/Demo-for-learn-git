package offer;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж���������
 */
public class Title9 {
	public int JumpFloorII(int target) {
		if(target <= 0) {
			return -1;
		}
		if(target == 1) {
			return 1;
		}else {
			return 2*JumpFloorII(target-1);
		}
	}
	public static void main(String[] args) {
		Title9 tit = new Title9();
		System.out.println(tit.JumpFloorII(31));
	}
}
