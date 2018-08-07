package offer;
/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
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
