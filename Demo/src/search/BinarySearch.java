package search;

public class BinarySearch {
	public int binarySearch(double a, double[] b){
		int low = 0;
		int high = b.length-1;
		while((high-low) >= 0){		
			int middle= (low+high) / 2;

			if(a==b[middle]){
				return middle;
			}
			if(a<b[middle]){
				high = middle-1;
			}else{
				low = middle+1;
			}
		}		
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		double[] b = new double[]{1,2,3,4,6,7,8,9};
		System.out.println(bs.binarySearch(5, b));
	}
}
