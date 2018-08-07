package demo;

import java.io.*;

public class UniformDistributionDemo {

	public static void main(String[] args) throws IOException {
		getUniformDistribution(1);
		
	}
	
	public static double getUniformDistribution(int n) throws IOException{
		FileWriter fw = new FileWriter("UniformDistributionNumber.txt");
		BufferedWriter bufw = new BufferedWriter(fw);
		double [] x = new double [1000*n+2];
		//double y = Math.random()*(1-0.99)+0.99;
		int i=0;
		x[0]=0;
		String str[] = new String[1000*n+2];
		double cdf = getUniformDistributionMethod(x[i]);
		while(cdf < 1)
		{
			i++;
			x[i]=x[i-1]+0.00001/n;
			str[i] = Double.toString(x[i]);
		//	System.out.println(x[i]);
			cdf =getUniformDistributionMethod(x[i]);
		//	System.out.println("概率是="+cdf);
		//	System.out.println("个数="+i);
			bufw.write(str[i]);
		    bufw.newLine();
		    bufw.flush();
		    bufw.close();
		}
			return x[i];		
	}
	public static double getUniformDistributionMethod(double k){
		double num=0;
		double a = 0;
		double b = 0.01;
		if( k < a)
		{
			num = 0;
		}else if(a <= k&&k < b)
		{
			num = (k-a)/(b-a);
		}else
		{
			num = 1;
		}	
		return num;
	}
}
