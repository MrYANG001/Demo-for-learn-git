package demo;
import java.util.Scanner;
/*
 * 鏈�鍙冲潗鏍囩偣闂
 */
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = sc.nextInt();
		int[] x = new int[count];
		int[] y = new int[count];
		int[] z = new int[count];
		
		while(count>0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			x[x.length-count] = m;
			y[x.length-count] = n;
			count--;
		}
		 count = x.length;
		
		for(int i=0; i<count; i++){
			for(int j=0; j<count; j++){
				
				if (i == count-1 && j == count-1) {
					z[i]=1;
				}
				
				if (j == i) {
					continue;
				}
				if (x[i] <= x[j] && y[i] <= y[j]) {
					break;
				}
	
				if (j == count-1) {
					z[i]=1;
				}
			}
		}
		
		for(int k=0; k<count; k++){
			if(z[k] == 1){
				System.out.println(x[k] + " " + y[k]);
			}
		}
				
	}
		
		
		
				
//	}
	
//	public static ArrayList<String> maxIntPoints(ArrayList<String> points) {
//		ArrayList<String> maxPoints = new ArrayList<String>();
//
//		for (int i = 0; i < points.size(); i++) {
//
//			String point = points.get(i);
//			String[] xy = point.split(" ");
//
//			int x = Integer.valueOf(xy[0]);
//			int y = Integer.valueOf(xy[1]);
//
//			for (int j = 0; j < points.size(); j++) {
//				
//				if (i == points.size()-1 && j == points.size()-1) {
//					maxPoints.add(point);
//				}
//				
//				if (j == i) {
//					continue;
//				}
//
//				String temp = points.get(j);
//
//				String[] temp_xy = temp.split(" ");
//
//				int temp_x = Integer.valueOf(temp_xy[0]);
//				int temp_y = Integer.valueOf(temp_xy[1]);
//
//				if (x <= temp_x && y <= temp_y) {
//					break;
//				}
//
//				if (j == points.size()-1) {
//					maxPoints.add(point);
//				}
//			}
//
//		}
//
//		return maxPoints;
//	}
//
//	public static void main(String[] args) {
//		ArrayList<String> points = new ArrayList<String>();
//		points.add("1 2");
//		points.add("5 3");
//		points.add("4 6");
//		points.add("7 5");
//		points.add("9 0");
//
//		System.out.println("maxIntPoints:" + maxIntPoints(points));
//
//	}


}
