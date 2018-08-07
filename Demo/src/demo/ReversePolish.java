package demo;

import java.util.Stack;

public class ReversePolish {
	public static int evalRPN(String[] m) {
		int result = 0;
		String operators = "+-*/"; 
		Stack<String> stack = new Stack<String>();
		for(String i : m) {
			if(!operators.contains(i)) {
				stack.push(i);
			}else {
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());
				
				switch (i) {
				case "+":
					stack.push(String.valueOf(a + b));
					break;
					
				case "-":
					stack.push(String.valueOf(a - b));
					break;
					
				case "*":
					stack.push(String.valueOf(a * b));
					break;
					
				case "/":
					stack.push(String.valueOf(a / b));
					break;

				}				
			}
		}
		result = Integer.valueOf(stack.pop());
		return result;		
	}
	public static void main(String[] args) {
		String[] str= new String[]{"2", "3", "+", "4", "*"};
		System.out.println(evalRPN(str));
	}
}
