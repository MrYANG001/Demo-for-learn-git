package demo;

import java.util.Scanner;

public class Fibonacci {
	public static int k =0;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		long a = cin.nextLong();
		System.out.println(fibonacci(a));
		System.out.println("π≤µ›πÈ¡À"+k+"¥Œ");
	}
	public static long fibonacci(long m){
		if(m==0||m==1){
			k++;
			return m;
		}else{
			return fibonacci(m-1)+fibonacci(m-2);
		}
	}
}