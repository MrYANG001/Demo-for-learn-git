package demo;
/*
 * 十进制转十六进制
 */
public class DecimaltoHex {
	public static void main(String[] args)
	{
		toHex(60);
		
	}
	public static void toHex(int x)
	{
		StringBuffer sb=new StringBuffer();
		//for(int i=0; i<8; i++)
		while(x!=0)
		{
			int temp = x & 15;
			if(temp>9)
			{
				sb.append((char)(temp-10+'A'));
			}
			else
			{
				sb.append(temp);
			}
			x = x>>>4;	
		}
		System.out.println(sb.reverse());
	}
}
