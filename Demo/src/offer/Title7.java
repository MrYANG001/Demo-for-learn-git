package offer;
/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�n<=39
 */
public class Title7 {
	public int Fibonacci(int n) {
		if(n<0) {
			return -1;
		}		
		int[] record = new int[n+1];
		record[0] = 0;
		record[1] = 1;
		
		for(int i=2; i<=n; i++) {
			record[i] = record[i-1] +record[i-2];	
			}
		return record[n];

    }
	public static void main(String[] args) {
		Title7 tit = new Title7();
		System.out.println(tit.Fibonacci(100));
	}
}
