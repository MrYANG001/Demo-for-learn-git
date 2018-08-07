package offer;

import java.util.ArrayList;

public class Test {
	ArrayList<Integer> list = new ArrayList<Integer>();
	int max=Integer.MIN_VALUE;
	public int printListFromTailToHead(int[] a, int i){		
		if(i<a.length) {	
			if(max < a[i]) {
				max = a[i];
			}
			printListFromTailToHead(a, i+1);			
//			list.add(a[i]);				
		}		
		return max;		
	}
//	public static void main(String[] args) {
//		int[] in = {1,2,3,4,5,6,7,8,9};
//		Test tes = new Test();
//		System.out.println(tes.printListFromTailToHead(in,0));
//	}
	
	public static void main(String[] args) {
		
		Integer a =new Integer(127);
		Integer b = 127;
		Integer d = 127;
		int c = 127;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		System.out.println(b==d);
	}
}
