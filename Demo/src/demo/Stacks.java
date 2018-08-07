package demo;

import java.util.Stack;
import java.util.Vector;

public class Stacks {
	static String[] months = {"January","2","3","4","5","6","7"};

	public static void main(String[] args) {
		Stacks.stack();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Stacks.vector();
	}
	
	public static void stack(){

		Stack<String> sts = new Stack<String>();
		for (int i = 0; i < months.length; i++) {
			sts.push(months[i] + "");
//			System.out.println("sts=" + sts);
		}
		sts.addElement("The last line");
		System.out.println("element 5=" + sts.elementAt(5));
		System.out.println("popping elements:");
		while (!sts.empty()) {
			System.out.println(sts.pop());

		}
	}
	
	public static void vector(){
		Vector<String> vec = new Vector<String>();
		for(String i:months){
			vec.addElement(i);
		}
		
		while(!vec.isEmpty()){
			System.out.println(vec.firstElement());
			vec.remove(vec.firstElement());
		}
		vec.clear();
	}
}
