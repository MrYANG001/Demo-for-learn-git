package tanXin;

public class LongestDistance {
	
	//求取一个数组中最大差值
	//1. 常规做法
	public int getDis(int[] A, int n) {
		int max = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				int temp = A[i]-A[j];
				if(max < temp){
					max = temp;
				}
			}
		}
		return max;
	}
	
	//2. 贪心算法
	public int getDis1(int[] A, int n) {
				
		int max = 0;
		if(n>1){
			int min = A[0];
			for(int i=1; i<n; i++){
				if(max<A[i]-min){
					max = A[i]-min;
				}
				if(A[i]<min){
					min = A[i];
				}
			}
		}
		return max;
	}


	
	// 数组左部分中的最大值减去右部分最大值的绝对值的最大值
	public int findMaxGap(int[] A, int n) {
        // write code here 
		int max = 0;
		int maxl =0;
        if(n>2){
            for(int i=0; i<n-1; i++){            	
            	int maxr =0;
            	if(A[i]>maxl){
                    maxl = A[i];
                } 
            	
            	for (int j = n-1; j>i; j--) {
	               	 if(A[j]>maxr){
	                      maxr = A[j];
	                    }
            	}
            	if(max < Math.abs(maxl-maxr)){
                    max = Math.abs(maxl-maxr);
                }
            }                                
          }       
        return max;
    }
	// 贪心算法
	 public int findMaxGap1(int[] A, int n) {
	        // write code here
	        if(A==null || n<1) 
	        	return -1;
	         
	        int max=-1,min;
	        for(int i=0;i<n;i++)
	            if(A[i]>max)
	            max=A[i];
	        min = A[0]>A[n-1]?A[n-1]:A[0];
	        return max-min;
	    }
	
	public static void main(String[] args){
		LongestDistance ld = new LongestDistance();
		int[] matr = new int[]{70,76,65,15,90,92,43,58};
			System.out.println(ld.findMaxGap(matr,8));
		
		}
	
	
		
	// 在字符串A中是否含有字符串B
	public int findAppearance(String A, int lena, String B, int lenb) {
        // write code here 'A include B
        
//        return A.indexOf(B);
		
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		int i, j;
		for(i=j=0; i< lena; i++){
			if(a[i]==b[j]){
				j++;
			}else{
				j=0;
			}
			if(j==lenb){
				return i-lenb+1;
			}
		}
		return -1;	
		
		
//		if(lena == lenb)
//            return A.equals(B) ? 0 : -1;
//        if(lena < lenb)
//            return -1;
//        int i = 0;
//        while(i <= lena-lenb){
//            if(A.charAt(i) == B.charAt(0)){
//                if(A.substring(i, i+lenb).equals(B)){
//                    return i;
//                }
//            }
//            i++;
//        }
//        return -1;
	}
	
	// 判断A是否能被B匹配(如果两个字符串中所含字符的个数和对应的字符都相等，我们说这两个字符串匹配)        
	// "qxajhumxjodz",12,"Dxajhumxjod.",12
	    public boolean chkWildMatch(String A, int lena, String B, int lenb) {
	        // write code here
	        if(lena>300 || lenb >300){
	            return false;
	        }
	        char[] a = A.toCharArray();
	        char[] b = B.toCharArray();
	        int i, j;
	        int m = lena - lenb + 1;
	        for(i=j=0; i<lenb; i++){
	            if(b[i] != '.' && b[i] != '*'){
	               if(a[j]==b[i]){
	                   j++;
	               }else{
	                   j=0;
	               }
	                if(j==lena){
	                    return true;
	                }
	            }else if(b[i] == '.'){
	            	if(i<lenb-1 && b[i+1] == '*'){
	            		return true;
	            	}else{
	            		j++;
	            	}
	            }else{
	                while(a[j]==a[j-1] && ((m--)>0)){	                  
	                  j++;  
	                }
	            }           
	        }
	        return false;
	    }
//		public static void main(String[] args){
//		LongestDistance ld = new LongestDistance();
//			System.out.println(ld.chkWildMatch("aaaabcd",7,"a*abcd",6));
//		}
		
	
	// n维矩阵顺时针旋转90度
	public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        if(n > 300 ){
           return null; 
        }
        int[][] mat1 = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat1[i][j] = mat[n-1-j][i];
            }
        }
        return mat1;
    }
	
// python :  return [x[::-1] for x in zip(*mat)]	
	
//	public static void main(String[] args){
//		LongestDistance ld = new LongestDistance();
//		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] mat1 = ld.rotateMatrix(mat, 3);
//		for(int i=0; i<3; i++){
//			
//			System.out.println(mat1[i][2]);
//		}
//	}
	
}
