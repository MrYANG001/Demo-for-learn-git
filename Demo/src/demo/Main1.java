package demo;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] in = new int[10]; 
		for (int i = 0; i < str.length(); i++) {
			in[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
		}
		
		if(in[0]+in[1]+in[2]<1 || in[6]+in[7]+in[8]+in[9]>3) {
			System.out.println("null");
		}
		
		Main1 ma = new Main1();
		String minTime = ma.getMin(in);
		String maxTime = ma.getMax(in);		
		if(minTime.equals(maxTime)) {
			System.out.println(minTime); 
		}else {
			System.out.println(minTime+","+maxTime); 
		}
		
	}
	public String getMin(int[] min) {
		String minTime = "";
		
				
		for(int i=0; i<min.length; i++) {
			if(min[i] == 0) {
				continue;
			}else {
				minTime = minTime+i;
				min[i]--;
				i--;
			}
		}
		return minTime;
	}
	
	public String getMax(int[] max) {
		String maxTime = "";
		for(int i=2; i>-1; i--) {
			
			if(max[i] == 0) {
				continue;
			}else{
				maxTime = maxTime + i;
				max[i]--;
			}
			
			if(maxTime.length() == 1 && i==2 ) {
				i = 4;
			}else if(maxTime.length() == 2 || maxTime.length() == 4 ) {
				i = 6;
			}else {
				i = 10;
			}	
		}
		
		return maxTime;		
	}
}
