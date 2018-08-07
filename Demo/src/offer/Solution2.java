package offer;
/*
 * 迭代方法求取最大值
 */
public class Solution2 {
	int max = Integer.MIN_VALUE;
	public int max(int[] a, int n, int len) {		
		if(n<0) {
			return 0;
		}
		if(n<len) {
			if(max < a[n]) {
				max = a[n];
			}
			max(a,n+1,len);
		}
		return max;		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int len = a.length;
		Solution2 sol = new Solution2();
		System.out.println(sol.max(a,0,len));
	}
}
