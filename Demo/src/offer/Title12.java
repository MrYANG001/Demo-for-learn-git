package offer;
/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Title12 {
	public double Power(double base, int exponent) {
		if(exponent > 0) {
			double temp = base;
			for(int i =1; i<exponent; i++) {
				base *= temp;
			}
			return base;
		}
		if(exponent < 0) {
			exponent = -exponent;
			if(base != 0) {
				double temp = base;
				for(int i =1; i<exponent; i++) {
					base *= temp;
				}
				return 1/base;
			}else {
				return -1;
			}
		}else {
			return 1;
		}		
	}
	public static void main(String[] args) {
		Title12 tit = new Title12();
		System.out.println(tit.Power(3, 2));
	}
}
