package offer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] in = new int[10];
		for (int i = 0; i < str.length(); i++) {
			in[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
		}
		String res = "";
		int temp = Integer.MAX_VALUE;
		int j = -1;
		for (int i = 1; i < in.length; i++) {
			if (in[i] == 0) {
				res = res + i;
				break;
			} else {
				if (in[i] < temp) {
					temp = in[i];
					j = i;
				}
				in[i]--;
			}

			if (i == in.length - 1) {
				res = res + j;
				i = -1;
			}
		}
		System.out.println(res);
	}
}
