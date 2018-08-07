package offer;
/*
 * 矩阵一个端点到另一个端点的路径数
 */
public class Solution3 {
//	public int run(int n) {
//		int count = run(n,n);
//		return count;
//	}
//	public int run(int n, int m) {
//		if(n==0 || m==0) {
//			return 1;
//		}
//		if (n<0 || m<0) {
//			return 0;
//		}
//		return run(n-1, m)+run(n,m-1);	
//	}
	 
	public int run(int n) {
		int[][] a = new int[n+1][n+1];
		for(int i=0; i<n+1; i++) {
			a[0][i] = 1;
			a[i][0] = 1;
		}
		int count = run(a,n,n);
		return count;
	}
	public int run(int[][] a, int n, int m) {
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				a[i][j] = a[i-1][j] + a[i][j-1];
			}
		}
		return a[n][m];
	}
	public static void main(String[] args) {
		
		Solution3 sol = new Solution3();
		System.out.println(sol.run(1));
	}
}
