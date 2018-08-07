package demo;

public class MultiplicationTable  {
	public static void main(String[] args)
	{
		for(int x=5; x>0; x--)
		{
			for(int y=0; y<x; y++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		
		for(int x=1; x<=5; x++)
		{
			for(int y= 1; y<=x; y++)
			{
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("*********************************");
		System.out.println("*********************************");
		
		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
		
		
		output(6,5);
	}
	
	public static void output(int a,int b)
	{
		for(int x=1; x<=a; x++)
		{
			for(int y=x; y<=b; y++)
			{
				System.out.print(" ");
			}
			for(int i=1; i<=x; i++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
