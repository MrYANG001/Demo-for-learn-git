package sort;


public abstract class SortDemo {
	public abstract int[] sort(int[] a);
	
	public static void print(int[] a) {
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			if(i==a.length-1) {
				System.out.println(a[i]+"]");
			}else {
				System.out.print(a[i]+",");
			}
		}
	}
	
	public static void print(String name, int[] a) {
		System.out.print(name + ": ");
		System.out.print("[");
		for(int i=0; i<a.length; i++) {
			if(i==a.length-1) {
				System.out.println(a[i]+"]");
			}else {
				System.out.print(a[i]+",");
			}
		}
	}
	
	public static void swap(int[] source,int a, int b){
		int temp ;
		temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
	
}
