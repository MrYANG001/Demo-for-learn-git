package offer;

import java.util.ArrayList;
import java.util.List;

class Test3  {
	public static void main(String[] args) {
		Test3 t = new Test3();
		String str = "nae";
//		String ll = t.change(str);
		str.replace('a', 'e');
		method();
		System.out.println(str);
//		System.out.println(ll);
	}
	
	String change(String s) {
//		s.replace('A', 'E');
		s.toLowerCase();
		return s;
	}
	
	public static void method() {
		List<?> list = new ArrayList<Object>();
		synchronized(list) {
			System.out.println(System.currentTimeMillis());
		}
	}
}
