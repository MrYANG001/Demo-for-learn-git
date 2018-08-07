package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IODemo {
	public static void main(String[] args)
	{
		String[] content = {"�þò���","�������","����ϵ"};
		File file = new File("word.txt");
		try
		{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bufw = new BufferedWriter(fw);
			for(String s: content)
			{
				bufw.write(s);
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader bufr = new BufferedReader(fr);
			String s = null;
			int i = 0;
			while((s = bufr.readLine())!= null)
			{
				i++;
				System.out.println("��"+i+"�У�"+ s);
			}
			bufr.close();
			fr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
